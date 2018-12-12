public class MyShip extends Ship{
    int xLoc;
    int yLoc;

    public MyShip(){
        super("MyShip");
        this.xLoc=0;
        this.yLoc=0;
    }

    public MyShip(int xLoc, int yLoc){
        super("MyShip");
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

    public String getPlanet() {
        return "  X  ";
    }
}
