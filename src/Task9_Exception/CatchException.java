package Task9_Exception;

public class CatchException {
    public static void main(String[] args) {
        try {
            threeDeliwer();
        } catch (SecurityException e) {
         e.printStackTrace();
             throw new  MyRuntimeException("на три нельзя", e);
        }
        System.out.println("программа выполнилась");
    }


    static int a = 5;
    static int b = 3;
    static void threeDeliwer() {
        if (b == 3) {
            throw new SecurityException();
        } else {
            System.out.println(a / b);
        }
    }
}
