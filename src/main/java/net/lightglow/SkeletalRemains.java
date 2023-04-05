package net.lightglow;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.lightglow.common.entity.CharredSkeleton;
import net.lightglow.common.entity.OvergrownSkeleton;
import net.lightglow.common.entity.SharpshooterSkeleton;
import net.lightglow.common.entity.SunkenSkeleton;
import net.lightglow.common.gen.SKWorldGen;
import net.lightglow.common.registry.SKEntityType;
import net.lightglow.common.registry.SKItemsRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkeletalRemains implements ModInitializer {
	public static final String MOD_ID = "skeletalremains";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("skeletalremains");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		SKWorldGen.genWorldGen();

		SKItemsRegistry.registerSKItems();

		FabricDefaultAttributeRegistry.register(SKEntityType.OVERGROWN_SKELETON, OvergrownSkeleton.setAttributes());
		FabricDefaultAttributeRegistry.register(SKEntityType.SHARPSHOOTER_SKELETON, SharpshooterSkeleton.setAttributes());
		FabricDefaultAttributeRegistry.register(SKEntityType.CHARRED_SKELETON, CharredSkeleton.setAttributes());
		FabricDefaultAttributeRegistry.register(SKEntityType.SUNKEN_SKELETON, SunkenSkeleton.setAttributes());

	}
}