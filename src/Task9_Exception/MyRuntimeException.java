package Task9_Exception;

public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException(String messag){
        super(messag);
        printStackTrace();
    }

    public MyRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
