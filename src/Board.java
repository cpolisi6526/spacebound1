import java.util.Scanner;

public class Board {
    private static boolean gameOn = true;

    public static void main(String[] args) {
        Planet[][] board;
        Scanner in = new Scanner(System.in);
        System.out.println("Hello there welcome to my galaxy. I'm glad you're here to explore and fight. What's your name?");
        String name = in.nextLine();
        System.out.println("Hey " + name + ". I'm glad you're here to fight off enemy ships.Do you want a 'hard', 'medium' or 'essy' battle?");
        String response = in.nextLine();
        if (response.equals("hard")) {
            board = new Planet[9][9];
        } else if (response.equals("medium")) {
            board = new Planet[6][6];
        } else if (response.equals("easy")) {
            board = new Planet[3][3];
        } else {
            System.out.println("Hey that's not a valid response so we chose a random level for you");
            board = new Planet[4][4];
        }

        fill(board);
        edit(board);
        System.out.println("Here's a map of the universe... you won't be able to see where the bad guys are but hopefully it helps.");
        System.out.println(print(board));

        MyShip player1= new MyShip(0,0);
        board[0][0].enterRoom(player1);
        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, board)){
            System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
            }
            else {
                System.out.println("Please choose a valid move.");
            }


        }
        in.close();
    }
    }

    public static void fill(Planet[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = new Star(row, col);
            }
        }
    }

    public static void edit(Planet[][] board) {
        int x,y=0;
        for (int b=0; b<3; b++) {
            x = (int) (Math.random() * board.length);
            y = (int) (Math.random() * board.length);
            board[x][y] = new Station(x, y);
        }
        for (int b = 0; b < 5; b++) {
            x = (int) (Math.random() * board.length);
            y = (int) (Math.random() * board.length);
            board[x][y] = new Gaseous(x, y);
        }
    }

    public static String print(Planet[][] board, MyShip player1) {
        String str = "";
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col].getPlanet()== )
                str = str + board[row][col].getPlanet();
            }
            str = str + "\n";
        }
        return str;
    }

    public static boolean validMove(String move, Ship p, Planet[][] map) {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0) {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc() - 1][p.getyLoc()].enterRoom(p);
                    return true;
                } else {
                    return false;
                }
            case "e":
                if (p.getyLoc() < map[p.getyLoc()].length - 1) {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                } else {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1) {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc() + 1][p.getyLoc()].enterRoom(p);
                    return true;
                } else {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0) {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() - 1].enterRoom(p);
                    return true;
                } else {
                    return false;
                }
            default:
                break;

        }
    }
    public static void gameOff()
    {
        gameOn = false;
    }
}
