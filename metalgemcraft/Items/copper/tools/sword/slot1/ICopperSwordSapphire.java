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

public class ICopperSwordSapphire extends ItemSword {

	public ICopperSwordSapphire(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Ref.MGCItems.ECTSWS.getUnlocalizedName());
		setRegistryName(Ref.MGCItems.ECTSWS.getRegistry());
		setCreativeTab(Tab.MGC);
	}
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S1);
    	dataList.add(TextFormatting.BLUE + Ref.S8);
    	dataList.add(TextFormatting.BLUE+ Ref.D3);
    }
}
