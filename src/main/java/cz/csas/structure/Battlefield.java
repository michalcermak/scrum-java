package cz.csas.structure;

import java.util.List;

public class Battlefield {
    private int rows;

    private int columns;

    private List<Ship> ships;

    private List<Position> shots;

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

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    public List<Position> getShots() {
        return shots;
    }

    public void setShots(List<Position> shots) {
        this.shots = shots;
    }
}
