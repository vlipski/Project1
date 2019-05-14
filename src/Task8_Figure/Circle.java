package Task8_Figure;

public class Circle extends Figure {

    Circle(double a) {
        super(a);
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * getA();
    }

    @Override
    public double area() {
        return Math.PI * getA() * getA();
    }

    @Override
    public String toString(){
        return  "радиус окружности: " + getA() + "\n" + "длина окружности: " + perimeter() +
                "\n" + "площадь: " + area() + "\n";
    }
}
