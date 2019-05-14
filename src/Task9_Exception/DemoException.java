package Task9_Exception;

public class DemoException {
    public static void main(String[] args) {



        try {
            oneDeliver();
        } catch (MyException e) {
            System.out.println("на один делить тоже нельзя");
            e.printStackTrace();
        }

        System.out.println("программа выполнилась");
    }


    static void oneDeliver() throws MyException {
        int b = 1;
        int a = 5;
        if (b == 1) {
            throw new MyException();
        } else {
            System.out.println(a / b);
        }
    }
}

