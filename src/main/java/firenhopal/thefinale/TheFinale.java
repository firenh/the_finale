package firenhopal.thefinale;

import firenhopal.thefinale.init.FinaleBlocks;
import firenhopal.thefinale.init.FinaleTags;
import net.fabricmc.api.ModInitializer;

public class TheFinale implements ModInitializer {
	@Override
	public void onInitialize() {
		
		FinaleBlocks.init();
		FinaleTags.init();
		
	}
}
