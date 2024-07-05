package ThreadSynchrozation.TicketBookingSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketBookingSystem {

    public static void main(String[] args) throws InterruptedException {
        Ticket ticket = new Ticket(125); // Initialize ticket object with initial count

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the Ticket Booking System!");
            System.out.println("1. Paytm");
            System.out.println("2. BMK");
            System.out.println("3. Amazon");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1-4).");
                scanner.nextLine(); // Clear the scanner buffer
                choice = -1; // Set an invalid choice to trigger another iteration
                continue;
            }

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    TicketBuying user = new TicketBuying(ticket, choice);
                    user.start();
                    break;
                case 4:
                    System.out.println("Exiting the Ticket Booking System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number (1-4).");
            }
        } while (choice != 4);

        scanner.close(); // Close the scanner resource
    }
}
