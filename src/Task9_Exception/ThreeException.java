package Task9_Exception;

public class ThreeException {
    public static void main(String[] args) {
        try {
            arraiException();
        } catch (ClassCastException e) {
            System.out.println("поймал класс ClassCastException");
        } catch (ArrayStoreException e) {
            System.out.println("поймал класс ArrayStoreException");
        } catch (ArithmeticException e) {
            System.out.println("поймал ArithmeticException");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("программа выполнилась");
    }



    static void arraiException() throws Exception{
        ClassCastException classCastException = new ClassCastException();
        ArrayStoreException arrayStoreException = new ArrayStoreException();
        ArithmeticException arithmeticException = new ArithmeticException();

        Exception [] exceptions = {classCastException, arrayStoreException, arithmeticException};
        int k = (int) (Math.random() * 3);
        throw  exceptions [k ];
    }
}
