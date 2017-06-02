package metalgemcraft.Items.copper.ore;

import java.util.List;

import metalgemcraft.Ref;
import metalgemcraft.tabs.Tab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ICopperOre extends Item {
	public ICopperOre(){
	setUnlocalizedName("copperore");
	setRegistryName("ICopperOre");
	setCreativeTab(Tab.MGC);
	}
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add(TextFormatting.DARK_GRAY + Ref.C0);
    	dataList.add(TextFormatting.DARK_GRAY + Ref.CT0);
    	dataList.add(TextFormatting.DARK_GRAY + Ref.CT1);
    }
}
