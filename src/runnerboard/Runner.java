package runnerboard;

import Ships.MyShip;

import java.util.Scanner;

public class Runner {
    private static boolean gameOn = true;

    public static void main(String[] args) {
        Board a;
        Scanner in = new Scanner(System.in);
        System.out.println("Hello there welcome to my galaxy. I'm glad you're here to explore and fight. What's your name?");
        String name = in.nextLine();
        MyShip player1 = new MyShip(0, 0);
        System.out.println("Hey " + name + ". I'm glad you're here to fight off enemy ships.Do you want a 'hard', 'medium' or 'essy' battle? Warning: you lose a challenge, the game ends.");
        String response = in.nextLine();
        if (response.equals("hard")) {
            a = new Board(6);
        } else if (response.equals("medium")) {
            a = new Board(5);
        } else if (response.equals("easy")) {
            a = new Board(3);
        } else {
            System.out.println("Hey that's not a valid response so we chose a random level for you");
            a = new Board();
        }
        a.fill();
        a.edit();
        System.out.println("\n Here's a map of the universe... you won't be able to see where the bad guys are but hopefully it helps. You're the X. " +
                "\n Also, there is no winning here. You play until you the enemies kill you, like in real life. Good luck.");
        System.out.println(a.print(player1));


       // a[0][0].enterRoom(player1);
        while (gameOn) {
            //char moves and it prints map after each move
            System.out.println("Let's fly. Where you want to go? (Choose N, S, E, W)");
            String move = in.nextLine();
            if (a.validMove(move, player1)) {
                System.out.println(a.print(player1));

            } else {
                System.out.println(name+ " , that's outside the realms of the universe.");
            }


        }
        in.close();
    }




    public static void gameOff()
    {
        gameOn = false;
    }
}
