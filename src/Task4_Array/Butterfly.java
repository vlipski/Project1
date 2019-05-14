package Task4_Array;

public class Butterfly {
    public static void main(String[] args){
        int[][] arr = new int[8][8];
         for(int i = 0; i < arr.length; i++){
             for( int k = 0; k < arr.length; k++){
                 arr[i][k] = 0;
             }
         }

         for(int i = 0; i < arr.length; i++){
             for(int k = 0; k < arr[i].length; k++){
                 if(i < arr.length/2) {
                     if (k >= i && k < arr.length - i) {
                         arr[i][k] = 1;
                     }
                 }else{
                     if(k < i+1 && k >= arr.length-i-1) {
                         arr[i][k] = 1;
                     }
                 }
                 System.out.print((arr[i][k]) == 0?" ":"*");
             }
            System.out.println();
         }
    }
}
