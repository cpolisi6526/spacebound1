public class Gaseous extends Planet {
    public Gaseous(int xLoc, int yLoc) {
        super(xLoc, yLoc);
    }
    public void enterRoom(Ship a){
        x=a;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);

        // names each gase planet
        String[] plnm= {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        int rand= (int) (Math.random() * plnm.length);
        String starName= plnm[rand];
        System.out.println("Welcome to " + starName + ".");
    }
    public void leaveRoom(Ship a){
        a= null;
    }

    public String getPlanet(){
        return "GASE ";
    }

    public boolean enemyCheck(Enemy[] a) {
        for (int index = 0; index < a.length; index++) {
            if (a[index].getxLoc() == xLoc && a[index].getyLoc() == yLoc) {
                return true;
            }
        }
        return false;
    }

    public boolean fireflyCheck(Firefly[] b){
        for (int index = 0; index < b.length; index++) {
            if (b[index].getxLoc() == xLoc && b[index].getyLoc() == yLoc) {
                return true;
            }
        }
        return false;
    }
}

