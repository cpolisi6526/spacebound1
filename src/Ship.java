public class Ship {
    String name;
    private int xLoc;
    private int yLoc;

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
    public Ship(String name, int xLoc, int yLoc){
        this.name=name;
        this.xLoc= xLoc;
        this.yLoc= yLoc;
    }

}
