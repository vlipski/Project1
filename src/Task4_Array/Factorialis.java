package Task4_Array;

import java.util.Scanner;

public class Factorialis {
    public static void main(String[] args) {
        System.out.print("введите число: ");
        Scanner number = new Scanner(System.in);
        int prime = number.nextInt();
        int sum = 1;
        for(int i = 1; i <= prime; i++){
            sum *= i;
        }
        System.out.print(prime+"!="+sum);
    }
}