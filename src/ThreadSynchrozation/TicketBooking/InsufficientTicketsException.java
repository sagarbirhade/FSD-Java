package ThreadSynchrozation.TicketBooking;

public class InsufficientTicketsException extends RuntimeException{
    InsufficientTicketsException(String msg){
        super(msg);
    }

}
