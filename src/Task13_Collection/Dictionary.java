package Task13_Collection;

import java.util.TreeMap;

public class Dictionary {

    public static void list(String text){
        String newText = text.replaceAll("\\p{Punct}|[ ]","");
        char[] arrText = newText.toCharArray();
        TreeMap <Character,Integer> alphabet = new TreeMap<>();
        for(int i = 0; i < arrText.length; i++) {
            if (alphabet.containsKey(arrText[i])) {
                Integer valu = alphabet.get(arrText[i]) + 1;
                alphabet.put(arrText[i], valu);
            } else {
                alphabet.put(arrText[i], 1);
            }
        }
        System.out.println(alphabet);
    }

    public static void main(String[] args) {
        list("Определить множество на основе множества целых чисел. Создать методы для определения пересечения " +
                "и объединения множеств." +
                "6.Имеется текст. Следует составить для него частотный словарь. ");
    }
}
