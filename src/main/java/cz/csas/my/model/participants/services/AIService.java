package cz.csas.my.model.participants.services;

import cz.csas.my.model.Battlefield;
import cz.csas.my.model.Difficulty;
import cz.csas.my.model.Shot;

import java.util.Random;

public class AIService {

    private Difficulty difficulty;

    public AIService(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Shot shoot(Battlefield battlefield) {
        switch (difficulty) {
            case EASY: return generateShotEasy(battlefield);
            case MEDIUM: return generateShotEasy(battlefield);
            case HARD: return generateShotEasy(battlefield);
            default: return generateShotEasy(battlefield);
        }
    }

    private Shot generateShotEasy(Battlefield battlefield) {
        int row = new Random().nextInt(battlefield.getRows());
        int column = new Random().nextInt(battlefield.getColumns());

        return new Shot(row, column);
    }
}
