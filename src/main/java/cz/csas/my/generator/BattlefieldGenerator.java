package cz.csas.my.generator;

import cz.csas.my.model.Battlefield;
import cz.csas.my.model.Direction;

public class BattlefieldGenerator {

    private ShipGenerator shipGenerator;

    public BattlefieldGenerator() {
        this.shipGenerator = new ShipGenerator();
    }

    public Battlefield generateBattlefield() {
        Battlefield battlefield = new Battlefield();
        battlefield.setRows(10);
        battlefield.setColumns(10);
        battlefield.getShips().add(this.shipGenerator.generateShip(5, 5, 3, Direction.HORIZONTAL));
        battlefield.getShips().add(this.shipGenerator.generateShip(2, 2, 4, Direction.VERTICAL));
        return battlefield;
    }
}
