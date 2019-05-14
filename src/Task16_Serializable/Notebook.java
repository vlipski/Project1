package Task16_Serializable;

public class Notebook extends Computer {
    private static final long serialVersionUID = 0000000002L;
    private  Touchpad touchpad;
    private transient String dateProdaction;

    public Notebook(String name, String processor, int SDD,String dateProdaction,Touchpad touchpad) {
        super(name, processor, SDD);
        this.dateProdaction = dateProdaction;
        this.touchpad = touchpad;
    }

    public Touchpad getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(Touchpad touchpad) {
        this.touchpad = touchpad;
    }

    public String getDateProdaction() {
        return dateProdaction;
    }

    public void setDateProdaction(String dateProdaction) {
        this.dateProdaction = dateProdaction;
    }

    @Override
    public String toString() {
        return "Notebook{" + "name='" + getName() + '\'' +
                ", processor='" + getProcessor() + '\'' +
                ", SDD=" + getSDD() +
                ", " + touchpad +
                ", dateProdaction='" + dateProdaction + '\'' +
                '}';
    }
}
