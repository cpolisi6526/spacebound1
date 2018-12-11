import java.util.Scanner;

public class Enemy extends Ship implements badguys {

    public Enemy(){
        super("Enemy Ship");
    }

    public String getName(){
        return name;
    }

    public static String nameGenerator(){
        String[] enemynames= {"Noodle", "2D", "Murdock", "Russell", "Ursula", "Stewart"};
        int ran= (int) (Math.random()*enemynames.length);
        return enemynames[ran];
    }

    //public Enemy(){
     //   super(nameGenerator());
   // }

    public static String Greeting(){
        String greeting= name+ ": Hello. You found me. I'm " + name + "It's time for battle.";
        return greeting;
    }

    public static void challenge(){
        String[] probs= {"What is the capital of the American State, NY?", "What is the Square root of 64?", "How do the Italians say hello?", "What is the acronym for aggregiate demand?"};
        String[] ans= {"albany", "8", "ciao", "cignx"};
        String output;
        int ran= (int) (Math.random() * probs.length);
        String p= probs[ran];
        System.out.println(p);
        Scanner input= new Scanner(System.in);
        String answer= input.nextLine();
        if (answer == ans[ran]){
            output= name+ ": You're correct.... but next time try me. Are you going to leave yet?";
            System.out.println(output);
        }
        else{
            output= name+ ": You're wrong. Game over.";
            System.out.println(output);
            Board.gameOff();
        }

    }

}
