package Task4_Array;

public class SumMinMax {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,0, 9,1,0, 1, 1,9, 1, 2, 9,1};
        int indArr[] = new int[4];
        int minInd = 1000000000;
        int maxInd = 0;
        int minFirst = arr[0];
        int minLast = arr[0];
        int maxFirst = arr[0];
        int maxLast = arr[0];
        int sum = 0;
        int exc = 0; //для исключения '+' вначале строки при выводе суммы
        //ищет индекса максимальных и минимальных крайних значений массива
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minFirst) {
                minFirst = arr[i];
                indArr[0] = i;
            }
            if(arr[i] <= minLast){
                minLast = arr[i];
                indArr[1] = i;
            }
            if (arr[i] >= maxLast) {
                maxLast = arr[i];
                indArr[2] = i;
            }
            if (arr[i] > maxFirst) {
                maxFirst = arr[i];
                indArr[3] = i;
            }
        }
        //проверяет выбранные индекса макс и мин элементов массива и определяет между какими индексами будет суммировать
        for(int i = 0; i < indArr.length; i++){
            if(indArr[i] < minInd){
                minInd = indArr[i];
            }
            if(indArr[i] > maxInd) {
                maxInd = indArr[i];
            }
        }

        System.out.println(indArr[0]+"  "+indArr[1]+"  "+indArr[2]+"  "+indArr[3]+"  "+minInd+"  "+maxInd);
        System.out.println("минимальное значение: "+minFirst + ",  максимальное значение: "+ maxLast );
        //суммирует значения массива исключая макс и мин
        for (int i = minInd ; i < maxInd; i++) {
            if (arr[i] != minFirst && arr[i] != maxLast) {
                exc++;
                System.out.print((exc == 1?arr[i]:"+"+arr[i]));
                sum += arr[i];
            }

        }
        System.out.print("="+sum);
    }
}