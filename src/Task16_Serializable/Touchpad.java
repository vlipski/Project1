package Task16_Serializable;

import java.io.Serializable;

public class Touchpad implements Serializable {
    private static final long serialVersionUID = 0000000003L;
    private String model;
    private String size;

    public Touchpad(String model, String size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Touchpad{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
