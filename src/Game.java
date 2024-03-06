import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class Game {
    static Scanner in = new Scanner(System.in);
    static PrintWriter printWriter = new PrintWriter(System.out, true);

    final Board chessBoard;
    Player p1;
    Player p2;


    public Game() {
        chessBoard = new Board();
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

    public boolean enterPlayer(Player player) {
        if (p1 == null) {
            this.p1 = player;
        } else if (p2 == null) {
            this.p2 = player;
        } else {
            return false;
        }

        chessBoard.setPieces(player);
        return true;
    }

    public void startGame() {
        System.out.println("Game start!");

        enterPlayer(new Player(true, "Tom"));
        enterPlayer(new Player(false, "Harry"));
        chessBoard.updateGameBoard();

        //add game logic here in the future
        print2D(chessBoard.getGameBoard());

        System.out.println("Your turn, " + this.p1.name + ".");



    }


    public static void main(String args[]) {
        while (true) {
            System.out.println("Chess ♔");
            if (!getInput("Start new game? Yes/No").equals("Yes")) {
                System.out.println("ok.");
                break;
            }

            Game currentGame = new Game();
            currentGame.startGame();


        }

    }
}
