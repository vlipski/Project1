package Task9_Exception;

public class FiftyException {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                forExceptions(i);
            } catch (MyException e) {
                System.out.println("поймал");
            }finally {
                System.out.println("должно выполняться всегда");
            }
        }
    }


        static void forExceptions ( int i) throws MyException {
            if (i % 2 == 0) {
                throw new MyException();
            } else {
                System.out.println(i);
            }
        }
    }

