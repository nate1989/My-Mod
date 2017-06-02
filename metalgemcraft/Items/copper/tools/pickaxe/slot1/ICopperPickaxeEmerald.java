package metalgemcraft.Items.copper.tools.pickaxe.slot1;

import java.util.List;

import metalgemcraft.Ref;
import metalgemcraft.Items.tool.MGCItemPickaxe;
import metalgemcraft.tabs.Tab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ICopperPickaxeEmerald extends MGCItemPickaxe {

	public ICopperPickaxeEmerald(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName("copperpickaxeemerald");
		setRegistryName("ICopperPickaxeEmerald");
		setCreativeTab(Tab.MGC);
	}
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S1);
    	dataList.add(TextFormatting.DARK_GREEN + Ref.S7);
    	dataList.add(TextFormatting.YELLOW + Ref.E2);
		dataList.add(TextFormatting.BLUE + Ref.D2);

    }
}
