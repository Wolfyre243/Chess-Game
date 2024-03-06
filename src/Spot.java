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

    public Pieces occupySpot(Pieces inboundPiece) {
        Pieces original = this.currentPiece;
        //set the piece here as dead (i.e. false) if there is one here
        if (this.currentPiece != null) {
            this.currentPiece.setStatus(false);
        }
        //set the inboundPiece here
        this.currentPiece = inboundPiece;
        //for debugging
        //System.out.println("A " + original.icon + " was replaced by a " + inboundPiece.icon);
        return original;
    }

    public void releaseSpot() {
        //Pieces releasedPiece = this.currentPiece;
        this.currentPiece = null; //sets the piece of this spot as null
        //return releasedPiece;
    }

    public Pieces getPiece() {
        return this.currentPiece;
    }
}
