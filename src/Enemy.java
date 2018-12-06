public class Enemy extends Ship {
    public Enemy(int xLoc, int yLoc){
        super("Enemy",xLoc,yLoc);
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

 // public String getPlanet(){ return "E";}

}
