package io.github.nugg20.cheesemod.mixin;

import io.github.nugg20.cheesemod.Config;
import net.minecraft.entity.vehicle.MinecartEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(MinecartEntity.class)

public class MinecartEntityMixin {

   //Injects code in the method "tick"
    @Inject(method = "tick", at = @At("TAIL"))
    private void overrideSpeedCap(CallbackInfo ci) {
        MinecartEntity self = (MinecartEntity)(Object)this;

        float max = Config.stationConfigData.minecartMaxSpeed;

        if (self.velocityX > max) self.velocityX = max;
        if (self.velocityX < -max) self.velocityX = -max;
        if (self.velocityZ > max) self.velocityZ = max;
        if (self.velocityZ < -max) self.velocityZ = -max;

        //sets the max speed to the one in the config and replaces methods that used the original value
    }
}
