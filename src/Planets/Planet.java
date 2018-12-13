package Planets;

import Ships.MyShip;
import Ships.Ship;

public abstract class Planet {
    Ship x;
     int xLoc;
     int yLoc;

    public Planet(int xLoc, int yLoc){
        this.xLoc=xLoc;
        this.yLoc=yLoc;
    }
//sets location when enters room
    public void enterRoom(MyShip a){
        x=a;
        a.setxLoc(this.xLoc);
        a.setyLoc(this.yLoc);
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
