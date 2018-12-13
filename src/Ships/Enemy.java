package Ships;

import Ships.badguys;
import runnerboard.Runner;

import java.util.Scanner;
// again w them class hierarchies
public class Enemy extends Ship implements badguys {

    public Enemy(){
        super("Enemy Ship");
    }

    public static String getName(String name){
        return name;
    }

    public static String Greeting(){
        String[] names= {"Astor", "Bastor", "Castor", "Dastor", "Fastor", "Gastor", "Sastor", "Zastor", "Mastor"};
        int np= (int) (Math.random()*names.length);
        String greeting= "Enemy Ship: Hello. You found me. I'm the Enemy Ship of " + names[np]+ ". It's time for battle.";
        return greeting;
    }
//its what asks the question when there is a bad guy occupying a planet
    public static void challenge(){
        String[] probs= {"What is the capital of the American State, NY?", "What is the Square root of 64?", "How do the Italians say hello?", "What is the acronym for aggregate demand?", "What country is known for their maple syrup?", "What color is the absence of all light?","How many full days are there in a leap year?", "What is 48 divided by 12?", "Which state was known to be bleeding?","What color are the bricks in 1N3?"};
        String[] ans= {"albany", "8", "ciao", "cignx", "canada", "black", "366","4", "Kansas", "yellow"};
        String output;
        int ran= (int) (Math.random() * probs.length);
        String p= probs[ran];
        System.out.println(p);
        Scanner input= new Scanner(System.in);
        String answer= input.nextLine().toLowerCase().trim();
        if (answer.equals(ans[ran])){
            output= "Enemy Ship : You're correct.... but next time try me. Are you going to leave yet?";
            System.out.println(output);
        }
        else{
            // shows right answer at end
            output= "Enemy Ship: You're wrong. The correct answer was " +
                    // code told me i had to do this or error
            new StringBuilder().append(ans[ran]).append(". Game over.").toString();
            System.out.println(output);
            /// turns off game if answer is wrong since user "died"
            Runner.gameOff();
        }

    }

}
