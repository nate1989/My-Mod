package metalgemcraft.Items.copper.tools.pickaxe.slot1;

import java.util.List;

import metalgemcraft.Ref;
import metalgemcraft.Items.tool.MGCItemPickaxe;
import metalgemcraft.tabs.Tab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ICopperPickaxeRuby extends MGCItemPickaxe {

	public ICopperPickaxeRuby(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName("copperpickaxeruby");
		setRegistryName("ICopperPickaxeRuby");
		setCreativeTab(Tab.MGC);
	}
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S1);
    	dataList.add(TextFormatting.RED + Ref.S4);
    	dataList.add(TextFormatting.RED + Ref.A3);

    }
}
