package Planets;

import Ships.MyShip;
import Ships.Ship;

public class Station extends Planet {
    public Station(int xLoc, int yLoc) {
        super(xLoc, yLoc);
    }

    //ooo look overriding method
    @Override
    public void enterRoom(MyShip a){
        x=a;
        a.setxLoc(this.xLoc);
        a.setyLoc(this.yLoc);

        //welcomes to station
        System.out.println("Hey welcome to the United States Space Planets.Station. There are no bad guys here. Come and go as you please.");
    }
    public void leaveRoom(Ship a){
        a= null;
    }

    public String getPlanet(){
        return "STAT ";
    }

}
