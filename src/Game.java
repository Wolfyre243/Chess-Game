import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class Game {
    static Scanner in = new Scanner(System.in);
    static PrintWriter printWriter = new PrintWriter(System.out, true);

    static char[][] gameBoard = {
            {'♜','♞','♝','♛','♚','♝','♞','♜'},
            {'♟','♟','♟','♟','♟','♟','♟','♟',},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',},
            {'♙','♙','♙','♙','♙','♙','♙','♙',},
            {'♖','♘','♗','♕','♔','♗','♘','♖'}

    };

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

/*
    public static void parseMove(String moveInput) {
        for (char letter : moveInput.toCharArray()) {
            if (Character.isUpperCase(letter)) {

            }
        }
    }
*/

    public static void main(String args[]) {
        while (true) {
            System.out.println("Chess ♔");
            if (!getInput("Start new game? Yes/No").equals("Yes")) {
                System.out.println("ok.");
                break;
            }

/*
            print2D(gameBoard);
            System.out.println("Please enter your move in the format: e4; Qxc6; etc.");
            //White goes first
            String whiteMove = getInput("Your move, white!");
*/          Player p1 = new Player(true);



        }

    }
}
