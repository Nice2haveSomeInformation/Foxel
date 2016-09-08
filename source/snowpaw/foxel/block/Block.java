package snowpaw.foxel.block;

public abstract class Block {

    private int ID;
    private boolean isActive;

    public Block(){
        this.ID = this.getID();
    }

    public abstract int getID();

    public void setID(int ID){
        this.ID = ID;
    }

    public boolean getIsActive(){
        return this.isActive;
    }

    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

}
