package Task4_Array;

public class Equals {
    public static void main(String[] args) {
        int[][] arr1 = {{0, 7, 0}, {5, 0, 6}, {0, 2, 0}};
        int[][] arr2 = {{0, 7, 0}, {0, 5, 0}, {0, 2, 0}};
        System.out.print(equal(arr1, arr2) ? "массивы одинаковые" : "массивы разные");
    }

    private static boolean equal(int[][] arr1, int[][] arr2) {
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr1[i].length; k++) {
                if (arr1[i][k] != arr2[i][k]) {
                    flag = false;
                }
            }
        }
        return flag;
    }
}
