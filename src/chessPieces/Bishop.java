package chessPieces;

public class Bishop extends Pieces{

    public Bishop(boolean whiteInput, int x, int y) {
        super(whiteInput,true, x, y, '♗');
        if (this.isWhite) {
            this.icon = '♗';
        } else {
            this.icon = '♝';
        }
    }
}
