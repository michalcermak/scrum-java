package cz.csas.my.util;

import cz.csas.my.model.Position;
import cz.csas.my.model.Ship;
import cz.csas.my.model.Shot;
import cz.csas.my.model.participants.BattleParticipant;

import java.util.Optional;

public class ShotUtil {
    public static boolean isHit(Shot shot, BattleParticipant participant) {
        boolean isHit = false;
        for (Ship ship : participant.getRivalBattlefield().getShips()) {
            Optional<Position> hitPosition = ship.getAllPositions().stream().filter(position -> position.getRow() == shot.getRow() && position.getColumn() == shot.getColumn()).findFirst();
            if (hitPosition.isPresent()) {
                ship.getAllPositions().remove(hitPosition.get());
                if (ship.getAllPositions().isEmpty()) {
                    ship.setDestroyed(true);
                }
                isHit = true;
            }
        }
        if (isHit) {
            System.out.println(participant.getPlayerType() + " hit!! " + shot.toString());
        } else {
            System.out.println(participant.getPlayerType() + " missed!! " + shot.toString());
        }
        return isHit;
    }
}
