package Task4_Array;

import java.util.Arrays;

public class ThreeNumbers {
    public static void main(String[] args){
     int[] arr = new int[3];
     for(int i = 0; i < arr.length; i++){
         arr[i] = (int)(Math.random()*99+10);
     }
        String arrString = Arrays.toString(arr);
        System.out.print(arrString);
        boolean flag = true;
     for(int i = 1; i < arr.length; i++){
         if(arr[i] <= arr[i-1]){
             System.out.print("массив не является строго возврастающим");
             flag = false;
             break;
         }
     }
     if(flag){
         System.out.print("массив строго возврвстающий");
     }
    }
}
