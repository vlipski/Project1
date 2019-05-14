package Task9_Exception;

public class DemoRuntimeException {

    public static void main(String[] args) {
        try {
            twoDeliwer();
        } catch (MyRuntimeException e) {
            System.out.println("и на два нельзя");
        }
        System.out.println("программа выполнилась");
    }


    static int b = 2;
    static int a = 5;

    static void twoDeliwer() {
        if (b == 2) {
            throw new MyRuntimeException("и на два нельзя");
        } else {
            System.out.println(a / b);
        }
    }
}
