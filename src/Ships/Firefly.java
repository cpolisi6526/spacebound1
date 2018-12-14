package Ships;

import Ships.badguys;
import runnerboard.Runner;

import java.util.Scanner;

public class Firefly extends Ship implements badguys {

    public Firefly(){
    super("Firefly");
}
    public static String Greeting(){
     String greeting= "Firefly: I'm so big and powerful. Do I want to mess with you right now? Find out.";
     return greeting;
}
    public static void challenge(){
        String[] probs= {"What is the capital of the American State, OR ?", "What is the Square root of 169?", "Where on a cranium is a bipedal's foreum magnum located?", "What is Parker Straight's 800 pr?", "What branch of language does English originate from" +
                "?", "Who is the best first period Computer Science teacher in 1N3?", "What planet was wrongfully declared not a planet semi-recently?", "Who is the fastest high school red head in the country?","What is America's most followed religion?"};
        String[] ans= {"salem", "13", "bottom", "1:58", "germanic", "mr.folwell", "pluto", "evan sherman", "football"};
        String output;
        int ran= (int) (Math.random() * probs.length);
        String p= probs[ran];
        System.out.println(p);
        Scanner input= new Scanner(System.in);
        String answer= input.nextLine().toLowerCase().trim();
        if (answer.equals(ans[ran])){
            output= "Firefly: Sweet! Good job, fun messing with you visit anytime.";
            System.out.println(output);
        }
        else{
            // sorry for the mean language the firefly is so sporadic
            output="Firefly: Stupid. Have fun in hell. The correct answer was " + ans[ran] + "\n Game over";
            System.out.println(output);
            Runner.gameOff();
        }
    }

}

