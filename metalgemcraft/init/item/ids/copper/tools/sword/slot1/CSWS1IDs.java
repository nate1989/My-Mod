package metalgemcraft.init.item.ids.copper.tools.sword.slot1;

import metalgemcraft.Items.copper.ore.ICopperBar;
import metalgemcraft.Items.copper.ore.ICopperOre;
import metalgemcraft.Items.copper.tools.hoe.ICopperHoe;
import metalgemcraft.Items.copper.tools.sword.ICopperSword;
import metalgemcraft.Items.copper.tools.sword.slot1.ICopperSwordAmber;
import metalgemcraft.Items.copper.tools.sword.slot1.ICopperSwordAmethyst;
import metalgemcraft.Items.copper.tools.sword.slot1.ICopperSwordEmerald;
import metalgemcraft.Items.copper.tools.sword.slot1.ICopperSwordRainbow;
import metalgemcraft.Items.copper.tools.sword.slot1.ICopperSwordRuby;
import metalgemcraft.Items.copper.tools.sword.slot1.ICopperSwordSapphire;
import metalgemcraft.Items.copper.tools.sword.slot1.ICopperSwordTopaz;
import metalgemcraft.Items.gems.IRuby;
import metalgemcraft.Items.gems.ITopaz;
import metalgemcraft.init.item.ids.copper.tools.CI;
import net.minecraft.item.Item;

public class CSWS1IDs {
	public static Item copperswordruby;
	public static Item copperswordtopaz;
	public static Item copperswordamber;
	public static Item copperswordemerald;
	public static Item copperswordsapphire;
	public static Item copperswordamethyst;
	public static Item copperswordrainbow;

	public static void ids(){
		copperswordruby = new ICopperSwordRuby(CI.CR);
		copperswordtopaz = new ICopperSwordTopaz(CI.CT);
		copperswordamber = new ICopperSwordAmber(CI.CA);
		copperswordemerald = new ICopperSwordEmerald(CI.CE);
		copperswordsapphire = new ICopperSwordSapphire(CI.CS);
		copperswordamethyst = new ICopperSwordAmethyst(CI.CAM);
		copperswordrainbow = new ICopperSwordRainbow(CI.CRA);
	}
}
