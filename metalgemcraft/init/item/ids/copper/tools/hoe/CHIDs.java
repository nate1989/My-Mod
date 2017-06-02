package metalgemcraft.init.item.ids.copper.tools.hoe;

import metalgemcraft.Items.copper.ore.ICopperBar;
import metalgemcraft.Items.copper.ore.ICopperOre;
import metalgemcraft.Items.copper.tools.hoe.ICopperHoe;
import metalgemcraft.Items.gems.IRuby;
import metalgemcraft.Items.gems.ITopaz;
import metalgemcraft.init.item.ids.copper.tools.CI;
import net.minecraft.item.Item;

public class CHIDs {
	public static Item copperhoe;
	public static void ids(){
		copperhoe = new ICopperHoe(CI.C);
	}
}
