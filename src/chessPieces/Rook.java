package chessPieces;

public class Rook extends Pieces{
    public Rook(boolean whiteInput, int x, int y) {
        super(whiteInput,true, x, y, '♖');
        if (this.isWhite) {
            this.icon = '♖';
        } else {
            this.icon = '♜';
        }
    }
}
