package ExceptionHeandeling.ThrowKeyword.PasswordValidation;

public class PasswordValidationException extends RuntimeException {
    public PasswordValidationException(String msg){
        super(msg);
    }

}
