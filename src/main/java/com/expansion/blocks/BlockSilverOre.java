package com.expansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSilverOre extends Block {

	protected BlockSilverOre( ) {
		super(Material.rock);
		this.setHardness(3f);
		this.setResistance(5f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
