package Task15_InputOutput;

import org.apache.log4j.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;




public class FileMeneger {
    private static final Logger log = Logger.getLogger(FileMeneger.class);


    public static void main(String[] args) {
        typingFile("C:\\Users", 0);
    }



    public static void showFiles(BufferedWriter bufWrite,String name, int nest) throws IOException {
        File dir = new File(name);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nest; i++) {
            builder.append("   ");
        }
        File files[] = dir.listFiles();
        try {
            for (File file : files) {
                //        System.out.println(builder.toString() + file.getName());
                bufWrite.write(builder.toString() + file.getName() + "\n");
                if (file.isDirectory()) {
                    showFiles(bufWrite, file.getPath(), nest + 1);
                }
            }
        }catch (Exception e){
            log.error(e);

        }
    }

    public static void typingFile(String name, int nest) {
        try (BufferedWriter bufWrite = new BufferedWriter(new FileWriter("F:\\JavaStudy\\project1\\src\\Task15_InputOutput\\Ivan.txt"))) {
            showFiles(bufWrite, name, nest);
        } catch (Exception e) {
            log.error(e);
        }
    }
}



