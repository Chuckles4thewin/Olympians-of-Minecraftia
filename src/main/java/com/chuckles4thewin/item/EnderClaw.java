package com.chuckles4thewin.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class EnderClaw 
{
	public static void mainRegistry()
	{
		initializeItem();
		registerItem();
	}
	
	public static Item enderClaw;
	
	public static void initializeItem()
	{
		enderClaw = new Item().setUnlocalizedName("enderClaw").setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public static void registerItem()
	{
		GameRegistry.registerItem(enderClaw, "Ender Dragon Claw");
	}
}
