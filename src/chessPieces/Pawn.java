package chessPieces;

public class Pawn extends Pieces {

    public Pawn(boolean whiteInput, int x, int y) {
        super(whiteInput,true, x, y, '♙');
        if (this.isWhite) {
            this.icon = '♙';
        } else {
            this.icon = '♟';
        }

    }
}
