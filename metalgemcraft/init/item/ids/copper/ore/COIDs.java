package metalgemcraft.init.item.ids.copper.ore;

import metalgemcraft.Items.copper.ore.ICopperBar;
import metalgemcraft.Items.copper.ore.ICopperOre;
import metalgemcraft.Items.gems.IRuby;
import metalgemcraft.Items.gems.ITopaz;
import net.minecraft.item.Item;

public class COIDs {
	public static Item copperore;
    public static Item copperbar;
	public static void ids(){
		copperore = new ICopperOre();
		copperbar = new ICopperBar();
	}
}
