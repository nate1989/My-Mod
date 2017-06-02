package metalgemcraft;

import metalgemcraft.init.block.ids.copper.ore.COBIDs;
import metalgemcraft.init.block.ids.copper.solid.CSBIDs;
import metalgemcraft.init.block.reg.copper.ore.COBReg;
import metalgemcraft.init.block.reg.copper.solid.CSBReg;
import metalgemcraft.init.item.ids.copper.ore.COIDs;
import metalgemcraft.init.item.ids.copper.tools.axe.CAIDs;
import metalgemcraft.init.item.ids.copper.tools.hoe.CHIDs;
import metalgemcraft.init.item.ids.copper.tools.pickaxe.CPIDs;
import metalgemcraft.init.item.ids.copper.tools.pickaxe.slot1.CPS1IDs;
import metalgemcraft.init.item.ids.copper.tools.shovel.CSIDs;
import metalgemcraft.init.item.ids.copper.tools.sword.CSWIDs;
import metalgemcraft.init.item.ids.copper.tools.sword.slot1.CSWS1IDs;
import metalgemcraft.init.item.ids.gems.GIDs;
import metalgemcraft.init.item.reg.copper.ore.COReg;
import metalgemcraft.init.item.reg.copper.tools.axe.CAReg;
import metalgemcraft.init.item.reg.copper.tools.hoe.CHReg;
import metalgemcraft.init.item.reg.copper.tools.pickaxe.CPReg;
import metalgemcraft.init.item.reg.copper.tools.pickaxe.slot1.CPS1Reg;
import metalgemcraft.init.item.reg.copper.tools.shovel.CSReg;
import metalgemcraft.init.item.reg.copper.tools.sword.CSWReg;
import metalgemcraft.init.item.reg.copper.tools.sword.slot1.CSWS1Reg;
import metalgemcraft.init.item.reg.gems.GReg;
import metalgemcraft.proxy.ComProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Ref.MID, name = Ref.MN, version = Ref.V)
public class MetalGemCraft{
	
	@Instance
	public static MetalGemCraft instance;
	
    @SidedProxy(clientSide = Ref.CPC, serverSide = Ref.SPC)
    public static ComProxy proxy;

    
    
    
    @Mod.EventHandler
    public void preinit(FMLInitializationEvent event)
    {
  //IDs
   //Blocks
    //Copper
    	//Ore
    	COBIDs.ids();
    	//Solid
    	CSBIDs.ids();
   //Items
    	//Gems
    	GIDs.ids();
    //Copper
    	//Ar
    	//Ores
    	COIDs.ids();
     //Tools
    	//Hoes
    	CHIDs.ids();
    	//Swords
    	CSWIDs.ids();
    	//SwordsSlot1
    	CSWS1IDs.ids();
    	//Pickaxes
    	CPIDs.ids();
    	//PikaxesSlot1
    	CPS1IDs.ids();
    	//Axes
    	CAIDs.ids();
		//Shovel
    	CSIDs.ids();
    	
  //Reg
   //Blocks
    	//Copper
    	COBReg.reg();
    	CSBReg.reg();
   //Items
    	//Gems
    	GReg.reg();
    //Copper
    	//Ore
    	COReg.reg();
     //Tools
    	//Hoes
    	CHReg.reg();
    	//Swords
    	CSWReg.reg();
    	//SwordsSlot1
    	CSWS1Reg.reg();
    	//Pickaxes
    	CPReg.reg();
    	//PckaxesSlot1
    	CPS1Reg.reg();
    	//Axes
    	CAReg.reg();
    	//Shovel
    	CSReg.reg();
    	//Renders
    	proxy.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @Mod.EventHandler
    public void postinit(FMLInitializationEvent event)
    {
    	
    }
}
