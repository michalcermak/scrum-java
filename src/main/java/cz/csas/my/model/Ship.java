package cz.csas.my.model;

import java.util.HashSet;
import java.util.Set;

public class Ship {
    private Position position;
    private Direction direction;
    private int length;
    private Set<Position> allPositions;
    private boolean isDestroyed;

    public Ship(Position position, Direction direction, int length) {
        this.position = position;
        this.direction = direction;
        this.length = length;
        this.isDestroyed = false;
        this.allPositions = new HashSet<>();
        countAllPositions();
    }

    private void countAllPositions() {
        for(int i = 0; i < length; i++) {
            int row = position.getRow();
            int column = position.getColumn();
            if (direction == Direction.HORIZONTAL) {
                column += i;
            } else {
                row += i;
            }
            this.allPositions.add(new Position(row, column));
        }
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Set<Position> getAllPositions() {
        return allPositions;
    }

    public void setAllPositions(Set<Position> allPositions) {
        this.allPositions = allPositions;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }
}
