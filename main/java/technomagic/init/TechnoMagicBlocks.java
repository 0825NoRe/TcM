package main.java.technomagic.init;

import technomagic.block.AriaBSBlock;

import technomagic.TechnoMagic;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;


public class TechnoMagicBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "technomagic");

	public static final RegistryObject<Block> ITEM_BLOCK_TILEENTITY_ARIA_BS = REGISTRY
	.register("item_block_tileentity_aria_bs", () -> new AriaBSBlock());
}