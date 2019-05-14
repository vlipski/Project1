package Task13_Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Sort {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                list.add((int) (Math.random() * 10));
            } else {
                list.add(-(int) (Math.random() * 10));
            }
        }
        System.out.println(list);

        Deque<Integer> sortList = new ArrayDeque<>();
        for (Integer i : list) {
            if (i == 0) {
                sortList.addFirst(i);
            }
        }
        for (Integer i : list) {
            if (i > 0) {
                sortList.addFirst(i);
            }
            if (i < 0) {
                sortList.addLast(i);
            }
        }
        System.out.println(sortList);
    }
}