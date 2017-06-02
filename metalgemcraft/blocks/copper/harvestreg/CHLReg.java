package metalgemcraft.blocks.copper.harvestreg;

import metalgemcraft.init.block.ids.copper.ore.COBIDs;
import metalgemcraft.init.block.ids.copper.solid.CSBIDs;

public class CHLReg {
	public static void Blocks() {
		
		//Copper
		COBIDs.copperoreblock.setHarvestLevel( "pickaxe", 1);
		CSBIDs.coppersolidblock.setHarvestLevel( "pickaxe", 1);
	}
}
