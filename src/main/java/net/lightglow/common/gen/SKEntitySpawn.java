package net.lightglow.common.gen;

import draylar.omegaconfig.OmegaConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.lightglow.common.config.SkeletalConfig;
import net.lightglow.common.entity.SunkenSkeleton;
import net.lightglow.common.registry.SKEntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class SKEntitySpawn {
    public static final SkeletalConfig CONFIG = OmegaConfig.register(SkeletalConfig.class);
    public static void addEntitySpawn() {

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE), SpawnGroup.MONSTER,
                SKEntityType.OVERGROWN_SKELETON, CONFIG.overgrownweight, CONFIG.overgrownminspawn, CONFIG.overgrownmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE), SpawnGroup.MONSTER,
                SKEntityType.OVERGROWN_SKELETON, CONFIG.overgrownweight, CONFIG.overgrownminspawn, CONFIG.overgrownmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE), SpawnGroup.MONSTER,
                SKEntityType.OVERGROWN_SKELETON, CONFIG.overgrownweight, CONFIG.overgrownminspawn, CONFIG.overgrownmaxspawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS), SpawnGroup.MONSTER,
                SKEntityType.SHARPSHOOTER_SKELETON, CONFIG.sharpshooterweight, CONFIG.sharpshooterminspawn ,CONFIG.sharpshootermaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS), SpawnGroup.MONSTER,
                SKEntityType.SHARPSHOOTER_SKELETON, CONFIG.sharpshooterweight, CONFIG.sharpshooterminspawn ,CONFIG.sharpshootermaxspawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.NETHER_WASTES), SpawnGroup.MONSTER,
                SKEntityType.CHARRED_SKELETON, CONFIG.charredweight, CONFIG.charredminspawn, CONFIG.charredmaxspawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.LUKEWARM_OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.COLD_OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.DEEP_FROZEN_OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.DEEP_LUKEWARM_OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.DEEP_COLD_OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);


        SpawnRestriction.register(SKEntityType.OVERGROWN_SKELETON, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
        SpawnRestriction.register(SKEntityType.SHARPSHOOTER_SKELETON, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
        SpawnRestriction.register(SKEntityType.CHARRED_SKELETON, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
        SpawnRestriction.register(SKEntityType.SUNKEN_SKELETON, SpawnRestriction.Location.IN_WATER,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SunkenSkeleton::canSpawn);
    }
}
