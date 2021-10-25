package HW6;

public class Square implements GeometricFigure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getFigureArea() {
        return this.a * this.a;
    }
}
