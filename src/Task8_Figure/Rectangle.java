package Task8_Figure;

public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    double diagonal(){
        return Math.sqrt(getA() * getA() + getB() * getB());
    }

    @Override
    public String toString(){
      //  ShapeUtils.validateFigure(this);
        return  "прямоугольник со сторонами: " + getA() + " " + getB() + " диагональю: " + diagonal() + "\n" + "периметр: " + perimeter() +
                "\n" + "площадь: " + area() + "\n";
    }

}
