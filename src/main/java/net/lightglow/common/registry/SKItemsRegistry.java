package net.lightglow.common.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lightglow.SkeletalRemains;
import net.lightglow.common.special.TidalArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SKItemsRegistry {

    public static final Item TIDAL_ARROW = registerItem("tidal_arrow", new TidalArrowItem(new FabricItemSettings().group(ItemGroup.COMBAT)));


    public static final Item OVERGROWN_SPAWN_EGG = registerItem("overgrown_spawn_egg",
            new SpawnEggItem(SKEntityType.OVERGROWN_SKELETON, 0x6e8267, 0x589946,
                    new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SHARPSHOOTER_SPAWN_EGG = registerItem("sharpshooter_spawn_egg",
            new SpawnEggItem(SKEntityType.SHARPSHOOTER_SKELETON, 0x54543f, 0x452d1b,
                    new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item CHARRED_SPAWN_EGG = registerItem("charred_spawn_egg",
            new SpawnEggItem(SKEntityType.CHARRED_SKELETON, 0x545454, 0x171717,
                    new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SUNKEN_SPAWN_EGG = registerItem("sunken_spawn_egg",
            new SpawnEggItem(SKEntityType.SUNKEN_SKELETON, 0x354747, 0x257a7a,
                    new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SkeletalRemains.MOD_ID, name), item);
    }

    public static void registerSKItems() {
        SkeletalRemains.LOGGER.debug("Registering Some Bones for " + SkeletalRemains.MOD_ID);
    }
}
