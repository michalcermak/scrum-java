package cz.csas;

import cz.csas.structure.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private Battlefield playerBattlefield;
    private Battlefield aiBattlefield;

    private GameService gameService;

    private BotService botService;

    private Scanner scanner;

    public void setup() {
        this.playerBattlefield = generateBattlefield();
        this.aiBattlefield = generateBattlefield();
        this.gameService = new GameService();
        this.botService = new BotService(Difficulty.EASY);
        this.scanner = new Scanner(System.in);
    }

    public void play() {
        boolean gameInProgress = true;
        while (gameInProgress) {
            Position shoot = getPlayerShoot();
            boolean isUserHit = gameService.shoot(shoot, this.aiBattlefield);
            printHitMessage(isUserHit);
            Position aiShot = botService.generateShoot(this.playerBattlefield);
                boolean isAiHit = gameService.shoot(aiShot, this.playerBattlefield);
                System.out.println("AI shoot with position: " + aiShot.toString());
                printHitMessage(isAiHit);
                if (isAiHit && this.gameService.gameFinished(this.playerBattlefield)){
                    gameInProgress = false;
                }
            }
        }

    private static void printHitMessage(boolean isUserHit) {
        if (isUserHit) {
            System.out.println("Hit!!");
        } else {
            System.out.println("Miss!");
        }
    }

    Position getPlayerShoot() {
        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int col = scanner.nextInt();

        return new Position(row, col);
    }

    private Battlefield generateBattlefield() {
        Battlefield battlefield = new Battlefield();
        battlefield.setRows(10);
        battlefield.setColumns(10);
        battlefield.setShips(generateShips());
        return battlefield;
    }

    private List<Ship> generateShips() {
        ArrayList<Ship> ships = new ArrayList<>();
        Ship ship =  new Ship();
        ship.setDirection(Direction.HORIZONTAL);
        ship.setLength(4);
        ship.setPosition(new Position(5,5));
        ships.add(ship);
        return ships;
    }

}
