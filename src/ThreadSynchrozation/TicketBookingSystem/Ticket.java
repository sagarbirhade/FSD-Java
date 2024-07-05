package ThreadSynchrozation.TicketBookingSystem;

class Ticket {

    private int ticketCount;

    public Ticket(int initialCount) {
        this.ticketCount = initialCount;
    }

    public synchronized boolean buyTickets(int numTickets) {
        if (ticketCount >= numTickets) {
            ticketCount -= numTickets;
            return true;
        } else {
            System.out.println("Insufficient tickets. Please try again later.");
            return false;
        }
    }
}
