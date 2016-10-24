package com.chuckles4thewin.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.chuckles4thewin.item.EnderBone;
import com.chuckles4thewin.item.EnderClaw;
import com.chuckles4thewin.item.EnderDragonGem;
import com.chuckles4thewin.item.EnderScales;
import com.chuckles4thewin.item.ItemEnderAxe;
import com.chuckles4thewin.item.ItemEnderBow;
import com.chuckles4thewin.item.ItemEnderSword;
import com.chuckles4thewin.item.ItemImperialGoldSword;
import com.chuckles4thewin.lib.ReferenceStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ReferenceStrings.MODID , name = ReferenceStrings.NAME , version = ReferenceStrings.VERSION)

public class MainRegistry 
{
	//Ender Items 
	public static Item enderSword;
	public static Item enderAxe;
	public static Item enderBow;
	public static Item enderBone;
	public static Item enderClaw;
	
	public static final Item.ToolMaterial enderWeaponMaterial = EnumHelper.addToolMaterial("enderWeaponMaterial", 1, 2500, 9.0F, 12.0F, 50);
	
	//Scythe
	public static Item richochetScythe;
	
	public static final Item.ToolMaterial necromancerMaterial = EnumHelper.addToolMaterial("necromancerMaterial", 1, 2750, 8.0F, 10.0F, 0);
	
	//Imperial Gold Items
	public static Item imperialSword;
	public static Item imperialSpear;
	public static Item imperialDagger;
	public static Item imperialSwordBlade;
	public static Item imperialShield;
	public static Item imperialGoldIngot;
	
	public static final Item.ToolMaterial imperialGoldMaterial = EnumHelper.addToolMaterial("imperialGoldMaterial", 1, 1500, 4.0F, 8.0F, 100); 
	
	//Celestial Bronze Items
	public static Item bronzeSword;
	public static Item bronzeSpear;
	public static Item bronzeLongSword;
	public static Item bronzeLongSwordBlade;
	public static Item bronzeBattleAxe;
	public static Item bronzeBow;
	public static Item celestialBronzeIngot;
	
	@SidedProxy(clientSide = ReferenceStrings.CLIENTSIDE , serverSide = ReferenceStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	public static final CreativeTabs tabOlympiansofMinecraftia = new OlympiansOfMinecraftiaTab();
	
	@EventHandler
	public static void Preload(FMLPreInitializationEvent PreEvent)
	{
		//materials / mob drops
		EnderDragonGem.mainRegistry();
		EnderScales.mainRegistry();
		EnderBone.mainRegistry();
		EnderClaw.mainRegistry();
		
		//tools
		enderSword = new ItemEnderSword(enderWeaponMaterial).setUnlocalizedName("Itemendersword").setTextureName("olympiansofminecraftia:itemendersword");
		enderAxe = new ItemEnderAxe(enderWeaponMaterial).setUnlocalizedName("enderAxe").setTextureName("olympiansofminecraftia:itemenderaxe");
		enderBow = new ItemEnderBow(enderWeaponMaterial).setUnlocalizedName("enderBow").setTextureName("olympiansofminecraftia:itemenderbow");
		
		GameRegistry.registerItem(enderSword, enderSword.getUnlocalizedName().substring(3));
		
		imperialSword = new ItemImperialGoldSword(imperialGoldMaterial).setUnlocalizedName("Itemimperialgoldsword").setTextureName("olympiansofminecraftia:itemimperialsword");
		
		proxy.registerRenderInfo();
	}
	
	public static void load(FMLInitializationEvent event)
	{
		//Ender Weapons Recipes
		GameRegistry.addRecipe(new ItemStack(enderSword), new Object[]{"C",
																	   "C",
																	   "B", 'C', enderClaw, 'B', enderBone});
		
		GameRegistry.addRecipe(new ItemStack(enderAxe), new Object[]{"BB",
			                                                         "BS",
			                                                         " S", 'B', enderBone, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(enderBow), new Object[]{" BS",
			                                                         "B S",
			                                                         " BS", 'B', enderBone, 'S', Items.string});
		
		//Imperial Gold Weapons
		GameRegistry.addRecipe(new ItemStack(imperialSword), new Object[]{"I",
			                                                              "I",
			                                                              "S", 'I', imperialGoldIngot, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(imperialSpear), new Object[]{"B",
                                                                          "S",
                                                                          "S", 'B', imperialSwordBlade, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(imperialDagger), new Object[]{"",
                                                                           "I",
                                                                           "S", 'I', imperialGoldIngot, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(imperialSwordBlade), new Object[]{"I",
                                                                                   "I",
                                                                                   "I", 'I', imperialGoldIngot});
		
		GameRegistry.addRecipe(new ItemStack(imperialShield), new Object[]{"III",
                                                                           "ISI",
                                                                           "III", 'I', imperialGoldIngot, 'S', Items.stick});
		
		//Celestial Bronze Weapons and Armor
		GameRegistry.addRecipe(new ItemStack(bronzeSword), new Object[]{"C",
			                                                            "C",
			                                                            "S", 'C', celestialBronzeIngot, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(bronzeSpear), new Object[]{"B",
			                                                            "B",
			                                                            "S", 'B', bronzeLongSwordBlade, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(bronzeLongSword), new Object[]{"B",
			                                                                "B",
			                                                                "S", 'B', bronzeLongSwordBlade, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(bronzeLongSwordBlade), new Object[]{"C",
			                                                                     "C",
			                                                                     "C", 'C', celestialBronzeIngot});
		
		GameRegistry.addRecipe(new ItemStack(bronzeBattleAxe), new Object[]{"CCC",
			                                                                "CSC",
			                                                                " S ", 'C', celestialBronzeIngot, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(bronzeBow), new Object[]{" CS",
			                                                          "C S",
			                                                          " CS", 'C', celestialBronzeIngot, 'S', Items.stick});
		
		
	}
	
	public static void Postload(FMLPostInitializationEvent PostEvent)
	{
		
	}
	
}
