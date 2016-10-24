package com.chuckles4thewin.Main;

import com.chuckles4thewin.item.EnderDragonGem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OlympiansOfMinecraftiaTab extends CreativeTabs
{

	public OlympiansOfMinecraftiaTab() 
	{
		super("tabOlympians of Minecraftia");
	
	}

	@Override
	public Item getTabIconItem() 
	{
		return EnderDragonGem.enderGem;
	}

}
