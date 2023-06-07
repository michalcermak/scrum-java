package cz.csas.my.model.participants.services;

import cz.csas.my.model.Shot;

import java.util.Scanner;

public class PlayerService {

    private Scanner scanner;

    public PlayerService() {
        this.scanner = new Scanner(System.in);
    }

    public Shot shoot() {
        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int column = scanner.nextInt();

        return new Shot(row, column);
    }
}
