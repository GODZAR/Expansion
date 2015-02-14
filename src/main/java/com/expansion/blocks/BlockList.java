package com.expansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.expansion.creativetab.CreativeTab;
import com.expansion.main.Main;

public class BlockList {
	public static void MainRegistry(){
		BlockInit();
		BlockRegister();
	}
	
	
	public static Block OreCopper;
	public static Item ItemBlockCopperOre;
	
	public static Block OreTin;
	public static Item ItemBlockTinOre;
	
	public static Block OreSilver;
	public static Item ItemBlockSilverOre;
	
	public static Block OreUraniunm;
	public static Item ItemBlockUraniumOre;
	
	public static Block BlockCopper;
	public static Item BlockCopperItemBlock;
	
	public static Block BlockTin;
	public static Item BlockTinItemBlock;
	
	public static Block BlockSilver;
	public static Item BlockSilverItemBlock;
	
	public static Block BlockUranium;	
	public static Item BlockUraniumItemBlock;
	
	
	
	public static void BlockInit(){
		
		ItemBlockCopperOre = new ItemBlockOreCommon(OreCopper);
		OreCopper = new BlockCopperOre().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("CopperOre");
				
		ItemBlockTinOre = new ItemBlockOreCommon(OreTin);
		OreTin = new BlockCopperOre().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("TinOre");
		
		ItemBlockSilverOre = new ItemBlockOreUncommon(OreSilver);
		OreSilver = new BlockSilverOre().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("SilverOre");
				
		ItemBlockUraniumOre = new ItemBlockOreRare(OreUraniunm);
		OreUraniunm = new BlockUranoimOre().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("UraniumOre");
				
		
		BlockCopperItemBlock = new ItemBlockCommon(BlockCopper);
		BlockCopper = new BlockBasic().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("BlockCopper");
		
		BlockTinItemBlock = new ItemBlockCommon(BlockCopper);
		BlockTin = new BlockBasic().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("BlockTin");
		
		BlockSilverItemBlock = new ItemBlockUncommon(BlockSilver);	
		BlockSilver = new BlockBasic().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("BlockSilver");
		
		BlockUraniumItemBlock = new ItemBlockRare(BlockUranium);
		BlockUranium = new BlockBasic().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("BlockUranium");
	}
	
	




	public static void BlockRegister(){
		
		
		GameRegistry.registerBlock(OreCopper, ItemBlockOreCommon.class, "CopperOre");
		GameRegistry.registerBlock(OreTin, ItemBlockOreCommon.class, "TinOre");
		GameRegistry.registerBlock(OreSilver, ItemBlockOreUncommon.class, "SilverOre");
		GameRegistry.registerBlock(OreUraniunm, ItemBlockOreRare.class ,"UraniumOre");
		
		GameRegistry.registerBlock(BlockCopper, ItemBlockCommon.class,"BlockCopper");
		GameRegistry.registerBlock(BlockTin, ItemBlockCommon.class,"BlockTin");
		GameRegistry.registerBlock(BlockSilver, ItemBlockUncommon.class, "BlockSilver");
		GameRegistry.registerBlock(BlockUranium, ItemBlockRare.class, "BlockUranium");
		
		
		


	}
	
	public static void RegisterRender(){
		
		GetBlockIcon(OreCopper);
		GetBlockIcon(OreTin);
		GetBlockIcon(OreSilver);
		GetBlockIcon(OreUraniunm);
		
		GetBlockIcon(BlockCopper);
		GetBlockIcon(BlockTin);
		GetBlockIcon(BlockSilver);
		GetBlockIcon(BlockUranium);
		


	}

	public static void GetBlockIcon(Block block){
		
	Item item = Item.getItemFromBlock(block);
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.modID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}	
