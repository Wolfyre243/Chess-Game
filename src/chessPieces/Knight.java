package chessPieces;

public class Knight extends Pieces{

    public Knight(boolean whiteInput, int x, int y) {
        super(whiteInput,true, x, y, '♘');
        if (this.isWhite) {
            this.icon = '♘';
        } else {
            this.icon = '♞';
        }
    }
}
