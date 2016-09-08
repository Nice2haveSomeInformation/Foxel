package snowpaw.foxel.client;

import com.nishu.utils.Camera;
import com.nishu.utils.Camera3D;
import com.nishu.utils.Screen;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import snowpaw.foxel.util.Constants;

public class WorldRenderer extends Screen {

    private Camera camera;

    public WorldRenderer(){
        this.initGL();
        this.init();
    }

    @Override
    public void init() {
        this.camera = new Camera3D.CameraBuilder().setAspectRatio(Constants.WIDTH / Constants.HEIGHT).setRotation(0F, 0F, 0F).setPosition(0F, 0F, 0F).setFieldOfView(67F).build();
    }

    @Override
    public void initGL() {

    }

    @Override
    public void update() {
        this.camera.updateKeys(32F, 1F);
        this.camera.updateMouse(1F, 90F, -90F);

        if(Mouse.isButtonDown(0)){
            Mouse.setGrabbed(true);
        }
        else if(Mouse.isButtonDown(1)){
            Mouse.setGrabbed(false);
        }

        if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)){
            dispose();
        }
    }

    @Override
    public void render() {

    }

    @Override
    public void dispose() {
        Display.destroy();
        System.exit(0);
    }

}
