package elocindev.eternal_attributes.registry;

import elocindev.eternal_attributes.EternalAttributes;
import elocindev.necronomicon.api.resource.v1.ResourceIdentifier;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class AttributeRegistry {
    
    // PRIMARY
    public static final EntityAttribute CREATION_POWER = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.creation_power", 0.0D, 0.0D, 2048.0D).setTracked(true), "creation");
    public static final EntityAttribute LIFE_POWER = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.life_power", 0.0D, 0.0D, 2048.0D).setTracked(true), "life");
    public static final EntityAttribute DEATH_POWER = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.death_power", 0.0D, 0.0D, 2048.0D).setTracked(true), "death");
    public static final EntityAttribute DESTRUCTION_POWER = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.destruction_power", 0.0D, 0.0D, 2048.0D).setTracked(true), "destruction");

    // SECONDARY
    public static final EntityAttribute UNHOLY_POWER = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.unholy_power", 0.0D, 0.0D, 2048.0D).setTracked(true), "unholy");
    // - HOLY defined by Spell Power Attributes
    public static final EntityAttribute CORRUPTION_POWER = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.corruption_power", 0.0D, 0.0D, 2048.0D).setTracked(true), "corruption");
    // - SOUL defined by Spell Power Attributes

    // TERTIARY
    public static final EntityAttribute ASTRAL_POWER = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.astral_power", 0.0D, 0.0D, 2048.0D).setTracked(true), "astral");
    public static final EntityAttribute BLOOD_POWER = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.blood_power", 0.0D, 0.0D, 2048.0D).setTracked(true), "blood");
    public static final EntityAttribute NATURE_POWER = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.nature_power", 0.0D, 0.0D, 2048.0D).setTracked(true), "nature");
    public static final EntityAttribute DECAYING_POWER = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.decaying_power", 0.0D, 0.0D, 2048.0D).setTracked(true), "decaying");

    // RESISTANCES
    public static final EntityAttribute CORRUPTION_RESISTANCE = attribute(new ClampedEntityAttribute("attribute.name.eternal_attributes.corruption_resistance", 0.0D, 0.0D, 2048.0D).setTracked(true), "corruption_resistance");

    public static EntityAttribute attribute(EntityAttribute attribute, String name) {
        return Registry.register(Registries.ATTRIBUTE, ResourceIdentifier.of(EternalAttributes.MODID, name), attribute);
    }

    public static void register() {}
}
