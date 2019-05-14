package Task13_Collection;

import java.util.HashSet;
import java.util.Set;

public class MySet {


    public static Set merger(Set set1, Set set2) {
        set1.addAll(set2);
        return set1;
    }


    public static Set common(Set set1, Set set2){
        set1.retainAll(set2);
        return set1;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(7);
        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(7);
  //      System.out.println(merger(set1,set2));
        System.out.println(common(set1,set2));


    }


}
