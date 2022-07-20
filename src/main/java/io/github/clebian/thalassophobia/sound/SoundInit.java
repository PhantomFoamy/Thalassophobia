package io.github.clebian.thalassophobia.sound;

import io.github.clebian.thalassophobia.Thalassophobia;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class SoundInit {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, 
			Thalassophobia.MODID);
			
	
	public static RegistryObject<SoundEvent> createEvent(String sound){
		return SOUNDS.register(sound, () -> new SoundEvent(new ResourceLocation(Thalassophobia.MODID, sound)));
	}
}
