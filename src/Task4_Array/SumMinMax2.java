package Task4_Array;

public class SumMinMax2 {

    public static void main(String[] args) {
        int[] arr = { 9,1,1,0,2,9,7,8,9,8,0,4,9,1,1,9};
        int min = arr[0];
        int max = arr[0];
        int stop = 0;
        int go = 0;
        int buf = 0;
        int sum = 0;
        //ищет максимальное и минимальное значение массива
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
System.out.println("min="+min+"; max="+max);

        int j = 0;
        for(; j < arr.length-1; j++){
            //определяет с какого числа начинать складывать и на каком остановится
            if (arr[j] == min || arr[j] == max) {
                if (arr[j] == min) {
                    stop = min;
                    go = max;
                }
                if (arr[j] == max) {
                    stop = max;
                    go = min;
                }
                for (int k = j; k < arr.length-1; k++) {
                    //складывает значения массива пока не попадется мин или макс значение массива
                    if (arr[k+1] != stop && arr[k+1] != go) {
                        buf += arr[k+1];
                        j = k;
                    } else {
                        //если попадается значение такое с которого начиналось сложение(то что между мин и мин находится)
                        // то в сумму ничего не попадает
                        if (arr[k+1] == stop) {
                            buf = 0;
                            break;
                        }
                        //если попалось противоположное значение (то что между мин и макс находится)
                        // то в сумму попадает то что мы сложили
                        if (arr[k+1] == go) {
                            sum += buf;
                            buf = 0;
                            break;
                        }
                    }
                }
            }
        }
        System.out.print(sum);
    }
}