package HW5.vehicles;

import HW5.details.Engine;
import HW5.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String carModel, String carClass, double weight, Engine engine, Driver driver, int carrying) {
        super(carModel, carClass, weight, engine, driver);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
