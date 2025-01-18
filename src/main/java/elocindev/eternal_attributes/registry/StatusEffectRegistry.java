package elocindev.eternal_attributes.registry;

import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import elocindev.eternal_attributes.EternalAttributes;
import elocindev.necronomicon.api.ResourceIdentifier;
import net.spell_power.internals.SpellStatusEffect;

public class StatusEffectRegistry {
    public static final SpellStatusEffect CREATION_POWER = effect(new SpellStatusEffect(StatusEffectCategory.BENEFICIAL, 0xffd700), "creation_power");
    public static final SpellStatusEffect LIFE_POWER = effect(new SpellStatusEffect(StatusEffectCategory.BENEFICIAL, 0x00ff00), "life_power");
    public static final SpellStatusEffect DEATH_POWER = effect(new SpellStatusEffect(StatusEffectCategory.HARMFUL, 0x000000), "death_power");
    public static final SpellStatusEffect DESTRUCTION_POWER = effect(new SpellStatusEffect(StatusEffectCategory.HARMFUL, 0xff4500), "destruction_power");
    
    public static final SpellStatusEffect UNHOLY_POWER = effect(new SpellStatusEffect(StatusEffectCategory.BENEFICIAL, 0x2abf6d), "unholy_power");
    public static final SpellStatusEffect CORRUPTION_POWER = effect(new SpellStatusEffect(StatusEffectCategory.HARMFUL, 0x8b0000), "corruption_power");
    
    public static final SpellStatusEffect ASTRAL_POWER = effect(new SpellStatusEffect(StatusEffectCategory.BENEFICIAL, 0x9370db), "astral_power");
    public static final SpellStatusEffect NATURE_POWER = effect(new SpellStatusEffect(StatusEffectCategory.BENEFICIAL, 0x228b22), "nature_power");
    public static final SpellStatusEffect BLOOD_POWER = effect(new SpellStatusEffect(StatusEffectCategory.BENEFICIAL, 0x800000), "blood_power");
    public static final SpellStatusEffect DECAYING_POWER = effect(new SpellStatusEffect(StatusEffectCategory.HARMFUL, 0x808080), "decaying_power");

    public static SpellStatusEffect effect(SpellStatusEffect effect, String id) {
        Registry.register(Registries.STATUS_EFFECT, ResourceIdentifier.get(EternalAttributes.MODID, id), effect);

        return effect;
    }

    public static void register() { }
}