package Task15_InputOutput;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SameLetter {

    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        try (FileReader fin = new FileReader("F:\\JavaStudy\\project1\\src\\Task15_InputOutput\\MyFile.txt")) {
            int c;
            while ((c = fin.read()) != -1) {
                build.append((char) c);
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        Pattern pattern = Pattern.compile("\\b[А-Яа-я0-9]*([А-Яа-я0-9])\\s\\1[А-Яа-я0-9]*");
        Matcher matcher = pattern.matcher(build);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
