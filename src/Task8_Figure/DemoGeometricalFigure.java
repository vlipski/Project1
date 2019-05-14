package Task8_Figure;

import static Task8_Figure.ShapeUtils.validateFigure;

public class DemoGeometricalFigure {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3.0,7.0,4.0);
        Triangle.InCircle triangCircle1 = triangle1.new InCircle();
        Triangle triangle2 = new Triangle(6.0,4.0,3.0);
        Triangle.InCircle triangCircle2 = triangle2.new InCircle();
        System.out.println(triangle1.toString());
        System.out.println(triangCircle1.toString());
        System.out.println(triangle2.toString());
        System.out.println(triangCircle2.toString());
        triangle1.equalsArea(triangle2);
        validateFigure(triangle1);
        Figure square1 = new Square(4.0);
        Figure.InCircle squCircle1 = square1.new InCircle();
        System.out.println(squCircle1.toString());
        System.out.println(square1.toString());
        validateFigure(square1);
        Figure circle1 = new Circle(4.0);
        Figure.InSquare circSquare1 = circle1.new InSquare();
        System.out.println(circle1.toString());
        System.out.println(circSquare1);
        validateFigure(circle1);
        triangle1.equalsArea(circle1);
        Figure rectangle1 = new Rectangle(4.0,6.0);
        System.out.println(rectangle1.toString());
    }
}
