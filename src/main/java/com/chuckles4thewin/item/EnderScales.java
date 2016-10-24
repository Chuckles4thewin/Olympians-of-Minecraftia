package com.chuckles4thewin.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class EnderScales 
{
	public static void mainRegistry()
	{
		initializeItem();
		registerItem();
	}
	
	public static Item enderScales;
	
	public static void initializeItem()
	{
		enderScales = new Item().setUnlocalizedName("enderScales").setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public static void registerItem()
	{
		GameRegistry.registerItem(enderScales, "Ender Dragon Scales");
	}
}
