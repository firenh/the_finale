package firenhopal.thefinale;

import firenhopal.thefinale.init.FinaleBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class TheFinaleClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // TODO Auto-generated method stub
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), 
            FinaleBlocks.GREEN_END_SPROUTS
        );
        
    }
    
}
