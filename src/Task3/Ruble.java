package Task3;

import java.util.Scanner;

public class Ruble {
    public static void main(String[] args) {
        System.out.print("сколько рублей стоят ваши кросовки?: ");
        Scanner money = new Scanner(System.in);
        int ruble = money.nextInt();
        int cash;
        if (ruble < 100) {
            money(ruble, ruble);
        } else {
            cash = ruble % 100;
            money(cash, ruble);
        }
    }

    public static void money(int rem, int ruble) {
        if (rem > 10 && rem < 15) {
            System.out.print(ruble + " рублей");
        } else {
            rem = rem % 10;
            if (rem > 1 && rem < 5) {
                System.out.print(ruble + " рубля");
            }
            if (rem > 4 || rem == 0) {
                System.out.print(ruble + " рублей");
            }
            if (rem == 1) {
                System.out.print(ruble + " рубль");
            }
        }
    }
}
        /*int cash = 0;
        int rem = 0;


            if (ruble > 1 && ruble < 5) {
                System.out.print(ruble + "рубля");
            }
            if (ruble > 4 && ruble < 21) {
                System.out.print(ruble + "рублей");
            }
            if (ruble == 1) {
                System.out.print(ruble + "рубль");
            }
            if (ruble > 20 && ruble < 100) {
                cash = ruble;
                rem = cash % 10;
            }

            if (ruble > 99 && ruble < 1000) {
                cash = ruble;
                rem = cash % 100;
                if (rem > 20 && rem < 100) {
                    rem %= 10;
                }

            }
            if (rem > 1 && rem < 5) {
                System.out.print(ruble + "рубля");
            }
            if (rem > 4 || rem == 0) {
                System.out.print(ruble + "рублей");
            }
            if (rem == 1) {
                System.out.print(ruble + "рубль");
            }
        }
    }*/
