import java.util.Arrays;

public class Board {
    private Spot[][] spots;

    public Board() {
        spots = new Spot[8][8];

    }

    public void setPieces(Player p) {
        //TODO: write code that places a Player's pieces at their respective starting positions, using the player's current list of pieces
        for (int i = 0; i < p.getPlayerPieces().size(); i++) {
            //very hard to understand; let me break it down
            spots[p.getPlayerPieces().get(i).getX()][p.getPlayerPieces().get(i).getY()].occupySpot(p.getPlayerPieces().get(i));
            //p.getPlayerPieces().get(i).getX() -> returns X value of the first piece in Player p's 'inventory'
            //p.getPlayerPieces().get(i).getY() -> same as above but Y value
            //occupySpot(p.getPlayerPieces().get(i) -> this method is accessed from spots[x][y], which returns the Spot object in the 2D array
            //the occupySpot() method will replace the current piece there with the argument within its parentheses.
        }
    }



}
