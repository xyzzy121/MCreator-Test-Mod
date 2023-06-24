
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package paradox_testmod.init;

import paradox_testmod.McreatorTestModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class McreatorTestModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, McreatorTestModMod.MODID);
	public static final RegistryObject<SoundEvent> POP = REGISTRY.register("pop", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "pop")));
	public static final RegistryObject<SoundEvent> POP_STEREO = REGISTRY.register("pop_stereo", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "pop_stereo")));
	public static final RegistryObject<SoundEvent> WATCHTHEWORLDBURN = REGISTRY.register("watchtheworldburn", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "watchtheworldburn")));
	public static final RegistryObject<SoundEvent> VOICESINMYHEAD = REGISTRY.register("voicesinmyhead", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "voicesinmyhead")));
	public static final RegistryObject<SoundEvent> ADDICT = REGISTRY.register("addict", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "addict")));
	public static final RegistryObject<SoundEvent> CROSSMYHEART = REGISTRY.register("crossmyheart", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "crossmyheart")));
	public static final RegistryObject<SoundEvent> FALLENANGEL = REGISTRY.register("fallenangel", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "fallenangel")));
	public static final RegistryObject<SoundEvent> LETITALLBURN = REGISTRY.register("letitallburn", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "letitallburn")));
	public static final RegistryObject<SoundEvent> STRAIGHTTOTHEEND = REGISTRY.register("straighttotheend", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "straighttotheend")));
	public static final RegistryObject<SoundEvent> WORLDINEVERKNEW = REGISTRY.register("worldineverknew", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "worldineverknew")));
	public static final RegistryObject<SoundEvent> MOONWALKER = REGISTRY.register("moonwalker", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "moonwalker")));
	public static final RegistryObject<SoundEvent> ZOMBIFIED = REGISTRY.register("zombified", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "zombified")));
	public static final RegistryObject<SoundEvent> LOSTITALL = REGISTRY.register("lostitall", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "lostitall")));
}
