import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class Chess {
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

    public static void main(String args[]) {
        System.out.println("Chess ♔");
        if (getInput("Start new game? Yes/No").equals("Yes")) {
            print2D(gameBoard);
        } else {
            System.out.println("ok.");
        }
    }
}
