package Task15_InputOutput;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelLetter {

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

        Pattern pattern = Pattern.compile("\\b[уеыаоэяию][а-я]*");
        Matcher matcher = pattern.matcher(build);
        while (matcher.find()) {
            System.out.print(matcher.group() + "  ");
        }
    }

}
