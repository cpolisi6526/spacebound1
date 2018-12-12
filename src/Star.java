public class Star extends Planet {
    // overloaded constructor
    public Star(){super(0,0);}
    public Star(int xLoc, int yLoc) {
        super(xLoc, yLoc);
    }

    public void enterRoom(MyShip a) {
        x = a;
        a.setxLoc(this.xLoc);
        a.setyLoc(this.yLoc);

        // randomly gives each star a unique name (slight chance of overlap)
        String[] stars = {"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Capricorn", "Aquarius", "Pisces"};
        int rand = (int) (Math.random() * stars.length);
        String starName = stars[rand];
        System.out.println("Welcome to the star of " + starName + ".");

        //add if else statement if occupied there's a challenge if not the person is able to be leave as they wish
        int dec= (int) (Math.random()*3)+1;
        if (dec==1){
            System.out.println("There's an enemy ship here.Be prepared for challenge.");
            System.out.println(Enemy.Greeting());
            Enemy.challenge();
        }
        if (dec==2){
            System.out.println("There's a Firefly here. Be careful. These guys are unpredictable.");
            System.out.println(Firefly.Greeting());
            Firefly.challenge();
        }
        else{
            System.out.println("Lucky no. No bad guys right now, come and go as you please.");
        }
}

    public void leaveRoom(MyShip a) {
        a = null;
    }

    public String getPlanet() {
        return "STAR ";
    }

    //public void

}
