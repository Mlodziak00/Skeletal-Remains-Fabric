package net.lightglow;

import draylar.omegaconfig.OmegaConfig;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.lightglow.common.config.SkeletalConfig;
import net.lightglow.common.entity.*;
import net.lightglow.common.gen.SKWorldGen;
import net.lightglow.common.registry.SKEntityType;
import net.lightglow.common.registry.SKItemsRegistry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkeletalRemains implements ModInitializer {
	public static final SkeletalConfig CONFIG = OmegaConfig.register(SkeletalConfig.class);
	public static final String MOD_ID = "skeletalremains";
	public static final Logger LOGGER = LoggerFactory.getLogger("skeletalremains");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");

		SKWorldGen.genWorldGen();

		SKItemsRegistry.registerSKItems();

		FabricDefaultAttributeRegistry.register(SKEntityType.OVERGROWN_SKELETON, OvergrownSkeleton.setAttributes());
		FabricDefaultAttributeRegistry.register(SKEntityType.SHARPSHOOTER_SKELETON, SharpshooterSkeleton.setAttributes());
		FabricDefaultAttributeRegistry.register(SKEntityType.CHARRED_SKELETON, CharredSkeleton.setAttributes());
		FabricDefaultAttributeRegistry.register(SKEntityType.SUNKEN_SKELETON, SunkenSkeleton.setAttributes());
		FabricDefaultAttributeRegistry.register(SKEntityType.FALLEN_SKELETON, FallenSkeleton.setAttributes());

	}
	public static Identifier createEntityId(String path) {
		return new Identifier(MOD_ID, path);
	}
}