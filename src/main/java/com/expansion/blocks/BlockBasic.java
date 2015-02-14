package com.expansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block{

	protected BlockBasic( ) {
		super(Material.rock);
		this.setHardness(2f);
		this.setResistance(5f);	
	}

}
