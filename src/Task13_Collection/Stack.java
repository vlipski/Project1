package Task13_Collection;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;

public class  Stack<T> {

    Object[] stackArrai;
    private int maxSise;
    private int sise = 0;


    public Stack(int maxSise) {
        this.maxSise = maxSise;
        stackArrai = new Object[maxSise];
    }

    public int getMaxSise() {
        return maxSise;
    }

    public void setMaxSise(int maxSise) {
        this.maxSise = maxSise;
    }

    public int getSise() {
        return sise;
    }

    public void setSise(int sise) {
        this.sise = sise;
    }

    public void stackNumber(int number) {
        String num = Integer.toString(number);
        char[] charArray = num.toCharArray();
        for (;sise < charArray.length;  sise ++) {
            stackArrai[sise] = Character.getNumericValue(charArray[sise]);

        }
    }

    public  void push( T t) {
        if(sise < maxSise) {
            stackArrai[sise] = t;
            sise++;
        }
    }

    public Object pop(){
        sise--;
        Object o = stackArrai[sise];
        stackArrai[sise] = null;
        return o;
    }

    public void popAll(){
        while (sise > 0){
            System.out.print(stackArrai[sise - 1]);
            sise--;
        }

    }


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
           Integer number = num.nextInt();

        Stack<Integer> stack1 = new Stack<>(15);
        stack1.stackNumber(number);
        stack1.popAll();

/*
        Stack <String> stec = new Stack<>(10);
        stec.push(new String("gg"));
        stec.push(new String("dd"));
        stec.push(new String("ff "));
        System.out.println(stec);
        System.out.println(stec.sise);
        System.out.println(stec.pop());
        System.out.println(stec.pop());
        System.out.println(stec.pop());
*/
    }
}
