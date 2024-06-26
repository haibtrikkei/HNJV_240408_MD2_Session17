package exception_handling.custom;

public class MyCustomError extends Exception{
    public MyCustomError(String message) {
        super(message);
    }
}
