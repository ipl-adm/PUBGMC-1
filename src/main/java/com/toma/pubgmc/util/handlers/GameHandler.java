package com.toma.pubgmc.util.handlers;

import com.toma.pubgmc.Pubgmc;
import com.toma.pubgmc.api.Game;
import com.toma.pubgmc.api.IGameTileEntity;
import com.toma.pubgmc.common.capability.IGameData;
import com.toma.pubgmc.common.capability.IPlayerData;
import com.toma.pubgmc.common.tileentity.TileEntityPlayerCrate;
import com.toma.pubgmc.init.DamageSourceGun;
import com.toma.pubgmc.init.PMCRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.Map;

public class GameHandler {

    @Mod.EventBusSubscriber(Side.CLIENT)
    public static class Client {

        @SubscribeEvent
        public static void onRenderOverlay(RenderGameOverlayEvent.Post e) {
            if(e.getType() == RenderGameOverlayEvent.ElementType.ALL) {
                IGameData gameData = Minecraft.getMinecraft().world.getCapability(IGameData.GameDataProvider.GAMEDATA, null);
                if(gameData.isPlaying() && !gameData.isInactiveGame()) {
                    gameData.getCurrentGame().renderGameInfo(e.getResolution());
                }
            }
        }
    }

    @Mod.EventBusSubscriber
    public static class Common {

        @SubscribeEvent
        public static void onTick(TickEvent.WorldTickEvent e) {
            if(e.phase == TickEvent.Phase.END) {
                return;
            }
            IGameData gameData = e.world.getCapability(IGameData.GameDataProvider.GAMEDATA, null);
            if(!gameData.isPlaying()) {
                return;
            }
            Game game = gameData.getCurrentGame();
            if(gameData.isInactiveGame()) {
                return;
            }
            game.tickGame(e.world);
        }

        @SubscribeEvent
        public static void onChunkLoaded(ChunkEvent.Load e) {
            IGameData gameData = e.getWorld().getCapability(IGameData.GameDataProvider.GAMEDATA, null);
            Game game = gameData.getCurrentGame();
            if(gameData == null || !gameData.isInactiveGame() || !game.shouldUpdateTileEntities()) {
                return;
            }
            Map<BlockPos, TileEntity> map = e.getChunk().getTileEntityMap();
            for(TileEntity tileEntity : map.values()) {
                if(tileEntity instanceof IGameTileEntity) {
                    IGameTileEntity te = (IGameTileEntity)tileEntity;
                    if(!te.getGameHash().equals(gameData.getGameID())) {
                        te.setGameHash(gameData.getGameID());
                        try {
                            te.onLoaded();
                        } catch (Exception ex) {
                            Pubgmc.logger.fatal("Fatal error occurred when updating {}, aborting update!", tileEntity);
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onPlayerKilled(LivingDeathEvent e) {
            IGameData data = e.getEntity().world.getCapability(IGameData.GameDataProvider.GAMEDATA, null);
            Game game = data.getCurrentGame();
            DamageSource source = e.getSource();
            EntityLivingBase entity = e.getEntityLiving();
            EntityLivingBase from;
            ItemStack gun = null;
            boolean wasHeadshot = false;
            if(!(entity instanceof EntityPlayer)) {
                return;
            }
            // to avoid wrong player count when new player instance is created
            if(game.getJoinedPlayers().contains(entity.getUniqueID())) {
                game.getJoinedPlayers().remove(entity.getUniqueID());
                game.updateDataToClients(entity.getEntityWorld());
            }
            if(source instanceof DamageSourceGun) {
                from = (EntityLivingBase) source.getTrueSource();
                gun = ((DamageSourceGun)source).getGun();
                wasHeadshot = ((DamageSourceGun)source).wasHeadshot();
            } else {
                from = source.getTrueSource() instanceof EntityLivingBase ? (EntityLivingBase)source.getTrueSource() : null;
            }
            game.onPlayerKilled((EntityPlayer) entity, from, gun, wasHeadshot);
            boolean createDeathCrate = game.shouldCreateDeathCrate();
            if(createDeathCrate && data.isPlaying()) {
                EntityPlayer player = (EntityPlayer)entity;
                World world = player.world;
                boolean canCreate = !world.getGameRules().getBoolean("keepInventory") && !isEmpty(player.inventory);
                if(canCreate) {
                    BlockPos pos = null;
                    if(world.isAirBlock(player.getPosition())) {
                        pos = player.getPosition();
                    } else {
                        for(int y = 0; y <= 2; y++) {
                            if(pos != null) break;
                            for(int x = -2; x <= 2; x++) {
                                if(pos != null) break;
                                for(int z = -2; z <= 2; z++) {
                                    BlockPos p = new BlockPos(x, y, z);
                                    if(world.isAirBlock(p)) {
                                        pos = p;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    createAndFillDeathCrate(world, pos, player);
                }
            }
        }

        @SubscribeEvent
        public static void onPlayerRespawnEvent(PlayerEvent.PlayerRespawnEvent e) {
            IGameData gameData = e.player.world.getCapability(IGameData.GameDataProvider.GAMEDATA, null);
            Game game = gameData.getCurrentGame();
            boolean canRespawnIntoGame = game.respawnPlayer(e.player);
            if(canRespawnIntoGame) {
                game.getJoinedPlayers().add(e.player.getUniqueID());
                game.updateDataToClients(e.player.world);
            }
        }

        public static void createAndFillDeathCrate(World world, BlockPos pos, EntityPlayer player) {
            if(pos == null) {
                Pubgmc.logger.warn("Couldn't create death crate for {}", player.getDisplayName());
                return;
            }
            world.setBlockState(pos, PMCRegistry.PMCBlocks.PLAYER_CRATE.getDefaultState());
            TileEntityPlayerCrate te = (TileEntityPlayerCrate)world.getTileEntity(pos);
            if(te == null) {
                Pubgmc.logger.fatal("Exception occurred when creating player crate, tile entity is null!");
                return;
            }
            for(int i = 0; i < player.inventory.getSizeInventory(); i++) {
                ItemStack stack = player.inventory.getStackInSlot(i);
                te.setInventorySlotContents(i, stack.copy());
            }
            IPlayerData data = IPlayerData.PlayerData.get(player);
            int backpack = data.getBackpackLevel();
            if(backpack > 0) {
                te.setInventorySlotContents(41, new ItemStack(backpack == 1 ? PMCRegistry.PMCItems.BACKPACK1 : backpack == 2 ? PMCRegistry.PMCItems.BACKPACK2 : PMCRegistry.PMCItems.BACKPACK3));
            }
            if(data.getEquippedNV()) {
                te.setInventorySlotContents(42, new ItemStack(PMCRegistry.PMCItems.NV_GOGGLES));
            }
            player.inventory.clear();
        }

        public static boolean isEmpty(InventoryPlayer inv) {
            for(int i = 0; i < inv.getSizeInventory(); i++) {
                ItemStack stack = inv.getStackInSlot(i);
                if(!stack.isEmpty() && stack.getItem() != PMCRegistry.PMCItems.IBLOCK) {
                    return false;
                }
            }
            return true;
        }
    }
}