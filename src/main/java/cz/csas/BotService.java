package cz.csas;

import cz.csas.structure.Battlefield;
import cz.csas.structure.Difficulty;
import cz.csas.structure.Position;

import java.util.Random;

public class BotService {
    private Difficulty difficulty;

    public BotService(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Position generateShoot(Battlefield battlefield) {
        switch (difficulty) {
            case EASY: return generateShotEasy(battlefield);
            case MEDIUM: return generateShotMedium(battlefield);
            case HARD: return generateShotHard(battlefield);
            default: generateShotEasy(battlefield);
        }

        throw new IllegalArgumentException("Unknown difficulty");
    }

    private Position generateShotEasy(Battlefield battlefield) {

        int row = new Random().nextInt(battlefield.getRows());
        int column = new Random().nextInt(battlefield.getColumns());

        return new Position(row, column);
    }

    private Position generateShotMedium(Battlefield battlefield) {

        return generateShotEasy(battlefield);
    }

    private Position generateShotHard(Battlefield battlefield) {

        return generateShotEasy(battlefield);
    }
}