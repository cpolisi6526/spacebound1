public abstract class Planet {
    Ship x;
     int xLoc;
     int yLoc;
    public Planet(int xLoc, int yLoc){
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

    public int getxLoc(){
        return xLoc;
    }
    public int getyLoc(){
        return yLoc;
    }

    public abstract String getPlanet();
}
