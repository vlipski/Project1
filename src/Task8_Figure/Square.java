package Task8_Figure;



class Square extends Figure {

    Square(double a) {
        super(a);
        this.setB(a);
    }

    @Override
    public String toString() {
        return  "сторона квадрата: " + getA() + "\n" + "периметр: " + perimeter() +
                "\n" + "площадь: " + area() + "\n";
    }
}
