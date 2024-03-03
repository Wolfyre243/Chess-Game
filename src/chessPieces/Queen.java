package chessPieces;

public class Queen extends Pieces {
    public Queen(boolean whiteInput, int x, int y) {
        super(whiteInput,true, x, y, '♕');
        if (this.isWhite) {
            this.icon = '♕';
        } else {
            this.icon = '♛';
        }
    }
}
