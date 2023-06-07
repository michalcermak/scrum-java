package cz.csas.my.service;
import cz.csas.my.generator.BattlefieldGenerator;
import cz.csas.my.model.Battlefield;
import cz.csas.my.model.Difficulty;
import cz.csas.my.model.Shot;
import cz.csas.my.model.participants.AI;
import cz.csas.my.model.participants.BattleParticipant;
import cz.csas.my.model.participants.Player;
import cz.csas.my.model.participants.ParticipantActions;

import static cz.csas.my.util.GameUtil.gameFinished;

public class GameService {

    private ParticipantActions participant1;
    private ParticipantActions participant2;

    private BattlefieldGenerator battlefieldGenerator;

    private boolean gameInProgress;
    private boolean isPlayer1Turn;

    public GameService() {
        this.battlefieldGenerator = new BattlefieldGenerator();
    }

    public void setupGame() {
        Battlefield player1battlefield = this.battlefieldGenerator.generateBattlefield();
        Battlefield player2battlefield = this.battlefieldGenerator.generateBattlefield();
        participant1 = new Player(player1battlefield, player2battlefield);
        participant2 = new AI(Difficulty.EASY, player2battlefield, player1battlefield);
        this.gameInProgress = true;
        this.isPlayer1Turn = true;
    }

    public void startGame() {
        while (gameInProgress) {
            ParticipantActions participant;
            if (isPlayer1Turn) {
                participant = participant1;
            } else {
                participant = participant2;
            }
            Shot shot = participant.shoot();
            if (shot.isHit()) {
                BattleParticipant battleParticipant = (BattleParticipant) participant;
                if (gameFinished(battleParticipant)) {
                    gameInProgress = false;
                    System.out.println("Game is finished, " + battleParticipant.getPlayerType() + " is won!");
                }
            } else {
                switchPlayer();
            }
        }
    }

    private void switchPlayer() {
        isPlayer1Turn = !isPlayer1Turn;
    }
}
