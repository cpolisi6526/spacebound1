package Ships;

public class MyShip extends Ship {
    // this is the player
    int xLoc;
    int yLoc;

    public MyShip(){
        super("MyShip");
        // initials loc at 0,0 on board
        this.xLoc=0;
        this.yLoc=0;
    }

    public MyShip(int xLoc, int yLoc){
        super("Ships.MyShip");
        this.xLoc= xLoc;
        this.yLoc= yLoc;
    }
    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }
// this was my prized idea
    public String getPlanet() {
        return "  X  ";
    }
}
