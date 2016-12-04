package uk.wittles.glenda;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.wittles.glenda.creativetabs.GlendaTab;
import uk.wittles.glenda.init.ModBlocks;
import uk.wittles.glenda.init.ModItems;
import uk.wittles.glenda.proxy.CommonProxy;
import uk.wittles.glenda.util.Utils;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Glenda {

	public static final CreativeTabs items = new GlendaTab();
	
	
	@Mod.Instance(Reference.MODID)
	public static Glenda instance;
	
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		Utils.getLogger().info("Pre Initialization Event Fired");
		ModItems.init();
		ModBlocks.init();
		ModItems.register();
		ModBlocks.register();
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		Utils.getLogger().info("Initialization Event Fired");
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		Utils.getLogger().info("Post Initialization Event Fired");
		
	}
}
