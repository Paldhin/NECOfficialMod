
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nec.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.nec.NecMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NecModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NecMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(NecModItems.DIEGO_SWORD.get());
			tabData.accept(NecModItems.IVAN_SWORD.get());
			tabData.accept(NecModItems.STELIAN_SWORD.get());
			tabData.accept(NecModItems.ALEJANDRO_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(NecModItems.ELDISCO.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NecModItems.PALDHIN_GEM.get());
			tabData.accept(NecModItems.ALEJJANN_GEM.get());
			tabData.accept(NecModItems.KENOBI_GEM.get());
			tabData.accept(NecModItems.STELIAN_GEM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NecModBlocks.PALDHIN_ORE.get().asItem());
			tabData.accept(NecModBlocks.KENOBI_ORE.get().asItem());
			tabData.accept(NecModBlocks.ALEJJANN_ORE.get().asItem());
			tabData.accept(NecModBlocks.FACTUM_ORE.get().asItem());
			tabData.accept(NecModBlocks.PALDHINBLOCK.get().asItem());
			tabData.accept(NecModBlocks.KENOBIBLOCK.get().asItem());
			tabData.accept(NecModBlocks.ALEJJANNBLOCK.get().asItem());
			tabData.accept(NecModBlocks.FACTUMBLOCK.get().asItem());
		}
	}
}
