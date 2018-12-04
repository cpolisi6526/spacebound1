public class Gaseous extends Planet {
    public Gaseous(int xLoc, int yLoc) {
        super(xLoc, yLoc);
    }
    public void enterRoom(Ship a){
        x=a;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void leaveRoom(Ship a){
        a= null;
    }

    public String getPlanet(){
        return "GASE ";
    }
}

