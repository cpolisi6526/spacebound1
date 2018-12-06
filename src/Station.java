public class Station extends Planet {
    public Station(int xLoc, int yLoc) {
        super(xLoc, yLoc);
    }
    public void enterRoom(Ship a){
        x=a;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);

        //welcomes to station
        System.out.println("Hey welcome to the United States Space Station. There are no bas guys here. Come and go as you please.");
    }
    public void leaveRoom(Ship a){
        a= null;
    }

    public String getPlanet(){
        return "STAT ";
    }

}
