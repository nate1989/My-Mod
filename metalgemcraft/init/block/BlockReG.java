package metalgemcraft.init.block;

import metalgemcraft.blocks.copper.ores.BCopperOreBlock;
import metalgemcraft.blocks.copper.solid.BCopperSolidBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockReG {
	
	//Copper
    public static Block copperoreblock;
    public static Block coppersolidblock;
    //Tin
    public static Block tinoreblock;
    public static Block tinsolidblock;
    //Bronze
    public static Block bronzesolidblock;
    //Silver
    public static Block silveroreblock;
    public static Block silversolidblock;
    //Steel
    public static Block steelsolidblock;
    //Mithril
    public static Block mithriloreblock;
    public static Block mithrilsolidblock;
    //NetherIron
    public static Block netherironshardblock;
    public static Block netherironsolidblock;
    public static Block netherquartzsolidblock;
    //Wither
    public static Block withershardblock;
    public static Block withersolidblock;
    //Rainbow
    public static Block rainbowgemblock;

	/*public static void init(){
		
		//Copper
		copperoreblock = new BCopperOreBlock();
		coppersolidblock = new BCopperSolidBlock(Material.ROCK);
    	//Tin
		tinoreblock = new BTinOreBlock();
		tinsolidblock = new BTinSolidBlock();
    	//Bronze
		bronzesolidblock = new BBronzeSolidBlock();
    	//Silver
		silveroreblock = new BSilverOreBlock();
		silversolidblock = new BSilverSolidBlock();
    	//Steel
		steelsolidblock = new BSteelSolidBlock();
		//Mithril
    	mithriloreblock = new BMithrilOreBlock();
    	mithrilsolidblock = new BMithrilSolidBlock();
    	//NetherIron
    	netherironshardblock = new BNetherIronsShardBblock();
    	netherironsolidblock = new BNetherIronSolidBlock();
    	netherquartzsolidblock = new BNetherQuartzSolidBlock();
    	//Wither
    	withershardblock = new BWitherShardBlock();
    	withersolidblock = new BWitherSolidBlock();
    	//Rainbow
    	rainbowgemblock = new BRainbowGemBlock();
	}*/
	public static void reg(){
		//Copper
		//GameRegistry.register(copperoreblock);
		//GameRegistry.register(coppersolidblock);
		//Tin
		GameRegistry.register(tinoreblock);
		GameRegistry.register(tinsolidblock);
		//Bronze
		GameRegistry.register(bronzesolidblock);
		//Silver
		GameRegistry.register(silveroreblock);
		GameRegistry.register(silversolidblock);
		//Steel
		GameRegistry.register(steelsolidblock);
		//Mithril
		GameRegistry.register(mithriloreblock);
		GameRegistry.register(mithrilsolidblock);
		//NetherIron
		GameRegistry.register(netherironshardblock);
		GameRegistry.register(netherironsolidblock);
		GameRegistry.register(netherquartzsolidblock);
		//Wither
		GameRegistry.register(withershardblock);
		GameRegistry.register(withersolidblock);
    	//Rainbow
		GameRegistry.register(rainbowgemblock);

	}
	public static void regRends(){
		//Copper
		regRend(copperoreblock);
		regRend(coppersolidblock);
		//Tin
		regRend(tinoreblock);
		regRend(tinsolidblock);
		//Bronze
		regRend(bronzesolidblock);
		//Steel
		regRend(silveroreblock);
		regRend(silversolidblock);
		//Silver
		regRend(steelsolidblock);
		//Mithril
		regRend(mithriloreblock);
		regRend(mithrilsolidblock);
		//NetherIron
		regRend(netherironshardblock);
		regRend(netherironsolidblock);
		regRend(netherquartzsolidblock);
		//Wither
		regRend(withershardblock);
		regRend(withersolidblock);
		//Rainbow
		regRend(rainbowgemblock);

	}
	private static void regRend(Block block){
		System.out.println(block.getUnlocalizedName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	
	}
}
