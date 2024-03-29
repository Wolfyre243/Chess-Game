import chessPieces.*;

import java.util.ArrayList;

public class Player {
    public boolean isWhite;
    public String name;
    private ArrayList<Pieces> playerPieces = new ArrayList<Pieces>();

    private Move currentMove;

    public Player(boolean isWhite, String inputName) {
        this.isWhite = isWhite;
        this.name = inputName;
        createPieces();

        System.out.println("Welcome, " + this.name + "!");
    }

    public ArrayList<Pieces> getPlayerPieces() {
        return this.playerPieces;
    }

    public void createPieces() {

        if (this.isWhite) {
            //create white pawns
            for (int i = 0; i < 8; i++) {
                this.playerPieces.add(new Pawn(true, i, 6));
            }
            //create the rest of the white pieces
            this.playerPieces.add(new Knight(true, 1, 7));
            this.playerPieces.add(new Knight(true, 6, 7));
            this.playerPieces.add(new Bishop(true, 2, 7));
            this.playerPieces.add(new Bishop(true, 5, 7));
            this.playerPieces.add(new Rook(true, 0, 7));
            this.playerPieces.add(new Rook(true, 7, 7));
            this.playerPieces.add(new Queen(true, 3, 7));
            this.playerPieces.add(new King(true, 4, 7));

        } else {
            //create black pawns
            for (int i = 0; i < 8; i++) {
                this.playerPieces.add(new Pawn(false, i, 1));
            }
            //create the rest of the black pieces
            this.playerPieces.add(new Knight(false, 1, 0));
            this.playerPieces.add(new Knight(false, 6, 0));
            this.playerPieces.add(new Bishop(false, 2, 0));
            this.playerPieces.add(new Bishop(false, 5, 0));
            this.playerPieces.add(new Rook(false, 0, 0));
            this.playerPieces.add(new Rook(false, 7, 0));
            this.playerPieces.add(new Queen(false, 3, 0));
            this.playerPieces.add(new King(false, 4, 0));
        }

        //System.out.println(this.name + "'s pieces: " + playerPieces.toString());
    }


    public Move getCurrentMove() {
        return currentMove;
    }

    public void setCurrentMove(Move currentMove) {
        this.currentMove = currentMove;
    }
}
