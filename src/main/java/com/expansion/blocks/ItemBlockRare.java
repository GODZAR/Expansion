package com.expansion.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemBlockRare extends ItemBlock{

	public ItemBlockRare(Block block) {
		super(block);
		
	}

	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean Adva){
		
		list.add(EnumChatFormatting.WHITE + "Type: " + EnumChatFormatting.WHITE + "Material");
		list.add(EnumChatFormatting.WHITE + "Rarity: " + EnumChatFormatting.YELLOW + "Rare");
		list.add(EnumChatFormatting.WHITE + "Usage: " + EnumChatFormatting.WHITE + "Crafting");
	}
}
