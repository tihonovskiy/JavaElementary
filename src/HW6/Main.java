package HW6;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Triangle triangle = new Triangle(2, 3, 4);
        Square square = new Square(7.7);

        GeometricFigure[] geometricFigures = {circle, triangle, square};

        System.out.println("geometricFigures[Circle] = " + geometricFigures[0].getFigureArea());
        System.out.println("geometricFigures[Triangle] = " + geometricFigures[1].getFigureArea());
        System.out.println("geometricFigures[Square] = " + geometricFigures[2].getFigureArea());

        System.out.println("Sum of areas of figures = " + getSumAreasFigures(geometricFigures));
    }

    private static double getSumAreasFigures(GeometricFigure[] geometricFigures) {
        double sumAreasFigures = 0;

        for(GeometricFigure figure : geometricFigures) {
            sumAreasFigures += figure.getFigureArea();
        }

        return sumAreasFigures;
    }
}
