package metalgemcraft.init.item.ids.copper.tools.axe;

import metalgemcraft.Items.copper.ore.ICopperBar;
import metalgemcraft.Items.copper.ore.ICopperOre;
import metalgemcraft.Items.copper.tools.axe.ICopperAxe;
import metalgemcraft.Items.copper.tools.hoe.ICopperHoe;
import metalgemcraft.Items.gems.IRuby;
import metalgemcraft.Items.gems.ITopaz;
import metalgemcraft.init.item.ids.copper.tools.CI;
import net.minecraft.item.Item;

public class CAIDs {
	public static Item copperaxe;
	public static void ids(){
		copperaxe = new ICopperAxe(CI.C, 8.0F, -3.2F);
	}
}
