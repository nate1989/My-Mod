package metalgemcraft.init.block.ids.copper.solid;

import metalgemcraft.blocks.copper.ores.BCopperOreBlock;
import metalgemcraft.blocks.copper.solid.BCopperSolidBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CSBIDs {
	
    public static Block coppersolidblock;

public static void ids(){
	coppersolidblock = new BCopperSolidBlock(Material.ROCK);
	}

}
