import java.util.Scanner;

public class Enemy extends Ship implements badguys {

    public Enemy(){
        super("Enemy Ship");
    }

    public static String getName(String name){
        return name;
    }

    public static String Greeting(){
        String greeting= "Enemy Ship: Hello. You found me. I'm Enemy Ship." + "It's time for battle.";
        return greeting;
    }

    public static void challenge(){
        String[] probs= {"What is the capital of the American State, NY?", "What is the Square root of 64?", "How do the Italians say hello?", "What is the acronym for aggregate demand?", "What country is known for their maple syrup?", "What color is the absence of all light?"};
        String[] ans= {"albany", "8", "ciao", "cignx", "canada", "black"};
        String output;
        int ran= (int) (Math.random() * probs.length);
        String p= probs[ran];
        System.out.println(p);
        Scanner input= new Scanner(System.in);
        String answer= input.nextLine();
        if (answer.equals(ans[ran])){
            output= "Enemy Ship : You're correct.... but next time try me. Are you going to leave yet?";
            System.out.println(output);
        }
        else{
            output= "Enemy Ship : You're wrong. The correct answer was " +
            new StringBuilder().append(ans[ran]).append(". Game over.").toString();
            System.out.println(output);
            Board.gameOff();
        }

    }

}
