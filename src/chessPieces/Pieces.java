package chessPieces;

public abstract class Pieces {
    public boolean isWhite;
    private boolean isAlive;

    private int x;
    private int y;

    public char icon;

    public Pieces(boolean whiteInput, boolean isAlive, int x, int y, char iconInput) {
        isWhite = whiteInput;
        this.isAlive = isAlive;

        this.x = x;
        this.y = y;

        icon = iconInput;
    }

    public void setStatus(boolean status) {
        this.isAlive = status;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
