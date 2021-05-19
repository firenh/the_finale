package firenhopal.thefinale.init;

import firenhopal.thefinale.block.EndFoliageBlock;
import firenhopal.thefinale.block.EndGrassBlock;
import firenhopal.thefinale.block.EndRegolithBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FinaleBlocks {

    //End Grasses
    public static final EndGrassBlock GREEN_END_GRASS = new EndGrassBlock(FabricBlockSettings.of(Material.STONE).strength(5.0F,6.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().ticksRandomly());
    public static final EndGrassBlock FLOWERING_GREEN_END_GRASS = new EndGrassBlock(FabricBlockSettings.of(Material.STONE).strength(5.0F,6.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().ticksRandomly());
    public static final EndGrassBlock SHADOW_END_GRASS = new EndGrassBlock(FabricBlockSettings.of(Material.STONE).strength(5.0F,6.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().ticksRandomly());
    public static final EndGrassBlock FLOWERING_SHADOW_END_GRASS = new EndGrassBlock(FabricBlockSettings.of(Material.STONE).strength(5.0F,6.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().ticksRandomly());

    //End Foliage
    public static final EndFoliageBlock GREEN_END_SPROUTS = new EndFoliageBlock(FabricBlockSettings.of(Material.NETHER_SHOOTS).strength(5.0F,6.0F).sounds(BlockSoundGroup.NETHER_SPROUTS).breakInstantly().noCollision().nonOpaque());

    //End Regolith
    public static final EndRegolithBlock END_REGOLITH = new EndRegolithBlock(FabricBlockSettings.of(Material.STONE).strength(5.0F,6.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());



    //Registries of Blocks and BlockItems

    public static void init() {

        //End Grasses
        Registry.register(Registry.BLOCK, new Identifier("the_finale", "green_end_grass"), GREEN_END_GRASS);
        Registry.register(Registry.ITEM, new Identifier("the_finale", "green_end_grass"), new BlockItem(GREEN_END_GRASS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("the_finale", "flowering_green_end_grass"), FLOWERING_GREEN_END_GRASS);
        Registry.register(Registry.ITEM, new Identifier("the_finale", "flowering_green_end_grass"), new BlockItem(FLOWERING_GREEN_END_GRASS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("the_finale", "shadow_end_grass"), SHADOW_END_GRASS);
        Registry.register(Registry.ITEM, new Identifier("the_finale", "shadow_end_grass"), new BlockItem(SHADOW_END_GRASS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("the_finale", "flowering_shadow_end_grass"), FLOWERING_SHADOW_END_GRASS);
        Registry.register(Registry.ITEM, new Identifier("the_finale", "flowering_shadow_end_grass"), new BlockItem(FLOWERING_SHADOW_END_GRASS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        //End Foliage
        Registry.register(Registry.BLOCK, new Identifier("the_finale", "green_end_sprouts"), GREEN_END_SPROUTS);
        Registry.register(Registry.ITEM, new Identifier("the_finale", "green_end_sprouts"), new BlockItem(GREEN_END_SPROUTS, new Item.Settings().group(ItemGroup.DECORATIONS)));

        //End Regolith
        Registry.register(Registry.BLOCK, new Identifier("the_finale", "end_regolith"), END_REGOLITH);
        Registry.register(Registry.ITEM, new Identifier("the_finale", "end_regolith"), new BlockItem(END_REGOLITH, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    }
}
