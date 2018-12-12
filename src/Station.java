public class Station extends Planet {
    public Station(int xLoc, int yLoc) {
        super(xLoc, yLoc);
    }
    public void enterRoom(MyShip a){
        x=a;
        a.setxLoc(this.xLoc);
        a.setyLoc(this.yLoc);

        //welcomes to station
        System.out.println("Hey welcome to the United States Space Station. There are no bad guys here. Come and go as you please.");
    }
    public void leaveRoom(Ship a){
        a= null;
    }

    public String getPlanet(){
        return "STAT ";
    }

}
