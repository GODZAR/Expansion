package com.expansion.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTab {

	public static CreativeTabs ExpansionTab = new CreativeTabs("Expansion"){
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			return Items.banner;
		}
	};
	
}
