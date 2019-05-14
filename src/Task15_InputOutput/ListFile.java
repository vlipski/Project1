package Task15_InputOutput;

import java.io.File;
import java.util.Date;
import java.util.regex.Pattern;

public class ListFile {
    public static void main(String[] args) {


        displayAll(new File("D:\\CDROM"));

    }


    public static void displayAll(File path) {
        try {
            if (path.isFile()) {
                System.out.println(path.getName());
            } else {
                System.out.println(path.getName());
                File files[] = path.listFiles();
     //           System.out.println(files.length);
                for (File dirOrFile : files) {
                    displayAll(dirOrFile);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
