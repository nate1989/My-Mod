package metalgemcraft.init.item.ids.copper.tools.sword;

import metalgemcraft.Items.copper.tools.sword.ICopperSword;
import metalgemcraft.init.item.ids.copper.tools.CI;
import net.minecraft.item.Item;

public class CSWIDs {
	public static Item coppersword;
	public static void ids(){
		coppersword = new ICopperSword(CI.C, 1.0F, 3.0F);
	}
}
