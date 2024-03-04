import chessPieces.Pieces;

public class Spot {
    private Pieces currentPiece;
    int x;
    int y;


    public Spot(int xPos, int yPos) {
        currentPiece = null;
        x = xPos;
        y = yPos;

    }

    public void occupySpot(Pieces inboundPiece) {
        Pieces original = this.currentPiece;
        //set the piece here as dead (i.e. false) if there is one here
        if (this.currentPiece != null) {
            this.currentPiece.setStatus(false);
        }
        //set the inboundPiece here
        this.currentPiece = inboundPiece;
        //for debugging
        //System.out.println("A " + original.getClass().getName() + " was replaced by a " + inboundPiece.getClass().getName());

    }

    public Pieces getPiece() {
        return this.currentPiece;
    }
}
