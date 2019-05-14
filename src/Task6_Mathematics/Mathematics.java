package Task6_Mathematics;

import java.math.BigDecimal;

public class Mathematics {


    static BigDecimal BigMultiplication(double dArg1, double dArg2) {
        return (new BigDecimal(dArg1).multiply(new BigDecimal(dArg2)));
    }

    static BigDecimal BigMultiplication(int arg1, int arg2) {
        return (new BigDecimal(arg1).multiply(new BigDecimal(arg2)));
    }

    static int multiplication(int arg1, int arg2){
             return  arg1 * arg2;
    }

    static double multiplication(double dArg1, double dArg2){
        return dArg1 * dArg2;
    }

    static BigDecimal BigDivider(int arg1, int arg2) {
        return (new BigDecimal(arg1).divide(new BigDecimal(arg2)));
    }

    static BigDecimal BigDivider(double dArg1, double dArg2) {
        return (new BigDecimal(dArg1).divide(new BigDecimal(dArg2)));
    }

    static int divider (int arg1, int arg2){
        return arg1 / arg2;
    }

    static double divider (double dArg1, double dArg2){
        return dArg1 / dArg2;
    }

    static BigDecimal BigSubtraction(int arg1, int arg2) {
        return (new BigDecimal(arg1).subtract(new BigDecimal(arg2)));
    }


    static BigDecimal BigSubtraction(double dArg1, double dArg2) {
        return (new BigDecimal(dArg1).subtract(new BigDecimal(dArg2)));
    }

    static int subtraction (int arg1, int arg2){
        return arg1 - arg2;
    }

    static double subtraction (double dArg1, double dArg2){
        return dArg1 - dArg2;
    }

    static BigDecimal BigSumma(int arg1, int arg2) {
        return (new BigDecimal(arg1).add(new BigDecimal(arg2)));
    }


    static BigDecimal BigSumma(double dArg1, double dArg2) {
        return (new BigDecimal(dArg1).add(new BigDecimal(dArg2)));
    }

    static int summa (int arg1, int arg2){
        return arg1 + arg2;
    }

    static double summa (double dArg1, double dArg2){
        return dArg1 + dArg2;
    }
}

class BigDecimalDemo {
    public static void main(String[] args) {

        System.out.println(Mathematics.summa(0.2, 0.2));
        System.out.println(Mathematics.BigSumma(0.2 , 0.2));
    }
}