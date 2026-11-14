package com.example.guiscale26.mixin;

import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Window.class)
public class WindowMixin {
    @ModifyVariable(method = "setScaleFactor", at = @At("HEAD"), argsOnly = true)
    private double guiscale26$forceScale(double original) {
        return 2.6;
    }
}
