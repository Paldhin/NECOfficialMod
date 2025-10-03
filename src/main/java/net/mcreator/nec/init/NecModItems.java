
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nec.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.nec.item.StelianSwordItem;
import net.mcreator.nec.item.StelianGemItem;
import net.mcreator.nec.item.PaldhinGemItem;
import net.mcreator.nec.item.NECItemItem;
import net.mcreator.nec.item.KenobiGemItem;
import net.mcreator.nec.item.IvanSwordItem;
import net.mcreator.nec.item.EldiscoItem;
import net.mcreator.nec.item.DiegoSwordItem;
import net.mcreator.nec.item.AlejjannGemItem;
import net.mcreator.nec.item.AlejandroSwordItem;
import net.mcreator.nec.NecMod;

public class NecModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NecMod.MODID);
	public static final RegistryObject<Item> DIEGO_SWORD = REGISTRY.register("diego_sword", () -> new DiegoSwordItem());
	public static final RegistryObject<Item> IVAN_SWORD = REGISTRY.register("ivan_sword", () -> new IvanSwordItem());
	public static final RegistryObject<Item> STELIAN_SWORD = REGISTRY.register("stelian_sword", () -> new StelianSwordItem());
	public static final RegistryObject<Item> ALEJANDRO_SWORD = REGISTRY.register("alejandro_sword", () -> new AlejandroSwordItem());
	public static final RegistryObject<Item> ELDISCO = REGISTRY.register("eldisco", () -> new EldiscoItem());
	public static final RegistryObject<Item> PALDHIN_GEM = REGISTRY.register("paldhin_gem", () -> new PaldhinGemItem());
	public static final RegistryObject<Item> PALDHIN_ORE = block(NecModBlocks.PALDHIN_ORE);
	public static final RegistryObject<Item> ALEJJANN_GEM = REGISTRY.register("alejjann_gem", () -> new AlejjannGemItem());
	public static final RegistryObject<Item> KENOBI_GEM = REGISTRY.register("kenobi_gem", () -> new KenobiGemItem());
	public static final RegistryObject<Item> STELIAN_GEM = REGISTRY.register("stelian_gem", () -> new StelianGemItem());
	public static final RegistryObject<Item> KENOBI_ORE = block(NecModBlocks.KENOBI_ORE);
	public static final RegistryObject<Item> ALEJJANN_ORE = block(NecModBlocks.ALEJJANN_ORE);
	public static final RegistryObject<Item> FACTUM_ORE = block(NecModBlocks.FACTUM_ORE);
	public static final RegistryObject<Item> NEC_ITEM = REGISTRY.register("nec_item", () -> new NECItemItem());
	public static final RegistryObject<Item> PALDHINBLOCK = block(NecModBlocks.PALDHINBLOCK);
	public static final RegistryObject<Item> KENOBIBLOCK = block(NecModBlocks.KENOBIBLOCK);
	public static final RegistryObject<Item> ALEJJANNBLOCK = block(NecModBlocks.ALEJJANNBLOCK);
	public static final RegistryObject<Item> FACTUMBLOCK = block(NecModBlocks.FACTUMBLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
