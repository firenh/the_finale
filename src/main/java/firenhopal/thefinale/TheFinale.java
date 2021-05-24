package firenhopal.thefinale;

import firenhopal.thefinale.init.FinaleBlocks;
import firenhopal.thefinale.init.FinaleTags;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class TheFinale implements ModInitializer {
	public static final String FNHOPL_NAMESPACE0 = "the_finale";
	@Override
	public void onInitialize() {
		
		FinaleBlocks.init();
		FinaleTags.init();
		
	}
	public static Identifier modid(String id) {
		return new Identifier(FNHOPL_NAMESPACE0, id);
	}
}
