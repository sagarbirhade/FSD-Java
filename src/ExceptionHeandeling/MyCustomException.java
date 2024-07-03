package ExceptionHeandeling;

public class MyCustomException extends RuntimeException{
    MyCustomException(String msg){
        super(msg);
    }
}
