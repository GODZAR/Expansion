package com.expansion.recipes;

import java.util.Iterator;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.CraftingManager;

public class RecipesRemoval {

	public static void RecpieRemover(){
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
		Iterator<IRecipe> remover = recipes.iterator();
		
		//removed TNT,books,furnace, Armors, tools recipe
		while(remover.hasNext()){
			ItemStack itemStack = remover.next().getRecipeOutput();
			if(itemStack != null && itemStack.getItem() == Item.getItemFromBlock(Blocks.tnt)){
				
			}
		}					
	}
}

