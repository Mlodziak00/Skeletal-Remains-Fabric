package net.lightglow.common.config;

import draylar.omegaconfig.api.Comment;
import draylar.omegaconfig.api.Config;
import net.lightglow.SkeletalRemains;


public class SkeletalConfig implements Config {

    @Comment(value = "Rarity of how much the Overgrown can spawn (0 to disable)  | default: 130")
    public int overgrownweight = 130;

    @Comment(value = "Minimal amount of Overgrown that can spawn.  | default: 1")
    public int overgrownminspawn = 1;

    @Comment(value = "Maximal amount of Overgrown that can spawn.  | default: 2")
    public int overgrownmaxspawn = 2;


    @Comment(value = "Rarity of how much the Sharpshooter can spawn (0 to disable)  | default: 150")
    public int sharpshooterweight = 150;

    @Comment(value = "Minimal amount of Sharpshooter that can spawn.  | default: 1")
    public int sharpshooterminspawn = 1;

    @Comment(value = "Maximal amount of Sharpshooter that can spawn.  | default: 2")
    public int sharpshootermaxspawn = 2;


    @Comment(value = "Rarity of how much the Charred can spawn (0 to disable)  | default: 120")
    public int charredweight = 120;

    @Comment(value = "Minimal amount of Charred that can spawn.  | default: 1")
    public int charredminspawn = 1;

    @Comment(value = "Maximal amount of Charred that can spawn.  | default: 2")
    public int charredmaxspawn = 2;


    @Comment(value = "Rarity of how much the Sunken can spawn (0 to disable)  | default: 180")
    public int sunkenweight = 180;

    @Comment(value = "Minimal amount of Sunken that can spawn.  | default: 1")
    public int sunkenminspawn = 1;

    @Comment(value = "Maximal amount of Sunken that can spawn.  | default: 3")
    public int sunkenmaxspawn = 3;


    @Comment(value = "Rarity of how much the Swamped can spawn (0 to disable)  | default: 100")
    public int swampedweight = 100;

    @Comment(value = "Minimal amount of Swamped that can spawn.  | default: 1")
    public int swampedminspawn = 1;

    @Comment(value = "Maximal amount of Swamped that can spawn.  | default: 3")
    public int swampedmaxspawn = 3;


    @Override
    public String getName() {
        return SkeletalRemains.MOD_ID + "-common";
    }
}
