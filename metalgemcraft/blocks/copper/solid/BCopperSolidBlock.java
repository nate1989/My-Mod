package metalgemcraft.blocks.copper.solid;

import metalgemcraft.Ref;
import metalgemcraft.tabs.Tab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BCopperSolidBlock extends Block {
	
	public BCopperSolidBlock(Material materialIn) {
		super(materialIn);
    	setHardness(4.0F);
    	setResistance(50.0F);
    	setSoundType(SoundType.METAL);
    	setUnlocalizedName(Ref.MGCBlocks.ECSB.getUnlocalizedName());
    	setRegistryName(Ref.MGCBlocks.ECSB.getRegistry());
    	setCreativeTab(Tab.MGC);
	}
}
