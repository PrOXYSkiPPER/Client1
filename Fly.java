package client.modules.Movement;

import client.modules.Module;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.input.Keyboard;

public class Fly extends Module {
    public Fly() {
        super("Fly", Keyboard.KEY_G,Category.MOVEMENT);
    }
    public void onEnable() {
        mc.thePlayer.capabilities.isFlying = true;
        mc.thePlayer.capabilities.allowFlying = true;

    }
    public void onDisable() {
        if (!mc.thePlayer.capabilities.isCreativeMode) {
            mc.thePlayer.capabilities.isFlying = false;
            mc.thePlayer.capabilities.allowFlying = false;
        }
    }

}
