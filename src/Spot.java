import chessPieces.Pieces;

public class Spot {
    Pieces currentPiece;
    int x;
    int y;


    public Spot(Pieces setPiece, int xPos, int yPos) {
        currentPiece = setPiece;
        x = xPos;
        y = yPos;

    }
}
