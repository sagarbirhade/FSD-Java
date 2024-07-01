package ExceptionHeandeling.BankingApp;

public class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
