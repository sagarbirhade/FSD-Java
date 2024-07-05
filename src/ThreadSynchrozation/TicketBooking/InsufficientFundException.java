package ThreadSynchrozation.TicketBooking;

public class InsufficientFundException extends RuntimeException{

   InsufficientFundException(String msg){
       super(msg);
   }
}
