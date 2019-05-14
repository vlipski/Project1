package Task16_Serializable;

import java.io.Serializable;
import static Task16_Serializable.SerializationUtil.*;


public class Computer implements Serializable {

    private static final long serialVersionUID = 0000000001L;
    private String name;
    private String processor;
    private int SDD;
    public static String buba;

    public Computer(String name, String processor, int SDD) {
        this.name = name;
        this.processor = processor;
        this.SDD = SDD;
        buba = "vasya";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getSDD() {
        return SDD;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                ", SDD=" + SDD + ", buba" + buba +
                '}';
    }

    public void setSDD(int SDD) {
         this.SDD = SDD;
    }

    public static void main(String[] args) {
//        Computer hp = new Computer("HP","intel",500);
//        serializations(hp,"F:\\JavaStudy\\project1\\src\\Task16_Serializable\\Object.txt");
//        Computer hp = (Computer) SerializationUtil.deSerializations("C:\\Users\\user\\IdeaProjects\\project1\\src\\Task16_Serializable\\Object.txt");
//        System.out.println(hp);

        Notebook acer = new Notebook("acer", "AMD", 500, "01.08.2018", new Touchpad("Synaptics", "100*50"));
//        serializations(acer, "C:\\Users\\user\\IdeaProjects\\project1\\src\\Task16_Serializable\\Object.txt");
//        Notebook acer = (Notebook) deSerializations("C:\\Users\\user\\IdeaProjects\\project1\\src\\Task16_Serializable\\Object.txt");
        System.out.println(acer);
    }
}
