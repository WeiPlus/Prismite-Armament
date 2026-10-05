
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prismitearmament.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.prismitearmament.block.PrismiteOreBlock;
import net.mcreator.prismitearmament.block.PrismiteBlockBlock;
import net.mcreator.prismitearmament.block.DeepslatePrismiteOreBlock;
import net.mcreator.prismitearmament.PrismiteArmamentMod;

public class PrismiteArmamentModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PrismiteArmamentMod.MODID);
	public static final RegistryObject<Block> PRISMITE_ORE = REGISTRY.register("prismite_ore", () -> new PrismiteOreBlock());
	public static final RegistryObject<Block> PRISMITE_BLOCK = REGISTRY.register("prismite_block", () -> new PrismiteBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_PRISMITE_ORE = REGISTRY.register("deepslate_prismite_ore", () -> new DeepslatePrismiteOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
