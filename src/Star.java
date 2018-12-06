
public class Star extends Planet {
    public Star(int xLoc, int yLoc){
        super(xLoc,yLoc);
    }

    public void enterRoom(Ship a){
        x=a;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);

        // randomly gives each star a unique name (slight chance of overlap)
        String[] stars= {"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Capricorn", "Aquarius", "Pisces"};
        int rand= (int) (Math.random() * stars.length);
        String starName= stars[rand];
        System.out.println("Welcome to the star of " + starName + ".");

        //add if else statement if occupied there's a challenge if not the person is able to be leave as they wish


    }
    public void leaveRoom(Ship a){
        a= null;
    }

    public String getPlanet(){
        return "STAR ";
    }

    //public void
}
