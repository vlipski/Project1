package Task12_Generics;

public final class PairUtil {

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        Pair<V, K> pair1 = new Pair<>(pair.getV(), pair.getK());
        return pair1;
    }

  /*  public static <K,V>  Pair swap(Pair<K,V> pair) {
        V newV = (V) pair.getK();
        pair.setK((K) pair.getV());
        pair.setV(newV);
        return pair;
    }*/




    public static void main(String[] args) {


        Pair<Integer, String> p1 = new Pair<>(567, "dfcz");
        System.out.println(p1.getK() + " " + p1.getV());
        Pair pair1 = swap(p1);
        System.out.println(pair1.getK() + " " + pair1.getV());
        System.out.println(p1.getK() +"  " +p1.getV());
    }


}
