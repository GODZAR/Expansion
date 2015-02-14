package com.expansion.main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.expansion.achievements.achievementLists;
import com.expansion.blocks.BlockList;
import com.expansion.items.ItemList;
import com.expansion.recipes.CraftingManager;
import com.expansion.recipes.RecipesRemoval;
import com.expansion.recipes.SmeltingRegistry;
import com.expansion.worldGen.WorldRegster;
@Mod(modid = Main.modID, name = Main.Name,version= Main.Version)
public class Main {

	
	public static final String modID = "expansion";
	public static final String Name = "Expansion: Overhaul";
	public static final String Version = "Alpha 0.0.5";
	public static final String ClientProxy = "com.expansion.main.ClientProxy";
	public static final String ServerProxy = "com.expansion.main.ServerProxy";
	
	@SidedProxy(clientSide = Main.ClientProxy, serverSide = Main.ServerProxy)
	public static ServerProxy proxy;
	
	@Instance("Main")
	public static Main instance;
	
	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent){
		ItemList.MainRegistry();
		BlockList.MainRegistry();
		WorldRegster.MainRegistry();
	}
	
	@EventHandler
	public void Load(FMLInitializationEvent Event){
		RecipesRemoval.RecpieRemover();	
		CraftingManager.registerCrafting();	
		SmeltingRegistry.RegisterSmelting();
		achievementLists.MainRegistry();
		
		proxy.RegisterRender();
	}
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
}
