package runnerboard;

import Planets.Gaseous;
import Planets.Planet;
import Planets.Star;
import Planets.Station;
import Ships.MyShip;

public class Board {
    Planet[][] a;
    int w;
    // look i understand overloading constructors
    public Board(int wid){
        this.a= new Planet[wid][wid];
        this.w= wid;
    }
    public Board(){
        this.a= new Planet[4][4];
        this.w=4;
    }
// a getter? crazy
    public int getW() {
        return w;
    }

    // fills board w the Planets.Planet star
    public void fill() {
        for (int row = 0; row < w; row++) {
            for (int col = 0; col < w; col++) {
                a[row][col] = new Star(row, col);
            }
        }
    }

    // rnadomly edits board w other planets
    public  void edit() {
        int x, y = 0;
        for (int b = 0; b < 3; b++) {
            x = (int) (Math.random() * w);
            y = (int) (Math.random() * w);
            a[x][y] = new Station(x, y);
        }
        for (int b = 0; b < 5; b++) {
            x = (int) (Math.random() * w);
            y = (int) (Math.random() * w);
            a[x][y] = new Gaseous(x, y);
        }
    }
    //prints my beautiful  board
    public  String print(MyShip player1) {
        String str = "";
        for (int row = 0; row < w; row++) {
            for (int col = 0; col < w; col++) {
                if ((row== player1.getxLoc()) && (col== player1.getyLoc()) ){
                    str= str + player1.getPlanet();
                }
                else{
                    str = str + a[row][col].getPlanet();
                }
            }
            str = str + "\n";
        }

        return str;
    }
    //thx mr levin i made it instance tho
    public boolean validMove(String move, MyShip p) {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0) {
                    a[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    a[p.getxLoc() - 1][p.getyLoc()].enterRoom(p);
                    return true;
                } else {
                    return false;
                }
            case "e":
                if (p.getyLoc() < a[p.getyLoc()].length - 1) {
                    a[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    a[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                } else {
                    return false;
                }

            case "s":
                if (p.getxLoc() < w - 1) {
                    a[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    a[p.getxLoc() + 1][p.getyLoc()].enterRoom(p);
                    return true;
                } else {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0) {
                    a[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    a[p.getxLoc()][p.getyLoc() - 1].enterRoom(p);
                    return true;
                } else {
                    return false;
                }
            default:
                break;
        }
        return true;
    }

}
