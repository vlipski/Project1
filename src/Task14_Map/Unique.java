package Task14_Map;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class Unique {

    public static int countUnique(ArrayList list) {
        if (list.size() == 0) {
            return 0;
        } else {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            ListIterator<Integer> listIter = list.listIterator();
            while (listIter.hasNext()) {
                Integer buf = listIter.next();
                if (!set1.add(buf)) {
                    set2.add(buf);
                }
            }
            set1.removeAll(set2);
            System.out.println(set1);
            return set1.size();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
        System.out.println(countUnique(list));

    }

}
