package Task4_Array;

public class Chuffle {
    public static void main(String[] args) {
        String[] mast = {"Spade", "Clubs", "Diamonds", "Hearts"};
        String[] valu = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] card = new String[52];
        int count = 0;
        for (int i = 0; i < mast.length; i++) {
            for (int k = 0; k < valu.length; k++) {
                card[count] = mast[i] + valu[k];
              //  System.out.println(card[count]);
                count++;
            }
        }
        for (int i = 0; i < card.length; i++) {
            int k = (int) (Math.random() * 52); // случайная карта в колоде
            String temp = card[k];
            card[k] = card[i];
            card[i] = temp;
            System.out.println(i+1+"-"+card[i]);
        }
    }
}