package Task15_InputOutput;

import java.io.*;

public class TwentyNumber {

    public static  int readInt(FileInputStream fin) throws IOException {
        int var1 = fin.read();
        int var2 = fin.read();
        int var3 = fin.read();
        int var4 = fin.read();
        if ((var1 | var2 | var3 | var4) < 0) {
            throw new EOFException();
        } else {
            return (var1 << 24) + (var2 << 16) + (var3 << 8) + (var4 << 0);
        }
    }

    public static  void writeInt(FileOutputStream file,int v) throws IOException {
        file.write((v >>> 24) & 0xFF);
        file.write((v >>> 16) & 0xFF);
        file.write((v >>>  8) & 0xFF);
        file.write((v >>>  0) & 0xFF);
    }




    public static void main(String[] args) {

        try (FileOutputStream file = new FileOutputStream("F:\\JavaStudy\\project1\\src\\Task15_InputOutput\\TwentyNumber.txt")) {
            for (int i = 0; i < 20; i++) {
                int num = (int) (256 + Math.random() * 100);
                System.out.print(num + " ");
                writeInt(file, num);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
        int summa = 0;
        try (FileInputStream fin = new FileInputStream("F:\\JavaStudy\\project1\\src\\Task15_InputOutput\\TwentyNumber.txt")) {
            for (int i = 0; i < 20; i++) {
                int num = readInt(fin);
                System.out.print(num + " ");
                summa += num;
            }
            System.out.println("\n" + summa / 20.0);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}