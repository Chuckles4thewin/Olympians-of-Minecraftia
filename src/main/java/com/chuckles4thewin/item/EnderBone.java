package com.chuckles4thewin.item;

import com.chuckles4thewin.Main.MainRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class EnderBone 
{
	public static void mainRegistry()
	{
		initializeItem();
		registerItem();
	}
	
	public static Item enderBone;
	
	public static void initializeItem()
	{
		enderBone = new Item().setUnlocalizedName("enderBone").setCreativeTab(MainRegistry.tabOlympiansofMinecraftia);
	}
	
	public static void registerItem()
	{
		GameRegistry.registerItem(enderBone, "Ender Dragon Bone");
	}
}
