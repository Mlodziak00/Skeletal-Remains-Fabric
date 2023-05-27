package net.lightglow.common.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lightglow.SkeletalRemains;
import net.lightglow.common.special.TidalArrowItem;
import net.lightglow.common.special.WillOBowItem;
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
    public static final Item FALLEN_SPAWN_EGG = registerItem("fallen_spawn_egg",
            new SpawnEggItem(SKEntityType.FALLEN_SKELETON, 0x7a7a85, 0xb4b4d4,
                    new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item SWAMPED_SPAWN_EGG = registerItem("swamped_spawn_egg",
            new SpawnEggItem(SKEntityType.SWAMPED_SKELETON, 0x212912, 0x1a6117,
                    new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item WILL_O_BOW = registerItem("will_o_bow",
            new WillOBowItem(new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1).maxDamage(468)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SkeletalRemains.MOD_ID, name), item);
    }

    public static void registerSKItems() {
        SkeletalRemains.LOGGER.debug("Registering Some Bones for " + SkeletalRemains.MOD_ID);
    }
}
