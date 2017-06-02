package metalgemcraft.init.item.ids.copper.tools.pickaxe;

import metalgemcraft.Items.copper.ore.ICopperBar;
import metalgemcraft.Items.copper.ore.ICopperOre;
import metalgemcraft.Items.copper.tools.hoe.ICopperHoe;
import metalgemcraft.Items.copper.tools.pickaxe.ICopperPickaxe;
import metalgemcraft.Items.gems.IRuby;
import metalgemcraft.Items.gems.ITopaz;
import metalgemcraft.init.item.ids.copper.tools.CI;
import net.minecraft.item.Item;

public class CPIDs {
	public static Item copperpickaxe;
	public static void ids(){
		copperpickaxe = new ICopperPickaxe(CI.C, 1.0F, -2.8F);
	}
}
