package com.chuckles4thewin.item;

import com.chuckles4thewin.Main.OlympiansOfMinecraftiaTab;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EnderDragonGem 
{
	public static void mainRegistry()
	{
		initializeItem();
		registerItem();
	}
	
	public static Item enderGem;
	
	public static void initializeItem()
	{
		enderGem = new Item().setUnlocalizedName("enderGem").setCreativeTab(OlympiansOfMinecraftiaTab.tabMaterials);
	}
	
	public static void registerItem()
	{
		GameRegistry.registerItem(enderGem, "Ender Dragon Gem");
	}
}
