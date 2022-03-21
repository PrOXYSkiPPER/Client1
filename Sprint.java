package client.modules.Movement;

import client.modules.Module;
import org.lwjgl.input.Keyboard;

public class Sprint extends Module  {
    boolean alwaysactive = true;
    public Sprint() {
        super("Speed", Keyboard.KEY_M,Category.MOVEMENT);
    }
    public void onEnable() {


System.out.println("SSSSS");

    }
    public void onDisable() {

    }
    public void onEvent() {
        if((mc.thePlayer.moveForward != 0 || mc.thePlayer.moveStrafing != 0)
                && !mc.thePlayer.isSneaking() && mc.thePlayer.onGround) {
            System.out.println(mc.thePlayer.motionX + " " + mc.thePlayer.motionY);

            mc.thePlayer.jump();
            mc.thePlayer.motionX *=2;
            mc.thePlayer.motionZ *=2;
            mc.thePlayer.moveStrafing *=90;
        } else {
            //mc.thePlayer.jumpMovementFactor = 0.0265F;
        }


    }
}
