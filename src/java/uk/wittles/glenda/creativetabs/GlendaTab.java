package uk.wittles.glenda.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import uk.wittles.glenda.init.ModItems;

public class GlendaTab extends CreativeTabs{

	public GlendaTab() {
		
		super("GlendaTab");
		
	}

	@Override
	public Item getTabIconItem() {
		
		return ModItems.rubberDucky;
		
	}

	
}
