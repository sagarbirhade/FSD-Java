package ExceptionHeandeling.BankingApp;

public class InvalidPasswordException extends RuntimeException{
    InvalidPasswordException(String msg){
        super(msg);
    }
}
