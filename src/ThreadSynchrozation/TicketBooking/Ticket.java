package ThreadSynchrozation.TicketBooking;


import ThreadSynchrozation.SalaryExpenses.InsufficientFundException;

public class Ticket {

    int ticket_count = 125;
    static int buys_ticket;
    double remaining;

    synchronized void showTickets(int buys_ticket){
        if(this.ticket_count > buys_ticket){
                System.out.println("Ticket buyed successful");
                this.ticket_count = this.ticket_count - buys_ticket;
                this.remaining  = this.ticket_count;
                System.out.println("Remaining Amount: "+this.remaining);


        }
        else{
            System.out.println("Insufficient Tickets...!!! Try later...");
            throw new InsufficientTicketsException("No tickets Available..!!");
        }

    }
}

