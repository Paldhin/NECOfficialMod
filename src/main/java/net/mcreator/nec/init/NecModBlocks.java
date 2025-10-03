
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nec.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.nec.block.PaldhinblockBlock;
import net.mcreator.nec.block.PaldhinOreBlock;
import net.mcreator.nec.block.KenobiblockBlock;
import net.mcreator.nec.block.KenobiOreBlock;
import net.mcreator.nec.block.FactumblockBlock;
import net.mcreator.nec.block.FactumOreBlock;
import net.mcreator.nec.block.AlejjannblockBlock;
import net.mcreator.nec.block.AlejjannOreBlock;
import net.mcreator.nec.NecMod;

public class NecModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NecMod.MODID);
	public static final RegistryObject<Block> PALDHIN_ORE = REGISTRY.register("paldhin_ore", () -> new PaldhinOreBlock());
	public static final RegistryObject<Block> KENOBI_ORE = REGISTRY.register("kenobi_ore", () -> new KenobiOreBlock());
	public static final RegistryObject<Block> ALEJJANN_ORE = REGISTRY.register("alejjann_ore", () -> new AlejjannOreBlock());
	public static final RegistryObject<Block> FACTUM_ORE = REGISTRY.register("factum_ore", () -> new FactumOreBlock());
	public static final RegistryObject<Block> PALDHINBLOCK = REGISTRY.register("paldhinblock", () -> new PaldhinblockBlock());
	public static final RegistryObject<Block> KENOBIBLOCK = REGISTRY.register("kenobiblock", () -> new KenobiblockBlock());
	public static final RegistryObject<Block> ALEJJANNBLOCK = REGISTRY.register("alejjannblock", () -> new AlejjannblockBlock());
	public static final RegistryObject<Block> FACTUMBLOCK = REGISTRY.register("factumblock", () -> new FactumblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
