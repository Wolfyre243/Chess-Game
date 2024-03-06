import chessPieces.Pieces;

public class Move {
    public Pieces selectedPiece;
    public int[] targetC;

    public Move(Pieces piece, int[] targetCoords) {
        this.selectedPiece = piece;
        this.targetC = targetCoords;
    }
}
