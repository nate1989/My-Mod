package metalgemcraft.Items.copper.tools.sword;

import java.util.List;

import com.google.common.collect.Multimap;

import metalgemcraft.Ref;
import metalgemcraft.Items.tool.MGCItemSword;
import metalgemcraft.tabs.Tab;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ICopperSword extends MGCItemSword {
		public ICopperSword(ToolMaterial material, float speed, float damage) {
			super(material, speed, damage);
		setUnlocalizedName("coppersword");
		setRegistryName("ICopperSword");
		setCreativeTab(Tab.MGC);
	}
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S1);
    	dataList.add(TextFormatting.DARK_GRAY + Ref.S0);

    }
}
