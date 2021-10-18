package HW5.vehicles;

import HW5.details.Engine;
import HW5.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private double weight;
    Engine engine;
    Driver driver;

    public Car(String carModel, String carClass, double weight, Engine engine, Driver driver) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public static void start() {
        System.out.println("Поехали");
    }

    public static void stop() {
        System.out.println("Останавливаемся");
    }

    public static void turnRight() {
        System.out.println("Поворот направо");
    }

    public static void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
