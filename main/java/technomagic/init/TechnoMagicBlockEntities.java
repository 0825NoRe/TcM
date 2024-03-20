package main.java.technomagic.init;

import technomagic.block.entity.AriaBSBlockEntity;

import technomagic.TechnoMagic;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;


public class TechnoMagicBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, "technomagic");

    public static final RegistryObject<BlockEntityType<?>> ITEM_BLOCK_TILEENTITY_ARIA_BS = register("item_block_tileentity_aria_bs",
    TechnoMagicBlocks.ITEM_BLOCK_TILEENTITY_ARIA_BS, AriaBSBlockEntity::new);

    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
        return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
    }
}