package firenhopal.thefinale.init;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import firenhopal.thefinale.TheFinale;

public class FinaleTags {
    public static final Tag<Block> END_GRASS_TAG = TagRegistry.block(TheFinale.modid("end_grasses"));

    public static void init() {}
}
