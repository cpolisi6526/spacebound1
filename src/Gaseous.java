public class Gaseous extends Planet {
    public Gaseous(int xLoc, int yLoc) {
        super(xLoc, yLoc);
    }

    public void enterRoom(MyShip a) {
        x = a;
        a.setxLoc(this.xLoc);
        a.setyLoc(this.yLoc);

        // names each gase planet
        String[] plnm = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        int rand = (int) (Math.random() * plnm.length);
        String starName = plnm[rand];
        System.out.println("Welcome to " + starName + ".");
    }

    public void leaveRoom(Ship a) {
        a = null;
    }

    public String getPlanet() {
        return "GASE ";
    }

}
