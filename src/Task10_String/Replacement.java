package Task10_String;

public class Replacement {

    public static void main(String[] args) {
        String name = "лииииииипский Витттттталий никоооооолаееееееевич";
        System.out.println(fio(name));

    }


    static String fio(String name) {
        char[] arrName = name.toCharArray();
        String newName = String.valueOf(name.charAt(0));
        for (int i = 0; i < arrName.length - 1; i++) {
            if (arrName[i] != arrName[i + 1]) {
                newName += arrName[i + 1];
            }
        }
        return newName;
    }
}
