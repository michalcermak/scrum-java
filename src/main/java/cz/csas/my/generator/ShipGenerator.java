package cz.csas.my.generator;

import cz.csas.my.model.Direction;
import cz.csas.my.model.Position;
import cz.csas.my.model.Ship;

public class ShipGenerator {
    public Ship generateShip(int row, int column, int length, Direction direction) {
        return new Ship(new Position(row, column), direction, length);
    }
}
