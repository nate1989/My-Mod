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

public class ICopperSwordRuby extends ItemSword {

	public ICopperSwordRuby(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Ref.MGCItems.ECTSWR.getUnlocalizedName());
		setRegistryName(Ref.MGCItems.ECTSWR.getRegistry());
		setCreativeTab(Tab.MGC);
	}
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S1);
    	dataList.add(TextFormatting.RED + Ref.S4);
    	dataList.add(TextFormatting.RED + Ref.A3);

    }
}
