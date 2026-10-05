
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prismitearmament.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.prismitearmament.item.RawPrismiteItem;
import net.mcreator.prismitearmament.item.PrismiteSwordItem;
import net.mcreator.prismitearmament.item.PrismiteShovelItem;
import net.mcreator.prismitearmament.item.PrismitePickaxeItem;
import net.mcreator.prismitearmament.item.PrismiteIngotItem;
import net.mcreator.prismitearmament.item.PrismiteHoeItem;
import net.mcreator.prismitearmament.item.PrismiteAxeItem;
import net.mcreator.prismitearmament.item.PrismiteArmorItem;
import net.mcreator.prismitearmament.PrismiteArmamentMod;

public class PrismiteArmamentModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PrismiteArmamentMod.MODID);
	public static final RegistryObject<Item> PRISMITE_INGOT = REGISTRY.register("prismite_ingot", () -> new PrismiteIngotItem());
	public static final RegistryObject<Item> PRISMITE_ORE = block(PrismiteArmamentModBlocks.PRISMITE_ORE);
	public static final RegistryObject<Item> PRISMITE_BLOCK = block(PrismiteArmamentModBlocks.PRISMITE_BLOCK);
	public static final RegistryObject<Item> PRISMITE_PICKAXE = REGISTRY.register("prismite_pickaxe", () -> new PrismitePickaxeItem());
	public static final RegistryObject<Item> PRISMITE_AXE = REGISTRY.register("prismite_axe", () -> new PrismiteAxeItem());
	public static final RegistryObject<Item> PRISMITE_SWORD = REGISTRY.register("prismite_sword", () -> new PrismiteSwordItem());
	public static final RegistryObject<Item> PRISMITE_SHOVEL = REGISTRY.register("prismite_shovel", () -> new PrismiteShovelItem());
	public static final RegistryObject<Item> PRISMITE_HOE = REGISTRY.register("prismite_hoe", () -> new PrismiteHoeItem());
	public static final RegistryObject<Item> PRISMITE_ARMOR_HELMET = REGISTRY.register("prismite_armor_helmet", () -> new PrismiteArmorItem.Helmet());
	public static final RegistryObject<Item> PRISMITE_ARMOR_CHESTPLATE = REGISTRY.register("prismite_armor_chestplate", () -> new PrismiteArmorItem.Chestplate());
	public static final RegistryObject<Item> PRISMITE_ARMOR_LEGGINGS = REGISTRY.register("prismite_armor_leggings", () -> new PrismiteArmorItem.Leggings());
	public static final RegistryObject<Item> PRISMITE_ARMOR_BOOTS = REGISTRY.register("prismite_armor_boots", () -> new PrismiteArmorItem.Boots());
	public static final RegistryObject<Item> RAW_PRISMITE = REGISTRY.register("raw_prismite", () -> new RawPrismiteItem());
	public static final RegistryObject<Item> DEEPSLATE_PRISMITE_ORE = block(PrismiteArmamentModBlocks.DEEPSLATE_PRISMITE_ORE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
