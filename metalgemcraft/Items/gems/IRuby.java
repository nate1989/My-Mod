package metalgemcraft.Items.gems;
 
import java.util.List;

import metalgemcraft.Ref;
import metalgemcraft.tabs.Tab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
 
public class IRuby extends Item {
 
    public IRuby() {
    	setUnlocalizedName("ruby");
    	setRegistryName("IRuby");
    	setCreativeTab(Tab.MGC);
    }
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S0);
		dataList.add(TextFormatting.RED + Ref.A3);
		dataList.add(TextFormatting.DARK_GRAY + Ref.S1);
		dataList.add(TextFormatting.RED + Ref.A2);
		dataList.add(TextFormatting.DARK_GRAY + Ref.S2);
		dataList.add(TextFormatting.RED + Ref.A1);
    }
}