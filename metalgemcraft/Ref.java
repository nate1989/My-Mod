package metalgemcraft;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;

public class Ref {
	//ModID
	public static final String MID = "metalgemcraft";
	public static final String MN = "MetalGemCraft";
	public static final String V = "1.11.2";
	//Server&ClientProxys
	public static final String CPC = "metalgemcraft.proxy.ClProxy";
	public static final String SPC = "metalgemcraft.proxy.SerProxy";
	//GemSlots
	public static final String S0 = "(Empty)";
	public static final String S1 = "Slot 1";
	public static final String S2 = "Slot 2";
	public static final String S3 = "Slot 3";
	public static final String S4 = "(Ruby)";
	public static final String S5 = "(Topaz)";
	public static final String S6 = "(Amber)";
	public static final String S7 = "(Emerald)";
	public static final String S8 = "(Sapphire)";
	public static final String S9 = "(Amethyst)";
	public static final String S10 = "(P";
	public static final String S11 = "ri";
	public static final String S12 = "sm";
	public static final String S13 = "a";
	public static final String S14 = "ti";
	public static final String S15 = "c)";


	//
	//ToolEfficiencyBonus 
	public static final String E0 = "+0.30 Speed";
	public static final String E1 = "+0.65 Speed";
	public static final String E2 = "+1.25 Speed";
	public static final String E3= "+2.50 Speed";
	public static final String E4 = "+4 Speed";
	//ToolDurabilityBonus
	public static final String D0 = "+60 Durability";
	public static final String D1 = "+120 Durability";
	public static final String D2 = "+250 Durability";
	public static final String D3 = "+500 Durability";
	public static final String D4 = "+1000 Durability";
	//ToolDamageBonus
	public static final String A0 = "+0.25 Damage";
	public static final String A1 = "+0.50 Damage";
	public static final String A2 = "+1 Damage";
	public static final String A3 = "+2 Damage";
	public static final String A4 = "+5 Damage";
	//ToolHarvestLevelBonus
	public static final String H0 = "+1 Harvest Level";
	//Tin & Copper Notes
	public static final String C0 = "Mix With Tin";
	public static final String T0 = "Mix With Copper Ore";
	public static final String CT0 = "Ore and a Bowl";
	public static final String CT1 = "to Make Bronze Mixtuer";
	//Item Registry
	public static enum MGCItems{
	//CopperTools
	  //Sword
		//Slot1
		ECTSWR("copperswordruby", "ICopperSwordRuby"),
		ECTSWT("copperswordtopaz", "ICopperSwordTopaz"),
		ECTSWA("copperswordamber", "ICopperSwordAmber"),
		ECTSWE("copperswordemerald", "ICopperSwordEmerald"),
		ECTSWS("copperswordsapphire", "ICopperSwordSapphire"),
		ECTSWAM("copperswordamethyst", "ICopperSwordAmethyst"),
		ECTSWRA("copperswordrainbow", "ICopperSwordRainbow");
		private String unlocalizedName;
		private String registryName;
		MGCItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		public String getRegistry(){
			return registryName;
		}
	}
	//Block Registry
	public static enum MGCBlocks{
	//Copper
		//Ore
		ECOB("copperoreblock", "BCopperOreBlock"),
		//Solid
		ECSB("coppersolidblock", "BcopperSolidBlock");
		//Swords
		
		private String unlocalizedName;
		private String registryName;
		MGCBlocks(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		public String getRegistry(){
			return registryName;
		}
	}
}
