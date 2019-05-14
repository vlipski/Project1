package Task9_Exception;

import org.apache.log4j.Logger;

public class ArraiEx {
    public static final Logger log = Logger.getLogger(ArraiEx.class);
    public static void main(String[] args) {
        log.error("Hi");
        String[] mast = {"Spade", "Clubs", "Diamonds", "Hearts"};
        String[] valu = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] card = new String[52];
        int count = 0;
        for (int i = 0; i < mast.length; i++) {
            for (int k = 0; k < valu.length; k++) {
                card[count] = mast[i] + valu[k];
                count++;
            }
        }
        for (int i = 0; i < card.length; i++) {
           try {
               int k = (int) (Math.random() * 53); // случайная карта в колоде
            String temp = card[k];
            card[k] = card[i];
            card[i] = temp;
            System.out.println(i + 1 + "-" + card[i]);
           }
           catch (ArrayIndexOutOfBoundsException e){
               System.out.println("---------\nкосяк\n----------");
               log.info("привет");
           }
        }
    }
}
