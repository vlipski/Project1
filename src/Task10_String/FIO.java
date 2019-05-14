package Task10_String;

public class FIO {
    public static void main(String[] args) {
String name = "липский Виталий николаевич";
        System.out.println(fio(name));

    }


    static String fio(String name) {
        char[] arrName = name.toCharArray();
        String newName = String.valueOf(name.charAt(0));
        for (int i = 1; i < arrName.length; i++) {
            if (arrName[i - 1] == ' ') {
                newName += "." + arrName[i];
            }
        }
        return newName.toUpperCase();
    }
}
