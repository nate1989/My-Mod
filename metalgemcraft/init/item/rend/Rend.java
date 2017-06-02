package metalgemcraft.init.item.rend;

import metalgemcraft.init.item.ids.gems.GIDs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class Rend {
	public static void regRend(Item item){
		System.out.println(item.getUnlocalizedName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	
	}

}
