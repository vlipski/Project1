package Task4_Array;

import java.util.Arrays;

public class Divider {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int k = 13, i = 0; i < 99; k++) {
            if (k % 13 == 0 || k % 17 == 0) {
                arr[i] = k;
                System.out.println(arr[i]);
                i++;

            }
        }
        String arrString = Arrays.toString(arr);
        System.out.print(arrString);
    }
}
