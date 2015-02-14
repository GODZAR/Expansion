package com.expansion.items;



import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.expansion.creativetab.CreativeTab;
import com.expansion.main.Main;

public class ItemList {

	public static void MainRegistry(){
		ItemsInit();
		ItemRegister();
	}


	//tools
	public static Item IronSaw;
	public static Item IronKitchenKnife;
	
	
	//Materials
	public static Item IngotCopper;
	public static Item IngotTin;
	public static Item IngotSilver;
	public static Item IngotUranium;	
	public static Item IngotBronze;
	
	public static Item BronzeDust;
	public static Item CopperDust;
	public static Item TinDust;
	public static Item IronDust;
	public static Item GoldDust;
	public static Item SilverDust;
	
	public static Item PaperStack;
	public static Item BlankTNTStick;
	public static Item TNTSticks;
	
	//Food
	public static Item SliceBread;
	
	public static void ItemsInit(){
		//materials
		IngotCopper = new ItemCommonCopper().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("CopperIngot");
		IngotTin = new ItemCommonCopper().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("TinIngot");
		IngotSilver = new ItemUncommonSilver().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("SilverIngot");
		IngotUranium = new ItemRareUranium().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("UraniumIngot");
		IngotBronze = new ItemUncommonSilver().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("BronzeIngot");
		BronzeDust = new ItemUncommonSilver().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("BronzeDust");
		IronDust = new Item().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("IronDust");
		GoldDust = new Item().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("GoldDust");
		TinDust = new ItemCommonCopper().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("TinDust");
		CopperDust = new ItemCommonCopper().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("CopperDust");
		SilverDust = new ItemCommonCopper().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("SilverDust");
		PaperStack = new ItemCommonCopper().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("PaperStack");
		BlankTNTStick = new ItemCommonCopper().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("BlankTNTStick");
		TNTSticks = new ItemCommonStick().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("TNTSticks");
		
		//tools
		IronKitchenKnife = new ToolIronSaw().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("IronKitchenKnife");
		IronSaw = new ToolIronSaw().setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("IronSaw");
		
		//Foods
		SliceBread = new Food1(1, 0.125f, false).setCreativeTab(CreativeTab.ExpansionTab).setUnlocalizedName("SliceBread");
	}
	public static void ItemRegister(){
		
		//materials
		GameRegistry.registerItem(IngotCopper, IngotCopper.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(IngotTin, IngotTin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(IngotSilver, IngotSilver.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(IngotUranium, IngotUranium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(IngotBronze, IngotBronze.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BronzeDust, BronzeDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(IronDust, IronDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(GoldDust, GoldDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinDust, TinDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CopperDust,CopperDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverDust, SilverDust.getUnlocalizedName().substring(5));	
		GameRegistry.registerItem(PaperStack, PaperStack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BlankTNTStick, BlankTNTStick.getUnlocalizedName().substring(5));
		//tools
		GameRegistry.registerItem(IronSaw, IronSaw.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(IronKitchenKnife, IronKitchenKnife.getUnlocalizedName().substring(5));
		
		
		
		//Usable
		GameRegistry.registerItem(TNTSticks, TNTSticks.getUnlocalizedName().substring(5));
		
		//Food
		GameRegistry.registerItem(SliceBread, SliceBread.getUnlocalizedName().substring(5));
	}
	public static void RegisterRender(){
		
		GetItemIcon(IngotCopper);
		GetItemIcon(IngotTin);
		GetItemIcon(IngotSilver);
		GetItemIcon(IngotUranium);
		GetItemIcon(IngotBronze);		
		GetItemIcon(BronzeDust);
		GetItemIcon(IronDust);
		GetItemIcon(GoldDust);
		GetItemIcon(TinDust);
		GetItemIcon(CopperDust);
		GetItemIcon(SilverDust);		
		GetItemIcon(IronSaw);
		GetItemIcon(IronKitchenKnife);		
		GetItemIcon(PaperStack);
		GetItemIcon(BlankTNTStick);
		GetItemIcon(TNTSticks);
		GetItemIcon(SliceBread);

		
		
	}
	
	public static void GetItemIcon(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.modID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
