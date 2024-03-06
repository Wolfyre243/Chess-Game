import chessPieces.Pieces;

import java.util.Arrays;

public class Board {
    private Spot[][] spots;
    private char[][] gameBoard;

    public Board() {
        spots = new Spot[8][8];
        gameBoard = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                spots[j][i] = new Spot(i, j);
            }
        }

    }

    public void setPieces(Player p) {
        //TODO: write code that places a Player's pieces at their respective starting positions, using the player's current list of pieces
        for (int i = 0; i < p.getPlayerPieces().size(); i++) {
            //very hard to understand; let me break it down
            spots[p.getPlayerPieces().get(i).getX()][p.getPlayerPieces().get(i).getY()].occupySpot(p.getPlayerPieces().get(i));
            //p.getPlayerPieces().get(i).getX() -> returns X value of the first piece in Player p's 'inventory'
            //p.getPlayerPieces().get(i).getY() -> same as above but Y value
            //occupySpot(p.getPlayerPieces().get(i) -> this method is accessed from spots[x][y], which returns the Spot object in the 2D array
            //the occupySpot() method will replace the current piece there with the argument within its parentheses.
        }
    }

    public void updateGameBoard() {
        //iterate through spots[][] 2D matrix to change the respective pieces
        for (Spot[] row : this.spots) {
            for (Spot currentSpot : row ) {
                if (currentSpot.getPiece() != null) {
                    gameBoard[currentSpot.x][currentSpot.y] = currentSpot.getPiece().icon;
                } else {
                    gameBoard[currentSpot.x][currentSpot.y] = '☐';
                }
            }
        }
    }

    public char[][] getGameBoard() {
        return gameBoard;
    }

    public Pieces getPieceAt(int[] arr) {
        //arr[0] is x coord and arr[1] is y coord.
        return spots[arr[0]][arr[1]].getPiece();
    }

}
