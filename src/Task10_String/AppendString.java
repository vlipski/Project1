package Task10_String;

public class AppendString {

    public static void main(String[] args) {


        String string = "XX";
        StringBuilder build = new StringBuilder("XX");
        String concat = "VV";
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            build.append(concat);
 //           string += concat;
        }

        long finish = System.currentTimeMillis() - start;
        System.out.println(finish);
    }
}
