package Planets;

import Ships.Enemy;
import Ships.Firefly;
import Ships.MyShip;
import Ships.Ship;

public class Gaseous extends Planet {
    public Gaseous(int xLoc, int yLoc) {
        super(xLoc, yLoc);
    }

    @Override
    public void enterRoom(MyShip a) {
        x = a;
        a.setxLoc(this.xLoc);
        a.setyLoc(this.yLoc);

        // names each gase planet
        String[] plnm = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        int rand = (int) (Math.random() * plnm.length);
        String starName = plnm[rand];
        System.out.println("Welcome to " + starName + ".");

        // like star class randomly assigns bad guy or not... gaseous planets are less likely to have

        //add if else statement if occupied there's a challenge if not the person is able to be leave as they wish
        int dec= (int) (Math.random()*4)+1;
        if (dec==1){
            System.out.println("Maybe you can't tell because of all the smoke, but look ahead. There's an enemy ship.");
            System.out.println(Enemy.Greeting());
            Enemy.challenge();
        }
        if (dec==2){
            System.out.println("Oooof fireflys. RIP dude. Hope you enjoyed " + starName);
            System.out.println(Firefly.Greeting());
            Firefly.challenge();
        }
        else{
            System.out.println("This planet's all clear... for now. Hope you enjoyed you stay.");
        }
    }


    public void leaveRoom(Ship a) {
        a = null;
    }

    public String getPlanet() {
        return "GASE ";
    }

}
