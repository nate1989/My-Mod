package metalgemcraft.Items.copper.tools.shovel;

import metalgemcraft.Items.tool.MGCItemSpade;
import metalgemcraft.tabs.Tab;
import net.minecraft.item.Item.ToolMaterial;

public class ICopperShovel extends MGCItemSpade {
	

	public ICopperShovel(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName("coppershovel");
		setRegistryName("ICopperShovel");
		setCreativeTab(Tab.MGC);	
		}
}
