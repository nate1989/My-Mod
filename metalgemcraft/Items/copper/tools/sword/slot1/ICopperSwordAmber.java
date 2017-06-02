package metalgemcraft.Items.copper.tools.sword.slot1;

import java.util.List;

import metalgemcraft.Ref;
import metalgemcraft.tabs.Tab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ICopperSwordAmber extends ItemSword {

	public ICopperSwordAmber(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Ref.MGCItems.ECTSWA.getUnlocalizedName());
		setRegistryName(Ref.MGCItems.ECTSWA.getRegistry());
		setCreativeTab(Tab.MGC);
	}
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S1);
    	dataList.add(TextFormatting.YELLOW + Ref.S6);
    	dataList.add(TextFormatting.YELLOW + Ref.E3);

    }
}
