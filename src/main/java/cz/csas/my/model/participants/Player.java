package cz.csas.my.model.participants;

import cz.csas.my.model.Battlefield;
import cz.csas.my.model.Shot;
import cz.csas.my.model.participants.services.PlayerService;

import static cz.csas.my.util.ShotUtil.isHit;

public class Player extends BattleParticipant implements ParticipantActions {

    private PlayerService playerService;

    public Player(Battlefield battlefield, Battlefield rivalBattlefield) {
        super(ParticipantType.PLAYER, battlefield, rivalBattlefield);
        this.playerService = new PlayerService();
    }
    @Override
    public Shot shoot() {
        Shot shot = this.playerService.shoot();
        shot.setHit(isHit(shot, this));
        getRivalBattlefield().getShots().add(shot);
        return shot;
    }
}
