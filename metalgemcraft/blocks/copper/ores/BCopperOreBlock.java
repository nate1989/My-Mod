package metalgemcraft.blocks.copper.ores;

import java.util.Random;

import metalgemcraft.Ref;
import metalgemcraft.init.item.ids.copper.ore.COIDs;
import metalgemcraft.init.item.ids.gems.GIDs;
import metalgemcraft.tabs.Tab;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BCopperOreBlock extends BlockOre {
	public BCopperOreBlock(){
    	setHardness(4.0F);
    	setResistance(50.0F);
    	setSoundType(SoundType.STONE);
    	setUnlocalizedName(Ref.MGCBlocks.ECOB.getUnlocalizedName());
    	setRegistryName(Ref.MGCBlocks.ECOB.getRegistry());
    	setCreativeTab(Tab.MGC);
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
            int value = rand.nextInt(100);
            
            if(value < 2) // 2 % chance
                return GIDs.topaz.setUnlocalizedName("topaz");
            else // 98% chance
                    return COIDs.copperore.setUnlocalizedName("copperore");
    }

}
