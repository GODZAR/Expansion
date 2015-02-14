package com.expansion.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.expansion.blocks.BlockList;
import com.expansion.items.ItemList;



public class CraftingManager {

	public static void registerCrafting(){
		
		//Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(ItemList.SliceBread,5), (new ItemStack(ItemList.IronKitchenKnife, 1, OreDictionary.WILDCARD_VALUE)), Items.bread);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemList.BronzeDust,4), ItemList.TinDust, ItemList.CopperDust, ItemList.CopperDust, ItemList.CopperDust);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemList.IngotCopper,9), BlockList.BlockCopper);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemList.IngotSilver,9), BlockList.BlockSilver);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemList.IngotTin,9), BlockList.BlockTin);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemList.IngotUranium,9), BlockList.BlockUranium);
		
		
		//Shaped
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.IronSaw), new Object[]{"XXX", " PP", " PP", 'X', Items.stick, 'P', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.IronKitchenKnife), new Object[]{"X  ", " I ", "   ", 'I', Items.iron_ingot, 'X', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockList.BlockCopper), new Object[]{"XXX", "XXX", "XXX", 'X', ItemList.IngotCopper});
		GameRegistry.addShapedRecipe(new ItemStack(BlockList.BlockSilver), new Object[]{"XXX", "XXX", "XXX", 'X', ItemList.IngotSilver});
		GameRegistry.addShapedRecipe(new ItemStack(BlockList.BlockTin), new Object[]{"XXX", "XXX", "XXX", 'X', ItemList.IngotTin});
		GameRegistry.addShapedRecipe(new ItemStack(BlockList.BlockUranium), new Object[]{"XXX", "XXX", "XXX", 'X', ItemList.IngotUranium});
		;
		
		
		
	}


	
}
