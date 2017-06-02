package metalgemcraft.init.item.rend.reg.copper.tools.pickaxe;

import metalgemcraft.init.item.ids.copper.tools.pickaxe.CPIDs;
import metalgemcraft.init.item.ids.copper.tools.pickaxe.slot1.CPS1IDs;
import metalgemcraft.init.item.rend.Rend;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CPRendReg {
	public static void regRends(){
		Rend.regRend(CPIDs.copperpickaxe);
	}
}
