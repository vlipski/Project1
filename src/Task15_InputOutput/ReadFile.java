package Task15_InputOutput;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {

        try (FileReader fin = new FileReader("C:\\Users\\user\\IdeaProjects\\project1\\src\\Task15_InputOutput\\MyFile.txt")) {
            int c;
            while ((c = fin.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}