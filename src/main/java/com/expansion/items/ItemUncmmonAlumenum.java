package com.expansion.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemUncmmonAlumenum extends Item{

	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean Adva){
		
		list.add(EnumChatFormatting.WHITE + "Type: " + EnumChatFormatting.WHITE + "Material");
		list.add(EnumChatFormatting.WHITE + "Rarity: " + EnumChatFormatting.AQUA + "Uncommon");
		list.add(EnumChatFormatting.WHITE + "Usage: " + EnumChatFormatting.WHITE + "Crafting");
	}
}
