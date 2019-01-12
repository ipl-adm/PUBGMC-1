package com.toma.pubgmc.init;

import com.toma.pubgmc.Pubgmc;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Pubgmc.MOD_ID)
public class PMCItems
{	
	public static final Item BACKPACK1 = null;
	public static final Item BACKPACK2 = null;
	public static final Item BACKPACK3 = null;
	
	public static final Item BANDAGE = null;
	public static final Item FIRSTAIDKIT = null;
	public static final Item MEDKIT = null;
	public static final Item ENERGYDRINK = null;
	public static final Item PAINKILLERS = null;
	public static final Item ADRENALINESYRINGE = null;
	public static final Item IBLOCK = null;
	
	public static final Item GHILLIE_SUIT = null;
	public static final Item NV_GOGGLES = null;
	
	public static final Item FLARE_GUN = null;
	public static final Item P92 = null;
	public static final Item P1911 = null;
	public static final Item R1895 = null;
	public static final Item R45 = null;
	public static final Item P18C = null;
	
	public static final Item WIN94 = null;
	
	public static final Item SAWED_OFF = null;
	public static final Item S1897 = null;
	public static final Item S686 = null;
	public static final Item S12K = null;
	
	public static final Item MICROUZI = null;
	public static final Item UMP9 = null;
	public static final Item VECTOR = null;
	public static final Item TOMMY_GUN = null;
	
	public static final Item M16A4 = null;
	public static final Item M416 = null;
	public static final Item SCAR_L = null;
	public static final Item QBZ = null;
	public static final Item AUG = null;
	public static final Item AKM = null;
	public static final Item BERYL_M762 = null;
	public static final Item MK47_MUTANT = null;
	public static final Item GROZA = null;
	
	public static final Item DP28 = null;
	public static final Item M249 = null;
	
	public static final Item VSS = null;
	public static final Item MINI14 = null;
	public static final Item QBU = null;
	public static final Item SKS = null;
	public static final Item SLR = null;
	public static final Item MK14 = null;
	
	public static final Item KAR98K = null;
	public static final Item M24 = null;
	public static final Item AWM = null;
	
	public static final Item GRENADE = null;
	public static final Item SMOKE = null;
	public static final Item MOLOTOV = null;
	
	public static final Item AMMO_9MM = null;
	public static final Item AMMO_45ACP = null;
	public static final Item AMMO_SHOTGUN = null;
	public static final Item AMMO_556 = null;
	public static final Item AMMO_762 = null;
	public static final Item AMMO_300M = null;
	public static final Item AMMO_FLARE = null;
	
	public static final Item CASE1 = null;
	
	public static final ItemSword PAN = null;
	
	//TODO remove - replace with ghillie suit 
	public static final Item GHILLIEHELMET = null;
	public static final Item GHILLIEBODY = null;
	public static final Item GHILLIELEGS = null;
	public static final Item GHILLIEBOOTS = null;
	
	public static final Item ARMOR1HELMET = null;
	public static final Item ARMOR1BODY = null;
	public static final Item ARMOR2HELMET = null;
	public static final Item ARMOR2BODY = null;
	public static final Item ARMOR3HELMET = null;
	public static final Item ARMOR3BODY = null;
	
	public static final Item BLACK_GLASSES = null;
	public static final Item YELLOW_TSHIRT = null;
	public static final Item GRAY_TOP = null;
	public static final Item BROWN_CAP = null;
	public static final Item WHITE_BOOTS = null;
	public static final Item OFFICIAL_LEGS = null;
	
	public static final Item SILENCER_PISTOL = null;
	public static final Item SILENCER_SMG = null;
	public static final Item SILENCER_AR = null;
	public static final Item SILENCER_SNIPER = null;
	public static final Item COMPENSATOR_SMG = null;
	public static final Item COMPENSATOR_AR = null;
	public static final Item COMPENSATOR_SNIPER = null;
	public static final Item RED_DOT = null;
	public static final Item HOLOGRAPHIC = null;
	public static final Item SCOPE2X = null;
	public static final Item SCOPE4X = null;
	public static final Item SCOPE8X = null;
	public static final Item SCOPE15X = null;
	public static final Item GRIP_VERTICAL = null;
	public static final Item GRIP_ANGLED = null;
	public static final Item QUICKDRAW_MAG_PISTOL = null;
	public static final Item EXTENDED_MAG_PISTOL = null;
	public static final Item EXTENDED_QUICKDRAW_MAG_PISTOL = null;
	public static final Item QUICKDRAW_MAG_SMG = null;
	public static final Item EXTENDED_MAG_SMG = null;
	public static final Item EXTENDED_QUICKDRAW_MAG_SMG = null;
	public static final Item QUICKDRAW_MAG_AR = null;
	public static final Item EXTENDED_MAG_AR = null;
	public static final Item EXTENDED_QUICKDRAW_MAG_AR = null;
	public static final Item QUICKDRAW_MAG_SNIPER = null;
	public static final Item EXTENDED_MAG_SNIPER = null;
	public static final Item EXTENDED_QUICKDRAW_MAG_SNIPER = null;
	public static final Item BULLET_LOOPS_SHOTGUN = null;
	public static final Item BULLET_LOOPS_SNIPER = null;
	public static final Item CHEEKPAD = null;
	
	public static final Item PARACHUTE = null;
	
	public static final Item STEEL_DUST = null;
	public static final Item STEEL_INGOT = null;
	public static final Item COPPER_INGOT = null;
	
	public static final Item VEHICLE_TEST = null;
	
	
	/** ============ OLD STUFF ====================================*/
	/*
//Attachments
	public static final Item QUICKDRAW_PISTOL_MAGAZINE = new ItemAttachment("quickdraw_pistol_magazine", Type.MAGAZINE, GunType.PISTOL);
	public static final Item EXTENDED_PISTOL_MAGAZINE = new ItemAttachment("extended_pistol_magazine", Type.MAGAZINE, GunType.PISTOL);
	public static final Item EXQUICKDRAW_PISTOL_MAGAZINE = new ItemAttachment("exquickdraw_pistol_magazine", Type.MAGAZINE, GunType.PISTOL);
	public static final Item QUICKDRAW_SMG_MAGAZINE = new ItemAttachment("quickdraw_smg_magazine", Type.MAGAZINE, GunType.SMG);
	public static final Item EXTENDED_SMG_MAGAZINE = new ItemAttachment("extended_smg_magazine", Type.MAGAZINE, GunType.SMG);
	public static final Item EXQUICKDRAW_SMG_MAGAZINE = new ItemAttachment("exquickdraw_smg_magazine", Type.MAGAZINE, GunType.SMG);
	public static final Item QUICKDRAW_AR_MAGAZINE = new ItemAttachment("quickdraw_ar_magazine", Type.MAGAZINE, GunType.AR);
	public static final Item EXTENDED_AR_MAGAZINE = new ItemAttachment("extended_ar_magazine", Type.MAGAZINE, GunType.AR);
	public static final Item EXQUICKDRAW_AR_MAGAZINE = new ItemAttachment("exquickdraw_ar_magazine", Type.MAGAZINE, GunType.AR);
	public static final Item QUICKDRAW_SR_MAGAZINE = new ItemAttachment("quickdraw_sr_magazine", Type.MAGAZINE, GunType.SR);
	public static final Item EXTENDED_SR_MAGAZINE = new ItemAttachment("extended_sr_magazine", Type.MAGAZINE, GunType.SR);
	public static final Item EXQUICKDRAW_SR_MAGAZINE = new ItemAttachment("exquickdraw_sr_magazine", Type.MAGAZINE, GunType.SR);
	
	public static final Item GRIP_VERTICAL = new ItemAttachment("grip_vertical", Type.GRIP, GunType.AR);
	public static final Item GRIP_ANGLED = new ItemAttachment("grip_angled", Type.GRIP, GunType.AR);
	
	public static final Item SILENCER_PISTOL = new ItemAttachment("silencer_pistol", Type.BARREL, GunType.PISTOL);
	public static final Item SILENCER_SMG = new ItemAttachment("silencer_smg", Type.BARREL, GunType.SMG);
	public static final Item SILENCER_AR = new ItemAttachment("silencer_ar", Type.BARREL, GunType.AR);
	public static final Item SILENCER_SR = new ItemAttachment("silencer_sr", Type.BARREL, GunType.SR);
	public static final Item COMPENSATOR_SMG = new ItemAttachment("compensator_smg", Type.BARREL, GunType.SMG);
	public static final Item COMPENSATOR_AR = new ItemAttachment("compensator_ar", Type.BARREL, GunType.AR);
	public static final Item COMPENSATOR_SR = new ItemAttachment("compensator_sr", Type.BARREL, GunType.SR);
	
	public static final Item SCOPE_REDDOT = new ItemAttachment("scope_reddot", Type.SCOPE, GunType.AR);
	public static final Item SCOPE_HOLO = new ItemAttachment("scope_holo", Type.SCOPE, GunType.AR);
	public static final Item SCOPE_2X = new ItemAttachment("scope_2x", Type.SCOPE, GunType.AR);
	public static final Item SCOPE_4X = new ItemAttachment("scope_4x", Type.SCOPE, GunType.AR);
	public static final Item SCOPE_8X = new ItemAttachment("scope_8x", Type.SCOPE, GunType.AR);
	
	public static final Item CHEEKPAD = new ItemAttachment("cheekpad", Type.STOCK, GunType.AR);
	public static final Item BULLET_LOOPS = new ItemAttachment("bullet_loops", Type.STOCK, GunType.SHOTGUN);
	public static final Item BULLET_LOOPS_SR = new ItemAttachment("bullet_loops_sr", Type.STOCK, GunType.SR);
*/
}