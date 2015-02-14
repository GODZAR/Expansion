package com.expansion.main;

import com.expansion.blocks.BlockList;
import com.expansion.items.ItemList;

public class ClientProxy extends ServerProxy{
	@Override
	public void RegisterRender(){
		ItemList.RegisterRender();
		BlockList.RegisterRender();
	}
}
