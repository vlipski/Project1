package Task4_Array;

public class ChoosCard {
    public static void main(String[] args){
        String[] mast = {"Spade", "Clubs", "Diamonds", "Hearts"};
        String[] valu = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        System.out.print(valu[(int)(Math.random()*13)]+"of"+mast[(int)(Math.random()*4)]);
    }
}
