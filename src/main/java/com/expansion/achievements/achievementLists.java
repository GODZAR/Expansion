package com.expansion.achievements;

import com.expansion.achievementsEvents.AchievementEvents;
import com.expansion.blocks.BlockList;

import net.minecraft.stats.Achievement;
import net.minecraft.stats.StatBase;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class achievementLists {

	
	
	
	public static void MainRegistry(){
		
		
		
		
		AchievementPage.registerAchievementPage(new AchievementPage("Expansion: Overhaul", new Achievement[]{}));
		
		FMLCommonHandler.instance().bus().register(new AchievementEvents());
	}
	
	
	
	
}
