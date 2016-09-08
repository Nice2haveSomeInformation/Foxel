package snowpaw.foxel.world;

import com.nishu.utils.Vector3f;
import snowpaw.foxel.init.Blocks;

public class WorldChunk {

    private Vector3f pos;
    private int[][][] blocks;
    private int vID, cID;
    private boolean isActive;

    public WorldChunk(double x, double y, double z){
        this.pos = new Vector3f((float)x, (float)y, (float)z);
    }

    public WorldChunk(Vector3f pos){
        this.pos = pos;
    }

    public void update(){

    }

    public void render(){

    }

    public void rebuild(){

    }

    private void checkBlockInView(){

    }

    public void dispose(){

    }

    public boolean getIsActive(){
        return this.isActive;
    }

    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

}
