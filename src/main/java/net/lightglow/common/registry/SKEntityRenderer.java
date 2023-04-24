package net.lightglow.common.registry;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.lightglow.SkeletalRemains;
import net.lightglow.client.model.FallenSkeletonModel;
import net.lightglow.client.renderer.*;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class SKEntityRenderer {
    public static final EntityModelLayer FALLEN_SKELETON_LAYER = new EntityModelLayer(SkeletalRemains.createEntityId("fallenskeleton"), "main");

    public static void entreg() {
        EntityModelLayerRegistry.registerModelLayer(FALLEN_SKELETON_LAYER, FallenSkeletonModel::getTexturedModelData);
        EntityRendererRegistry.register(SKEntityType.OVERGROWN_SKELETON, OvergrownSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.SHARPSHOOTER_SKELETON, SharpshooterSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.CHARRED_SKELETON, CharredSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.SUNKEN_SKELETON, SunkenSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.FALLEN_SKELETON, FallenSkeletonRenderer::new);;

        EntityRendererRegistry.register(SKEntityType.TIDAL_ARROW, TidalArrowRenderer::new);
    }
}
