package HW6;

public class Triangle implements GeometricFigure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getFigureArea() {
        /*
        Формула Герона для вычисления площади треугольника.
        S = √ p * (p − a) * (p − b) * (p − c),
        где a, b, c — стороны, p — полупериметр, который можно найти по формуле: p = (a + b + c) : 2
        */
        double p = (this.a + this.b + this.c) / 2;
        double differenceMultiplication = p * (p - this.a) * (p - this.b) * (p - this.c);
        return Math.sqrt(differenceMultiplication);
    }
}

