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
 
public class IEmerald extends Item {
 
    public IEmerald() {
    	setUnlocalizedName("emerald");
    	setRegistryName("IEmerald");
    	setCreativeTab(Tab.MGC);
    }
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S1);
    	dataList.add(TextFormatting.YELLOW + Ref.E2);
		dataList.add(TextFormatting.BLUE + Ref.D2);
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S2);
		dataList.add(TextFormatting.YELLOW + Ref.E1);
		dataList.add(TextFormatting.BLUE + Ref.D1);
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S3);
		dataList.add(TextFormatting.YELLOW + Ref.E0);
		dataList.add(TextFormatting.BLUE + Ref.D0);
    }
}