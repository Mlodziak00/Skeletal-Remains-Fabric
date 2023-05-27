package net.lightglow.common.registry;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.lightglow.SkeletalRemains;
import net.lightglow.client.model.FallenSkeletonModel;
import net.lightglow.client.model.SwampedSkeletonModel;
import net.lightglow.client.renderer.*;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class SKEntityRenderer {
    public static final EntityModelLayer FALLEN_SKELETON_LAYER = new EntityModelLayer(SkeletalRemains.createEntityId("fallenskeleton"), "main");
    public static final EntityModelLayer SWAMPED_SKELETON_LAYER = new EntityModelLayer(SkeletalRemains.createEntityId("swampedskeleton"), "main");

    public static void entreg() {
        EntityModelLayerRegistry.registerModelLayer(FALLEN_SKELETON_LAYER, FallenSkeletonModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SWAMPED_SKELETON_LAYER, SwampedSkeletonModel::getTexturedModelData);
        EntityRendererRegistry.register(SKEntityType.OVERGROWN_SKELETON, OvergrownSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.SHARPSHOOTER_SKELETON, SharpshooterSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.CHARRED_SKELETON, CharredSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.SUNKEN_SKELETON, SunkenSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.FALLEN_SKELETON, FallenSkeletonRenderer::new);
        EntityRendererRegistry.register(SKEntityType.SWAMPED_SKELETON, SwampedSkeletonRenderer::new);




        EntityRendererRegistry.register(SKEntityType.TIDAL_ARROW, TidalArrowRenderer::new);
    }
}
