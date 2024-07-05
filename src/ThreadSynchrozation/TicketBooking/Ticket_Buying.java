package ThreadSynchrozation.TicketBooking;
public class Ticket_Buying extends Thread {

    static int buys_ticket;
    static Ticket s;
    static int remaining;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        s.showTickets(buys_ticket);
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) throws InterruptedException {
        s = new Ticket();

        Ticket_Buying Paytm = new Ticket_Buying();
        Paytm.buys_ticket = 5;
        Paytm.start();
        Thread.sleep(1000);


        Ticket_Buying BMK = new Ticket_Buying();
        BMK.buys_ticket = 5;
        BMK.start();
        Thread.sleep(1000);


        Ticket_Buying Amazon = new Ticket_Buying();
        Amazon.buys_ticket = 116;
        Amazon.start();
        Thread.sleep(1000);

    }
}
