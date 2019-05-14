package Task14_Map;

import java.util.*;

public class Polynom {
    public static void main(String[] args) {
        Map<Integer,Integer> polinom1 = new HashMap<>();
        Map<Integer,Integer> polinom2 = new HashMap<>();
        polinom1.put(2,3);
        polinom1.put(1,6);
        polinom1.put(0,3);
        polinom1.put(4,6);
        polinom2.put(2,5);
        polinom2.put(3,8);
        polinom2.put(4,-7);
        polinom2.put(5,2);
        polinom(polinom1,polinom2);
    }


    public static  void polinom(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        SortedSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(map1.keySet());
        treeSet.addAll(map2.keySet());
        System.out.println(treeSet);
        for (; treeSet.size() != 0; ) {
            System.out.print((map1.containsKey(treeSet.last()) ? map1.get(treeSet.last()) : 0) +
                    (map2.containsKey(treeSet.last()) ? map2.get(treeSet.last()) : 0) +
                    (treeSet.last() != 1 && treeSet.last() != 0 ? "x^" + treeSet.last() : (treeSet.last() == 1 ? "x" : "")) +
                    (treeSet.size() == 1 ? "" : " + "));
            treeSet.remove(treeSet.last());
        }
    }

}
