package cz.csas.my.model;

import java.util.ArrayList;

public class Battlefield {
    private int rows;
    private int columns;
    private ArrayList<Ship> ships = new ArrayList<>();
    private ArrayList<Shot> shots = new ArrayList<>();

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public ArrayList<Shot> getShots() {
        return shots;
    }
}
