
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nec.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.nec.NecMod;

public class NecModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NecMod.MODID);
	public static final RegistryObject<SoundEvent> ELDISCO = REGISTRY.register("eldisco", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("nec", "eldisco")));
}
