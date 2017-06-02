package metalgemcraft.Items.copper.tools.axe;

import metalgemcraft.tabs.Tab;
import net.minecraft.item.ItemAxe;

public class ICopperAxe extends ItemAxe {

	public ICopperAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName("copperaxe");
		setRegistryName("ICopperAxe");
		setCreativeTab(Tab.MGC);	
	}
}
