package ThreadSynchrozation.TicketBookingSystem;
import java.util.InputMismatchException;
import java.util.Scanner;
class TicketBuying extends Thread {

    private Ticket ticket;
    private int platformChoice; // 1 for Paytm, 2 for BMK, 3 for Amazon

    public TicketBuying(Ticket ticket, int platformChoice) {
        this.ticket = ticket;
        this.platformChoice = platformChoice;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int numTickets;

        System.out.println("\nWelcome to " + getPlatformName(platformChoice) + " Ticket Booking!");

        int subChoice = 0;
        do {
            System.out.println("1. Show Cinemas");
            System.out.println("2. Buy Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                subChoice = scanner.nextInt();
                switch (subChoice) {
                    case 1:
                        // Simulate showing cinema information (replace with actual implementation)
                        System.out.println("Here are some cinemas available...");
                        break;
                    case 2:
                        System.out.print("Enter the number of tickets you want to buy: ");
                        numTickets = scanner.nextInt();
                        if (ticket.buyTickets(numTickets)) {
                            System.out.println("Ticket purchase successful! You have " + numTickets + " tickets.");
                        }
                        break;
                    case 3:
                        System.out.println("Exiting " + getPlatformName(platformChoice) + " Ticket Booking.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number (1-3).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1-3).");
                scanner.nextLine(); // Clear the scanner buffer
            }
        } while (subChoice != 3);

        scanner.close(); // Close the scanner resource
    }

    private String getPlatformName(int choice) {
        switch (choice) {
            case 1:
                return "Paytm";
            case 2:
                return "BMK";
            case 3:
                return "Amazon";
            default:
                return "Unknown Platform";
        }
    }
}