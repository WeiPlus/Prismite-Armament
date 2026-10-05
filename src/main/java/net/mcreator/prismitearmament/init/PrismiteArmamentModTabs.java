
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prismitearmament.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.prismitearmament.PrismiteArmamentMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrismiteArmamentModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrismiteArmamentMod.MODID);
	public static final RegistryObject<CreativeModeTab> PRISMITE_ARMS_TAB = REGISTRY.register("prismite_arms_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.prismite_armament.prismite_arms_tab")).icon(() -> new ItemStack(Blocks.STONE)).displayItems((parameters, tabData) -> {
				tabData.accept(PrismiteArmamentModItems.PRISMITE_INGOT.get());
				tabData.accept(PrismiteArmamentModBlocks.PRISMITE_ORE.get().asItem());
				tabData.accept(PrismiteArmamentModBlocks.PRISMITE_BLOCK.get().asItem());
				tabData.accept(PrismiteArmamentModItems.PRISMITE_PICKAXE.get());
				tabData.accept(PrismiteArmamentModItems.PRISMITE_SWORD.get());
				tabData.accept(PrismiteArmamentModItems.PRISMITE_ARMOR_HELMET.get());
				tabData.accept(PrismiteArmamentModItems.PRISMITE_ARMOR_CHESTPLATE.get());
				tabData.accept(PrismiteArmamentModItems.PRISMITE_ARMOR_LEGGINGS.get());
				tabData.accept(PrismiteArmamentModItems.PRISMITE_ARMOR_BOOTS.get());
				tabData.accept(PrismiteArmamentModItems.RAW_PRISMITE.get());
				tabData.accept(PrismiteArmamentModBlocks.DEEPSLATE_PRISMITE_ORE.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(PrismiteArmamentModItems.PRISMITE_INGOT.get());
			tabData.accept(PrismiteArmamentModItems.RAW_PRISMITE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(PrismiteArmamentModBlocks.PRISMITE_ORE.get().asItem());
			tabData.accept(PrismiteArmamentModBlocks.PRISMITE_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PrismiteArmamentModBlocks.PRISMITE_ORE.get().asItem());
			tabData.accept(PrismiteArmamentModBlocks.DEEPSLATE_PRISMITE_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PrismiteArmamentModItems.PRISMITE_PICKAXE.get());
			tabData.accept(PrismiteArmamentModItems.PRISMITE_AXE.get());
			tabData.accept(PrismiteArmamentModItems.PRISMITE_SHOVEL.get());
			tabData.accept(PrismiteArmamentModItems.PRISMITE_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(PrismiteArmamentModItems.PRISMITE_SWORD.get());
			tabData.accept(PrismiteArmamentModItems.PRISMITE_ARMOR_HELMET.get());
			tabData.accept(PrismiteArmamentModItems.PRISMITE_ARMOR_CHESTPLATE.get());
			tabData.accept(PrismiteArmamentModItems.PRISMITE_ARMOR_LEGGINGS.get());
			tabData.accept(PrismiteArmamentModItems.PRISMITE_ARMOR_BOOTS.get());
		}
	}
}
