package Task4_Array;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.print("введите число: ");
        Scanner number = new Scanner(System.in);
        int prime = number.nextInt();
        boolean flag = true;
        for(int i = 2; i < prime; i++){
            if(prime % i == 0){
                flag = false;
                break;
            }
        }
       System.out.print(flag?"простое число":"не простое число");
    }
}