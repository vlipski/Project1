package Task8_Figure;

public abstract class Figure implements GeometricalFigure {

    private double a;
    private double b;
    private double c;

    Figure(double a) {
        this.a = a;
    }

    Figure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double getA() {
        return a;
    }

    void setA(double a) {
        this.a = a;
    }

    double getB() {
        return b;
    }

    void setB(double b) {
        this.b = b;
    }

    double getC() {
        return c;
    }

    void setC(double c) {
        this.c = c;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public void equalsArea(GeometricalFigure t) {
        System.out.println(t.area() == area() ? "площади фигур равны" : "площади фигур не равны \n");
    }


    public class InCircle {
        double r;
        double longCircle;
        InCircle() {
            r = area() / (perimeter() / 2);
            longCircle = 2 * Math.PI * r;
        }
        @Override
        public String toString() {
            return "вписанная окружность: L= " + longCircle + " ; R=" + r + "\n";
        }
    }

    public class InSquare {
        double a;
        double perimeter;
        InSquare() {
            a = getA() * Math.sqrt(2.0);
            perimeter = a * 4;
        }
        @Override
        public String toString() {
            return "сторона квадрата вписанного в окружность: " + a + "\n" + "периметр: " + perimeter + "\n" +
                    "площадь: " + perimeter + "\n";
        }
    }
}
