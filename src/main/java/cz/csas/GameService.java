package cz.csas;

import cz.csas.structure.Battlefield;
import cz.csas.structure.Direction;
import cz.csas.structure.Position;
import cz.csas.structure.Ship;

public class GameService {

    boolean shoot(Position shoot, Battlefield battlefield) {
        for (Ship ship : battlefield.getShips()) {
            if (isShipHit(shoot, ship)) {
                return true;
            }
        }
        return false;
    }

    boolean gameFinished(Battlefield battlefield) {
        return false;
    }

    boolean isShipHit(Position shoot, Ship ship) {
        if (Direction.HORIZONTAL == ship.getDirection()) {
            int colStart = ship.getPosition().getCol();
            int colEnd = colStart + ship.getLength() - 1;
            if (shoot.getRow() == ship.getPosition().getRow() && (colStart <= shoot.getCol() && shoot.getCol() <= colEnd)) {
                return true;
            }
        } else {
            int rowStart = ship.getPosition().getRow();
            int rowEnd = rowStart + ship.getLength() - 1;
            if (shoot.getCol() == ship.getPosition().getCol() && (rowStart <= shoot.getRow() && shoot.getRow() <= rowEnd)) {
                return true;
            }
        }
        return false;
    }
}


