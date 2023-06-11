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
import net.minecraft.tag.BiomeTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class SKEntitySpawn {
    public static final SkeletalConfig CONFIG = OmegaConfig.register(SkeletalConfig.class);
    public static void addEntitySpawn() {

        BiomeModifications.addSpawn(BiomeSelectors.tag(BiomeTags.IS_JUNGLE), SpawnGroup.MONSTER,
                SKEntityType.OVERGROWN_SKELETON, CONFIG.overgrownweight, CONFIG.overgrownminspawn, CONFIG.overgrownmaxspawn);

        BiomeModifications.addSpawn(BiomeSelectors.tag(BiomeTags.IS_BADLANDS), SpawnGroup.MONSTER,
                SKEntityType.SHARPSHOOTER_SKELETON, CONFIG.sharpshooterweight, CONFIG.sharpshooterminspawn ,CONFIG.sharpshootermaxspawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.NETHER_WASTES), SpawnGroup.MONSTER,
                SKEntityType.CHARRED_SKELETON, CONFIG.charredweight, CONFIG.charredminspawn, CONFIG.charredmaxspawn);

        BiomeModifications.addSpawn(BiomeSelectors.tag(BiomeTags.IS_OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.tag(BiomeTags.IS_DEEP_OCEAN), SpawnGroup.MONSTER,
                SKEntityType.SUNKEN_SKELETON, CONFIG.sunkenweight, CONFIG.sunkenminspawn, CONFIG.sunkenmaxspawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MANGROVE_SWAMP), SpawnGroup.MONSTER,
                SKEntityType.SWAMPED_SKELETON, CONFIG.swampedweight, CONFIG.swampedminspawn, CONFIG.swampedmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), SpawnGroup.MONSTER,
                SKEntityType.SWAMPED_SKELETON, CONFIG.swampedweight, CONFIG.swampedminspawn, CONFIG.swampedmaxspawn);
        BiomeModifications.addSpawn(BiomeSelectors.tag(BiomeTags.SWAMP_HUT_HAS_STRUCTURE), SpawnGroup.MONSTER,
                SKEntityType.SWAMPED_SKELETON, CONFIG.swampedweight, CONFIG.swampedminspawn, CONFIG.swampedmaxspawn);

        SpawnRestriction.register(SKEntityType.OVERGROWN_SKELETON, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
        SpawnRestriction.register(SKEntityType.SHARPSHOOTER_SKELETON, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
        SpawnRestriction.register(SKEntityType.CHARRED_SKELETON, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
        SpawnRestriction.register(SKEntityType.SUNKEN_SKELETON, SpawnRestriction.Location.IN_WATER,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SunkenSkeleton::canSpawn);
        SpawnRestriction.register(SKEntityType.SWAMPED_SKELETON, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
    }
}
