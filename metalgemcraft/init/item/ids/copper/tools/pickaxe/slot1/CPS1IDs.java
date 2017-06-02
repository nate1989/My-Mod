package metalgemcraft.init.item.ids.copper.tools.pickaxe.slot1;

import metalgemcraft.Items.copper.tools.pickaxe.slot1.ICopperPickaxeAmber;
import metalgemcraft.Items.copper.tools.pickaxe.slot1.ICopperPickaxeAmethyst;
import metalgemcraft.Items.copper.tools.pickaxe.slot1.ICopperPickaxeEmerald;
import metalgemcraft.Items.copper.tools.pickaxe.slot1.ICopperPickaxeRainbow;
import metalgemcraft.Items.copper.tools.pickaxe.slot1.ICopperPickaxeRuby;
import metalgemcraft.Items.copper.tools.pickaxe.slot1.ICopperPickaxeSapphire;
import metalgemcraft.Items.copper.tools.pickaxe.slot1.ICopperPickaxeTopaz;
import metalgemcraft.init.item.ids.copper.tools.CI;
import net.minecraft.item.Item;

public class CPS1IDs {
	public static Item copperpickaxeruby;
	public static Item copperpickaxetopaz;
	public static Item copperpickaxeamber;
	public static Item copperpickaxeemerald;
	public static Item copperpickaxesapphire;
	public static Item copperpickaxeamethyst;
	public static Item copperpickaxerainbow;

	public static void ids(){
		copperpickaxeruby = new ICopperPickaxeRuby(CI.CR, 1.0F, -2.8F);
		copperpickaxetopaz = new ICopperPickaxeTopaz(CI.CT, 1.0F, 0);
		copperpickaxeamber = new ICopperPickaxeAmber(CI.CA, 1.0F, 0);
		copperpickaxeemerald = new ICopperPickaxeEmerald(CI.CE, 1.0F, 0);
		copperpickaxesapphire = new ICopperPickaxeSapphire(CI.CS, 1.0F, -2.8F);
		copperpickaxeamethyst = new ICopperPickaxeAmethyst(CI.CAM, 1.0F, -2.8F);
		copperpickaxerainbow = new ICopperPickaxeRainbow(CI.CRA, 1.0F, 0);
	}
}
