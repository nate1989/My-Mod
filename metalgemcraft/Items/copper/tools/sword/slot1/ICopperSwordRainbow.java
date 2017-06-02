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

public class ICopperSwordRainbow extends ItemSword {

	public ICopperSwordRainbow(ToolMaterial material) {
		super(material);
		//setUnlocalizedName(Ref.MGCItems.ECTSWRA.getUnlocalizedName());
		setUnlocalizedName("copperswordrainbow");
		setRegistryName("ICopperSwordRainbow");
		//setRegistryName(Ref.MGCItems.ECTSWRA.getRegistry());
		setCreativeTab(Tab.MGC);
	}
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S1);
    	dataList.add((TextFormatting.RED + Ref.S10)+(TextFormatting.GOLD + Ref.S11)+(TextFormatting.YELLOW + Ref.S12)+(TextFormatting.GREEN + Ref.S13)+(TextFormatting.BLUE + Ref.S14)+(TextFormatting.DARK_PURPLE + Ref.S15));
    	dataList.add(TextFormatting.LIGHT_PURPLE + Ref.H0);
		dataList.add(TextFormatting.RED + Ref.A4);
		dataList.add(TextFormatting.YELLOW + Ref.E4);
		dataList.add(TextFormatting.BLUE + Ref.D4);
    	

    }
}
