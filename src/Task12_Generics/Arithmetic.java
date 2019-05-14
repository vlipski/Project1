package Task12_Generics;

public class Arithmetic {


    public static <E extends Number> double summa(E arg1, E arg2) {
        if (arg1 instanceof Double) {
            return (Double) arg1 + (Double) arg2;
        } else {
            return (Integer) arg1 + (Integer) arg2;
        }
    }

    public static <E extends Number> double subtraction (E arg1, E arg2) {
        if (arg1 instanceof Double) {
            return (Double) arg1 - (Double) arg2;
        } else {
            return (Integer) arg1 - (Integer) arg2;
        }
    }

    public static <E extends Number> double multipli(E arg1, E arg2) {
        if (arg1 instanceof Double) {
            return (Double) arg1 * (Double) arg2;
        } else {
            return (Integer) arg1 * (Integer) arg2;
        }
    }

    public static <E extends Number> double divider(E arg1, E arg2) {
        if (arg1 instanceof Double) {
            return (Double) arg1 / (Double) arg2;
        } else {
            return (Integer) arg1 / (Integer) arg2;
        }
    }


    public static void main(String[] args) {
        System.out.println(summa(6.4, 8.1));
        System.out.println(divider(6.0,4.0));
        System.out.println(subtraction(6.1,3.4));
        System.out.println(multipli(5,4));

    }

}