package Task15_InputOutput;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxNumber {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[\\d]+");
        String str = new String();
        int size = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects" +
                "\\project1\\src\\Task15_InputOutput\\JavaCod.txt"))) {
            String strLine;
            while ((strLine = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(strLine);
                while (matcher.find()) {
                    if (size < matcher.group().length()) {
                        size = matcher.group().length();
                        str = matcher.group();
                    }
                    System.out.print(matcher.group() + "  ");
                }
                System.out.println("\n" + str + " -" + size + " цифр");
                size = 0;
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}
