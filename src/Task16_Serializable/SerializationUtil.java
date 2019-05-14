package Task16_Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {

    public static void serializations(Object object, String nameFile) {
        try (FileOutputStream fileOut = new FileOutputStream(nameFile);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object deSerializations(String nameFile) {
        try (FileInputStream fileInput = new FileInputStream(nameFile);
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
            return  objectInput.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
