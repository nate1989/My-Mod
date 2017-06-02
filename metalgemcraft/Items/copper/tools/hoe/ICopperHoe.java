package metalgemcraft.Items.copper.tools.hoe;

import metalgemcraft.tabs.Tab;
import net.minecraft.item.ItemHoe;

public class ICopperHoe extends ItemHoe {

	public ICopperHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("copperhoe");
		setRegistryName("ICopperHoe");
		setCreativeTab(Tab.MGC);	
		}
}
