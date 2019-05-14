package Task9_Exception;




public class NullException {


    public static void main(String[] args) {

        try {
           // nullDeliver();
            nullpoint.hashCode();
        } catch (Exception e) {
            System.out.println("делить на нуль нельзя");
            e.printStackTrace();
        }
        System.out.println("программа выполнилась");
    }

static NullException nullpoint;
    static int b = 0;
    static int a = 5;
     static void nullDeliver()

     {
        System.out.println(a / b);
    }
}
