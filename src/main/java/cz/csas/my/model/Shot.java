package cz.csas.my.model;

public class Shot extends Position {
    private boolean isHit;

    public Shot(int row, int column) {
        super(row, column);
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
