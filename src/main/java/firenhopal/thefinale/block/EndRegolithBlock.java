package firenhopal.thefinale.block;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import firenhopal.thefinale.init.FinaleTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class EndRegolithBlock extends Block implements Fertilizable {
   public EndRegolithBlock(AbstractBlock.Settings settings) {
      super(settings);
   }

   public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
      if (!world.getBlockState(pos.up()).isTranslucent(world, pos)) {
         return false;
      } else {
         Iterator var5 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();

         BlockPos blockPos;
         do {
            if (!var5.hasNext()) {
               return false;
            }

            blockPos = (BlockPos)var5.next();
         } while(!world.getBlockState(blockPos).isIn(FinaleTags.END_GRASS_TAG));

         return true;
      }
   }

   public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
      return true;
   }

   public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
      BlockState[] possibleBlockStates = {};

      Iterator var7 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();

      while(var7.hasNext()) {
         BlockPos blockPos = (BlockPos)var7.next();
         BlockState blockState = world.getBlockState(blockPos);
         if (blockState.isIn(FinaleTags.END_GRASS_TAG)) {
            possibleBlockStates = Arrays.copyOf(possibleBlockStates, possibleBlockStates.length + 1);
            possibleBlockStates[possibleBlockStates.length - 1] = world.getBlockState(pos);
         }

         if (possibleBlockStates.length > 0) {
            BlockState finalBlockState = possibleBlockStates[(int) Math.floor(Math.random()*(possibleBlockStates.length))];
            world.setBlockState(pos, finalBlockState);
         } 
      }
   }
}
