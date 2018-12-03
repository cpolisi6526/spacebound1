public class Planet {
    private Ship x;
    private int xLoc;
    private int yLoc;
    public Planet(Ship x, int xLoc, int yLoc){
        this.x=x;
        this.xLoc=xLoc;
        this.yLoc=yLoc;
    }
    public void enterRoom(Ship a){
        x=a;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void leaveRoom(Ship a){
    a= null;
    }
}
