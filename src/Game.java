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
        boolean moveAccepted = false;
        int[] pieceCoordinates = new int[2];
        int[] targetCoordinates = new int[2];

        System.out.println("Your turn, " + p.name + ". Please enter the coordinates of the piece you'd like to move.");

        //get the desired piece to move
        while (moveAccepted == false) {
            System.out.println("Enter the piece's coordinates [x, y]");
            for (int i = 0; i < pieceCoordinates.length; i++) {
                pieceCoordinates[i] = in.nextInt() - 1;
            }
            System.out.println("X: " + pieceCoordinates[0] + " Y: " + pieceCoordinates[1]);
            if (chessBoard.getPieceAt(pieceCoordinates) == null) {
                System.out.println("Invalid input!");
                pieceCoordinates = new int[2];
            } else if (chessBoard.getPieceAt(pieceCoordinates).isWhite != p.isWhite) {
                System.out.println("You have chosen a " + chessBoard.getPieceAt(pieceCoordinates).icon + " which isn't yours!");
                pieceCoordinates = new int[2];
            } else {
                System.out.println("You have chosen a " + chessBoard.getPieceAt(pieceCoordinates).icon);
                moveAccepted = true;
            }

        }
        moveAccepted = false;

        //get the target coords
        while (moveAccepted == false) {
            System.out.println("Enter the target coordinates [x, y]");
            for (int i = 0; i < targetCoordinates.length; i++) {
                targetCoordinates[i] = in.nextInt() - 1;
            }
            System.out.println("X: " + targetCoordinates[0] + " Y: " + targetCoordinates[1]);
            if (targetCoordinates[0] < 0 || targetCoordinates[0] > 7 || targetCoordinates[1] < 0 || targetCoordinates[1] > 7) {
                System.out.println("Invalid input!");
                targetCoordinates = new int[2];
            } else { //TODO: insert checking algorithm here; for now asssume its legal*
                //System.out.format("Moving " + chessBoard.getPieceAt(pieceCoordinates).icon + " at [%d, %d] to [%d, %d] \n", pieceCoordinates[0] + 1, pieceCoordinates[1] + 1, targetCoordinates[0] + 1, targetCoordinates[1] + 1);
                moveAccepted = true;
            }
        } //* check whether pieces are same colour, in range, etc
        moveAccepted = false;

        Move playerMove = new Move(chessBoard.getPieceAt(pieceCoordinates), targetCoordinates);
        //add this move to moveLogs in the future as well.
        p.setCurrentMove(playerMove);

        chessBoard.executeMove(p.getCurrentMove());

        chessBoard.updateGameBoard();
        print2D(chessBoard.getGameBoard());

    }

    public void startGame() {
        System.out.println("Game start!");

        enterPlayer(new Player(true, "Tom"));
        enterPlayer(new Player(false, "Harry"));
        chessBoard.updateGameBoard();
        print2D(chessBoard.getGameBoard());

        while (true) {
            processTurn(p1);
            processTurn(p2);
        }

        //add game logic here in the future


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
