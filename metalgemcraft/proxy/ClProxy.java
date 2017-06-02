package metalgemcraft.proxy;

import metalgemcraft.init.block.rend.reg.copper.ore.COBRendReg;
import metalgemcraft.init.block.rend.reg.copper.solid.CSBRendReg;
import metalgemcraft.init.item.rend.reg.copper.ore.CORendReg;
import metalgemcraft.init.item.rend.reg.copper.tools.axe.CARendReg;
import metalgemcraft.init.item.rend.reg.copper.tools.hoe.CHRendReg;
import metalgemcraft.init.item.rend.reg.copper.tools.pickaxe.CPRendReg;
import metalgemcraft.init.item.rend.reg.copper.tools.pickaxe.slot1.CPS1RendReg;
import metalgemcraft.init.item.rend.reg.copper.tools.shovel.CSRendReg;
import metalgemcraft.init.item.rend.reg.copper.tools.sword.CSWRendReg;
import metalgemcraft.init.item.rend.reg.copper.tools.sword.slot1.CSWS1RendReg;
import metalgemcraft.init.item.rend.reg.gems.GRendReg;

public class ClProxy implements ComProxy {

	@Override
	public void init() {	
	//Blocks
		//Copper
		COBRendReg.regRends();
		CSBRendReg.regRends();
	//Items
		//Gems
		GRendReg.regRends();
	//Copper
		//Armor
		
		//Ores
		CORendReg.regRends();
	 //Tools
		//Hoes
		CHRendReg.regRends();
		//Swords
    	CSWRendReg.regRends();
    	//SwordsSlot1
    	CSWS1RendReg.regRends();;
		//Pickaxes
		CPRendReg.regRends();
		//PickaxesSlot1
		CPS1RendReg.regRends();
		//Axes
    	CARendReg.regRends();
    	//Shovel
    	CSRendReg.regRends();
	}

}
