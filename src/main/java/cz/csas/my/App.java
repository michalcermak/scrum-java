package cz.csas.my;

import cz.csas.my.service.GameService;

public class App {

    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.setupGame();
        gameService.startGame();
    }
}
