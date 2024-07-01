package ExceptionHeandeling.ThrowKeyword;



public class AgevalidationException extends RuntimeException {
    AgevalidationException(String msg){
        super(msg);
    }

}

