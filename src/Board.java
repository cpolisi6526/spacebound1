import java.util.Scanner;

public class Board {


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
    }

    public static void fill(Planet[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = new Star(row, col);
            }
        }
    }

    public static void edit(Planet[][] board) {
        int randomx = (int) Math.random() * board.length;
        int randomy = (int) Math.random() * board.length;
        board[randomx][randomy] = new Station(randomx, randomy);
        for (int b = 0; b < board.length % 3; b++) {
            randomx = (int) Math.random() * board.length;
            randomy = (int) Math.random() * board.length;
            board[randomx][randomy] = new Gaseous(randomx, randomy);
        }
    }

    public static String print(Planet[][] board) {
        String print = "";
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == Star(row, col)) {
                    print = print + "Star ";
                }
                if (board[row][col] == Gaseous(row, col)) {
                    print = print + "Gaseous ";
                }
                if (board[row][col] == Station(row, col)) {
                    print = print + "Station ";
                }
            }
            print = print + "\n";
        }
        return print;
    }
}
