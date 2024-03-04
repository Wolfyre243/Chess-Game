import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class Game {
    static Scanner in = new Scanner(System.in);
    static PrintWriter printWriter = new PrintWriter(System.out, true);

    public Game() { //TODO: add player parameters

    }

    public static String getInput(String message) {
        System.out.println(message);
        String input = in.nextLine();

        return input;
    }

    //Method accepts a 2D array and prints it in a matrix format
    //Time complexity of O(N), where N = number of rows i.e. arr[N][?]
    public static void print2D(char arr[][]) {
        for (char[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    //TODO: add enter player method here


    public static void main(String args[]) {
        while (true) {
            System.out.println("Chess ♔");
            if (!getInput("Start new game? Yes/No").equals("Yes")) {
                System.out.println("ok.");
                break;
            }

            //testing purposes:
            Player p1 = new Player(true);
            Player p2 = new Player(false);
            Board chessBoard = new Board();

            chessBoard.setPieces(p1);
            chessBoard.setPieces(p2);

            chessBoard.updateGameBoard();
            System.out.println("Current board:");
            print2D(chessBoard.getGameBoard());


        }

    }
}
