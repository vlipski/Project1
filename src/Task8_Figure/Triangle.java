package Task8_Figure;

public class Triangle extends Figure {

    Triangle(double a, double b, double c) {
        super(a, b, c);
        if(!validate()){

        }
    }

    private boolean validate() {
        return getA() < getB() + getC() && getB() < getA() + getC() && getC() < getA() + getB();
    }

    @Override
    public double perimeter() {
        return getA() + getB() + getC();
    }

    @Override
    public double area() {
        return  Math.sqrt(perimeter() / 2 * (perimeter() / 2 - getA()) * (perimeter() / 2 - getB())
                * (perimeter() / 2 - getC()));
    }

    @Override
    public String toString() {
        if (validate()) {
            return "треугольник со сторонами: " + getA() + " " + getB() + " " + getC() + "\n" + "периметр: " + perimeter()
                    + "\n" + "площадь: " + area() + " " + "\n";
        }
        return "невозможно создать такой треугольник \n";
    }
}



