package HW5.vehicles;

import HW5.details.Engine;
import HW5.professions.Driver;

public class SportCar extends Car {
    private double maxSpeed;

    public SportCar(String carModel, String carClass, double weight, Engine engine, Driver driver, double maxSpeed) {
        super(carModel, carClass, weight, engine, driver);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
