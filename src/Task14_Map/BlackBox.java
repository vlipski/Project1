package Task14_Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class BlackBox {

    public static int iterMin(Collection list,int iter){
        TreeSet<Integer> newBox = new TreeSet<Integer>(list);
        ArrayList<Integer> box = new ArrayList<>(newBox);
        return box.get(iter - 1);
    }

    public static int iterMax(Collection list,int iter){
        TreeSet<Integer> newBox = new TreeSet<Integer>(list);
        ArrayList<Integer> box = new ArrayList<>(newBox);
        return box.get(newBox.size() - iter);
    }


    public static void main(String[] args) {
        ArrayList<Integer> box = new ArrayList<>();
        for(int i =0; i <10; i++){
            box.add((int) (Math.random() * 10));
        }
        System.out.println(box);
        System.out.println(iterMin(box,2));
        System.out.println(iterMax(box,3));
    }
}
