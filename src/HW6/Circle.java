package HW6;

public class Circle implements GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getFigureArea() {
        return this.radius * this.radius * Math.PI;
    }
}
