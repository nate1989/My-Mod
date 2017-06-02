package metalgemcraft.init.item.ids.copper.tools.shovel;

import metalgemcraft.Items.copper.ore.ICopperBar;
import metalgemcraft.Items.copper.ore.ICopperOre;
import metalgemcraft.Items.copper.tools.hoe.ICopperHoe;
import metalgemcraft.Items.copper.tools.shovel.ICopperShovel;
import metalgemcraft.Items.gems.IRuby;
import metalgemcraft.Items.gems.ITopaz;
import metalgemcraft.init.item.ids.copper.tools.CI;
import net.minecraft.item.Item;

public class CSIDs {
	public static Item coppershovel;
	public static void ids(){
		coppershovel = new ICopperShovel(CI.C, 0, 0);
	}
}
