package firenhopal.thefinale.block;

import java.util.Random;

import firenhopal.thefinale.init.FinaleBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.NetherForestVegetationFeature;

public class EndGrassBlock extends Block implements Fertilizable {
    public EndGrassBlock(AbstractBlock.Settings settings) {
       super(settings);
    }
 
    private static boolean stayAlive(BlockState state, WorldView world, BlockPos pos) {
       BlockPos blockPos = pos.up();
       BlockState blockState = world.getBlockState(blockPos);
       int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, blockState, blockPos, Direction.UP, blockState.getOpacity(world, blockPos));
       return i < world.getMaxLightLevel();
    }
 
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
       if (!stayAlive(state, world, pos)) {
          world.setBlockState(pos, FinaleBlocks.END_REGOLITH.getDefaultState());
       }
 
    }
 
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
       return world.getBlockState(pos.up()).isAir();
    }
 
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
       return true;
    } 

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockState blockState = world.getBlockState(pos);
        BlockPos blockPos = pos.up();
        if (blockState.isOf(FinaleBlocks.GREEN_END_GRASS)) {
            NetherForestVegetationFeature.generate(world, random, blockPos, ConfiguredFeatures.Configs.WARPED_ROOTS_CONFIG, 3, 1);
        }
    }
    
}
