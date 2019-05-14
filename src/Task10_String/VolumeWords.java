package Task10_String;

public class VolumeWords {
    public static void main(String[] args) {
        String name = "       липский    Виталий николаевич";
        fio(name);

    }


    static void fio(String name) {
        name = ' ' + name;
        char[] arrName = name.toCharArray();
        int k = 0;
        for (int i = 0 ; i < arrName.length; i++) {
            if (arrName[i] == ' ' && arrName[i + 1] != ' ') {
                k++;
            }
        }
        System.out.println(k);
    }
}
