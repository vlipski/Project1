package Task3;

import java.util.Scanner;
public class Ear {
    public static void main(String[] args) {
        System.out.print("введите год рождения: ");
        Scanner data = new Scanner(System.in);
        int ear = data.nextInt();
        if(ear % 4 == 0 && ear % 100 != 0){
            System.out.print("вы родились в високосный год");
        }else if(ear % 4 == 0 && ear % 100 == 0 && ear % 400 == 0){
            System.out.print("вы родились в високосный год");
        }else {
            System.out.print("вы родились НЕ в високосный год");
        }
    }
}
