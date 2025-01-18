package elocindev.eternal_attributes.mixin.entity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import elocindev.eternal_attributes.registry.AttributeRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;

//? if 1.21.1 {
/*import net.minecraft.registry.entry.RegistryEntry;
*///?}

@Mixin(value = LivingEntity.class, priority = 1000)
public class LivingAttributeApplyMixin {
    @Inject(method = "createLivingAttributes", at = @At("RETURN"), cancellable = true) 
    private static void death_knights$registerLivingEntityAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
        for (var attribute : AttributeRegistry.ATTRIBUTES) {
            ((DefaultAttributeContainer.Builder)cir.getReturnValue())
            //? if 1.20.1 {
            .add(attribute);
            //?} else {
            /*.add(RegistryEntry.of(attribute));
            *///?}
        }
    }
}
