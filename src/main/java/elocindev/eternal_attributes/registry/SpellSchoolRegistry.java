package elocindev.eternal_attributes.registry;

import elocindev.eternal_attributes.EternalAttributes;
import elocindev.necronomicon.api.ResourceIdentifier;
import net.spell_power.api.SpellSchool;
import net.spell_power.api.SpellSchools;

public class SpellSchoolRegistry {
    // MARK: Eternal (1)

    public static final SpellSchool CREATION = SpellSchools.register(
        SpellSchools.createMagic(
            ResourceIdentifier.get(EternalAttributes.MODID, "creation"),
            0xed8413,
            false,
            AttributeRegistry.CREATION_POWER,
            StatusEffectRegistry.CREATION_POWER
        )
    );

    public static final SpellSchool LIFE = SpellSchools.register(
        SpellSchools.createMagic(
            ResourceIdentifier.get(EternalAttributes.MODID, "life"),
            0x72ed7e,
            false,
            AttributeRegistry.LIFE_POWER,
            StatusEffectRegistry.LIFE_POWER
        )
    );

    public static final SpellSchool DEATH = SpellSchools.register(
        SpellSchools.createMagic(
            ResourceIdentifier.get(EternalAttributes.MODID, "death"),
            0x5999b5,
            false,
            AttributeRegistry.DEATH_POWER,
            StatusEffectRegistry.DEATH_POWER
        )
    );

    public static final SpellSchool DESTRUCTION = SpellSchools.register(
        SpellSchools.createMagic(
            ResourceIdentifier.get(EternalAttributes.MODID, "destruction"),
            0xba5055,
            false,
            AttributeRegistry.DESTRUCTION_POWER,
            StatusEffectRegistry.DESTRUCTION_POWER
        )
    );

    // MARK: Primordial (2)

    public static final SpellSchool UNHOLY = SpellSchools.register(
        SpellSchools.createMagic(
            ResourceIdentifier.get(EternalAttributes.MODID, "unholy"),
            0x50ba7a,
            false,
            AttributeRegistry.UNHOLY_POWER,
            StatusEffectRegistry.UNHOLY_POWER
        )
    );

    public static final SpellSchool CORRUPTION = SpellSchools.register(
        SpellSchools.createMagic(
            ResourceIdentifier.get(EternalAttributes.MODID, "corruption"),
            0x7d45ad,
            false,
            AttributeRegistry.CORRUPTION_POWER,
            StatusEffectRegistry.CORRUPTION_POWER
        )
    );

    // MARK: Elemental (3)

    public static final SpellSchool ASTRAL = SpellSchools.register(
        SpellSchools.createMagic(
            ResourceIdentifier.get(EternalAttributes.MODID, "astral"),
            0xe040e6,
            false,
            AttributeRegistry.ASTRAL_POWER,
            StatusEffectRegistry.ASTRAL_POWER
        )
    );

    public static final SpellSchool NATURE = SpellSchools.register(
        SpellSchools.createMagic(
            ResourceIdentifier.get(EternalAttributes.MODID, "nature"),
            0x9fe04f,
            false,
            AttributeRegistry.NATURE_POWER,
            StatusEffectRegistry.NATURE_POWER
        )
    );

    public static final SpellSchool DECAYING = SpellSchools.register(
        SpellSchools.createMagic(
            ResourceIdentifier.get(EternalAttributes.MODID, "decaying"),
            0xc46b52,
            false,
            AttributeRegistry.DECAYING_POWER,
            StatusEffectRegistry.DECAYING_POWER
        )
    );

    public static final SpellSchool BLOOD = SpellSchools.register(
        SpellSchools.createMagic(
            ResourceIdentifier.get(EternalAttributes.MODID, "blood"),
            0x800000,
            false,
            AttributeRegistry.BLOOD_POWER,
            StatusEffectRegistry.BLOOD_POWER
        )
    );

    public static void register() { }
}