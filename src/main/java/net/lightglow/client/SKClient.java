package net.lightglow.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.lightglow.client.renderer.*;
import net.lightglow.common.registry.SKEntityType;

public class SKClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(SKEntityType.OVERGROWN_SKELETON, OvergrownSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.SHARPSHOOTER_SKELETON, SharpshooterSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.CHARRED_SKELETON, CharredSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.SUNKEN_SKELETON, SunkenSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.TIDAL_ARROW, TidalArrowRenderer::new);
    }
}
