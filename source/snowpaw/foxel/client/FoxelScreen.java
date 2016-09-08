package snowpaw.foxel.client;

import com.nishu.utils.GameLoop;
import com.nishu.utils.Screen;
import com.nishu.utils.Window;

import static snowpaw.foxel.util.Constants.HEIGHT;
import static snowpaw.foxel.util.Constants.WIDTH;

public class FoxelScreen extends Screen {

    private static final FoxelScreen instance = new FoxelScreen();
    private GameLoop gameLoop;
    private WorldRenderer worldRenderer;

    public void initScreen(){
        Window.createWindow(WIDTH, HEIGHT, "Foxel Engine", true, true);
        this.gameLoop = new GameLoop();
        this.gameLoop.setScreen(this);
        this.gameLoop.setDebugMode(true);
        this.gameLoop.start(60);
    }

    @Override
    public void init() {
        this.worldRenderer = new WorldRenderer();
    }

    @Override
    public void initGL() {
        OpenGlHelper.initGl();
    }

    @Override
    public void update() {
        this.worldRenderer.update();
    }

    @Override
    public void render() {
        OpenGlHelper.clearScreen(1D, 0.55D, 0D, 1D);
        this.worldRenderer.render();
    }

    @Override
    public void dispose() {
        this.worldRenderer.dispose();
    }

    public static FoxelScreen getInstance(){
        return instance;
    }

}
