package net.aethersteel.init;

import net.aethersteel.world.biome.AetherslateCaveBiome;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AethersteelModBiomes {
    public static final DeferredRegister<Biome> REGISTRY;
    public static final RegistryObject<Biome> AETHERSLATE_CAVE;

    public AethersteelModBiomes() {
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, "aethersteel");
        AETHERSLATE_CAVE = REGISTRY.register("aetherslate_cave", AetherslateCaveBiome::createBiome);
    }
}
