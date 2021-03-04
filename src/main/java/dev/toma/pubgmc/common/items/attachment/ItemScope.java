package dev.toma.pubgmc.common.items.attachment;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemScope extends ItemAttachment implements Scope {

    final ScopeData data;

    public ItemScope(String name, ScopeData data) {
        super(name);
        this.data = data;
    }

    @Override
    public AttachmentType<?> getType() {
        return AttachmentType.SCOPE;
    }

    @Override
    public int getZoom(int fov) {
        return Math.min(fov, data.getZoom());
    }

    @Override
    public float getMouseSensMultiplier() {
        return data.getMouseSens();
    }

    public ScopeData getData() {
        return data;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        int fov = this.getZoom((int) Minecraft.getMinecraft().gameSettings.fovSetting);
        tooltip.add(formatProperty("FOV", fov + ""));
    }
}