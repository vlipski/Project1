package Task16_Serializable;

import java.io.*;

public class TimeWriteReade {
    public static void main(String[] args) {

        long startBuild = System.currentTimeMillis();
        copyFileBufer("C:\\Users\\user\\IdeaProjects\\project1\\src\\Task15_InputOutput\\ListFile.txt",
                "C:\\Users\\user\\IdeaProjects\\project1\\src\\Task15_InputOutput\\RecordingSpeed.txt");
//        copyFileNoBufer("C:\\Users\\user\\IdeaProjects\\project1\\src\\Task15_InputOutput\\ListFile.txt",
//                "C:\\Users\\user\\IdeaProjects\\project1\\src\\Task15_InputOutput\\RecordingSpeed.txt");
        long finishBuild = System.currentTimeMillis() - startBuild;
        System.out.println(finishBuild);

    }

    public static void copyFileBufer(String fileRead, String fileWrite) {
        try (BufferedReader bufRead = new BufferedReader(new FileReader(fileRead));
             BufferedWriter bufWrite = new BufferedWriter(new FileWriter(fileWrite))) {
            int c;
            while ((c = bufRead.read()) != -1) {
               bufWrite.write((char)c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }

    public static void copyFileNoBufer(String fileRead, String fileWrite) {
        try (FileReader read = new FileReader(fileRead);
             FileWriter write = new FileWriter(fileWrite)) {
            int c;
            while ((c = read.read()) != -1) {
                write.write((char) c);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
