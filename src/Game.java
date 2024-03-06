import chessPieces.Pawn;
import chessPieces.Pieces;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class Game {
    static Scanner in = new Scanner(System.in);
    static PrintWriter printWriter = new PrintWriter(System.out, true);

    final Board chessBoard;
    Player p1;
    Player p2;

    ArrayList<String> moveInputArr = new ArrayList<String>(5);
    boolean moveAccepted = false;
    Pieces chosenPiece;


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
    public static void print2D(char[][] arr) {
        for (char[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void enterPlayer(Player player) {
        if (p1 == null) {
            this.p1 = player;
        } else if (p2 == null) {
            this.p2 = player;
        } else {
            return;
        }

        chessBoard.setPieces(player);
    }

    public void processTurn(Player p) {
        System.out.println("Your turn, " + this.p1.name + ". Please enter the coordinates of the piece you'd like to move.");
        //get the selected piece
//        String pieceID = getInput("Select a piece to move: P/N/B/R/Q/K");
//        while (pieceID.matches("(?i)[PNBRQK]")) {
//            //repeatedly ask for another response for the pieceID
//            System.out.println("Invalid input.");
//            pieceID = getInput("Select a piece to move: P/N/B/R/Q/K");
//        }
        int[] pieceCoordinates = new int[2];
        //get the desired coords
        while (!moveAccepted) {
            System.out.println("Enter the target coordinates [x, y]");
            for (int i = 0; i < pieceCoordinates.length; i++) {
                pieceCoordinates[0] = in.nextInt();
                pieceCoordinates[1] = in.nextInt();
            }
            System.out.println("X: " + pieceCoordinates[0] + " Y: " + pieceCoordinates[1]);
            if (chessBoard.getPieceAt(pieceCoordinates) == null) {
                System.out.println("Invalid input!");
            } else {
                System.out.println("You have chosen a " + chessBoard.getPieceAt(pieceCoordinates).icon);
                moveAccepted = true;
            }

        }





    }

    public void startGame() {
        System.out.println("Game start!");

        enterPlayer(new Player(true, "Tom"));
        enterPlayer(new Player(false, "Harry"));
        chessBoard.updateGameBoard();

        //add game logic here in the future
        print2D(chessBoard.getGameBoard());
    }


    public static void main(String args[]) {
        while (true) {
            System.out.println("Chess ♔ by Wolfyre");
            if (!getInput("Start new game? Yes/No").equals("Yes")) {
                System.out.println("ok.");
                break;
            }

            Game currentGame = new Game();
            currentGame.startGame();


        }

    }
}
