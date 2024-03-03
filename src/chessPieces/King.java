package chessPieces;

public class King extends Pieces{
    public King(boolean whiteInput, int x, int y) {
        super(whiteInput,true, x, y, '♔');
        if (this.isWhite) {
            this.icon = '♔';
        } else {
            this.icon = '♚';
        }
    }
}
