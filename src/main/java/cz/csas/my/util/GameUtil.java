package cz.csas.my.util;

import cz.csas.my.model.participants.BattleParticipant;

public class GameUtil {
    public static boolean gameFinished(BattleParticipant participant) {
        return participant.getRivalBattlefield().getShips().stream().allMatch(ship -> ship.isDestroyed());
    }
}
