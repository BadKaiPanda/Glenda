package uk.wittles.glenda.proxy;

import uk.wittles.glenda.init.ModBlocks;
import uk.wittles.glenda.init.ModItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {

		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}
	
}
