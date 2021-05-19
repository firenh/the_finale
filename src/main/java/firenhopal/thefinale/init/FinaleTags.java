package firenhopal.thefinale.init;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class FinaleTags {
    public static final Tag<Block> END_GRASS_TAG = TagRegistry.block(new Identifier("the_finale", "end_grasses"));

    public static void init() {}
}
