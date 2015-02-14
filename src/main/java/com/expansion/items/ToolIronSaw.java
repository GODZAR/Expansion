package com.expansion.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ToolIronSaw extends Item{

	protected ToolIronSaw( ) {
		super();
		this.setMaxDamage(200);
		this.maxStackSize = 1;
	}
	
	@Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return stack.getItemDamage()<200;
    }
    
	@Override
    public ItemStack getContainerItem(ItemStack stack){
    	if(stack.attemptDamageItem(1, itemRand)){
    		return null;
    	}
    	
    		return stack;
    }
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean Adva){
		
		list.add(EnumChatFormatting.WHITE + "Type: " + EnumChatFormatting.WHITE + "Tool");
		list.add(EnumChatFormatting.WHITE + "Rarity: " + EnumChatFormatting.WHITE + "Common");
		list.add(EnumChatFormatting.WHITE + "Usage: " + EnumChatFormatting.WHITE + "Crafting");
	}
}
