package metalgemcraft.init.item.ids.gems;

import metalgemcraft.Items.gems.IAmber;
import metalgemcraft.Items.gems.IAmethyst;
import metalgemcraft.Items.gems.IEmerald;
import metalgemcraft.Items.gems.IRainbow;
import metalgemcraft.Items.gems.IRuby;
import metalgemcraft.Items.gems.ISapphire;
import metalgemcraft.Items.gems.ITopaz;
import net.minecraft.item.Item;

public class GIDs {
	//Red
	public static Item ruby;// +2 Damage
    //Orange
    public static Item topaz;// +1 Damage, +1.2 Efficiency
    //Yellow
    public static Item amber; //+2.5 Efficiency
    //Green
    public static Item emerald;// +1.2 Efficiency,+250 Uses
    //Blue
    public static Item sapphire; //+500 Uses
    //Purple
    public static Item amethyst; //+250 Uses, +1 Damage
    //Rainbow
    public static Item rainbow; //+1 Harvest, +5 Damage, +4 Efficiency, +1000 Uses

	public static void ids(){
		ruby = new IRuby();
		topaz = new ITopaz();
		amber = new IAmber();
		emerald = new IEmerald();
		sapphire = new ISapphire();
		amethyst = new IAmethyst();
		rainbow = new IRainbow();
	}

}
