package Task15_InputOutput;

import java.io.*;

public class ReversJava {
    public static  void main(String[] args) {
        try (BufferedReader bufRead = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects" +
                "\\project1\\src\\Task15_InputOutput\\ReadFile.java"));
             BufferedWriter bufWrite = new BufferedWriter(new FileWriter("C:\\Users\\user\\IdeaProjects" +
                     "\\project1\\src\\Task15_InputOutput\\Revers.txt"))
        ) {
            String strLine;
            while ((strLine = bufRead.readLine()) != null) {
                String reversedString = new StringBuffer(strLine).reverse().toString();
                System.out.println(reversedString);
                bufWrite.write(reversedString + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

    }
}
