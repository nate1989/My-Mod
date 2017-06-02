package metalgemcraft.tabs;

import metalgemcraft.init.item.ids.gems.GIDs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Tab {
	
	public static final CreativeTabs MGC = new CreativeTabs("MetalGemCraft")
	{
		@SideOnly(Side.CLIENT)
    	public ItemStack getTabIconItem(){ 
    		return new ItemStack(GIDs.rainbow);
    	}
    };
} 