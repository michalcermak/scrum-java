package cz.csas.my.model.participants;

import cz.csas.my.model.Difficulty;
import cz.csas.my.model.Shot;
import cz.csas.my.model.participants.services.AIService;
import cz.csas.my.model.Battlefield;

import static cz.csas.my.util.ShotUtil.isHit;

public class AI extends BattleParticipant implements ParticipantActions {

    private AIService aiService;
    private Difficulty difficulty;

    public AI(Difficulty difficulty, Battlefield battlefield, Battlefield rivalBattlefield) {
        super(ParticipantType.AI, battlefield, rivalBattlefield);
        this.aiService = new AIService(difficulty);
        this.difficulty = difficulty;
    }
    @Override
    public Shot shoot() {
        Shot shot = this.aiService.shoot(super.getRivalBattlefield());
        shot.setHit(isHit(shot, this));
        getRivalBattlefield().getShots().add(shot);
        return shot;
    }
}
