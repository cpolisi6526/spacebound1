public class Enemy extends Ship implements badguys {
    public Enemy(){
        super("Enemy Ship");
    }
 //   public Enemy(){
     //   this.name=nameGenerator();
  //  }
    public String getName(){
        return name;
    }

    public String nameGenerator(){
        String[] enemynames= {"Noodle", "2D", "Murdock", "Russell", "Ursula", "Stewart"};
        int ran= (int) (Math.random()*enemynames.length);
        return enemynames[ran];
    }

    public String Greeting(){
        return "Hello. You found me. I'm " + name+ "It's time for battle.";
    }

    public String challenge(){
        String prob= "";
        return prob;
    }

}
