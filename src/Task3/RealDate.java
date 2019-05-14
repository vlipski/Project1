package Task3;

import java.util.Scanner;
public class RealDate {
    public static void main(String[] args) {
        System.out.print("введите число: ");
        Scanner dataD = new Scanner(System.in);
        int day = dataD.nextInt();
        System.out.print("введите месяц: ");
        Scanner dataM = new Scanner(System.in);
        int month = dataM.nextInt();
        System.out.print("введите год: ");
        Scanner dataE = new Scanner(System.in);
        int ear = dataE.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                validDate(day, 31, month, ear);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                validDate(day, 30, month, ear);
                break;
            case 2:
                if (validEar(ear)) {
                    validDate(day, 29, month, ear);
                } else {
                    validDate(day, 28, month, ear);
                }
                break;
            default:
                System.out.print("не существует такой даты: ");


        }
    }

    public static void validDate(int day, int maxDay, int month, int ear) {
        if (day < 1 || day > maxDay) {
            System.out.print("не существует такой даты: ");
        } else {
            System.out.print((day <10 ? "0"+ day : day) + "." +(month <10 ? "0"+ month : month ) + "." + ear + "г");
        }
    }

    public static boolean validEar(int ear) {
        if (ear % 4 == 0 && ear % 100 != 0) {
            return true;
        } else if (ear % 4 == 0 && ear % 100 == 0 && ear % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}