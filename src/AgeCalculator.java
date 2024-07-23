import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year of birth: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter month of birth (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Enter day of birth: ");
        int birthDay = scanner.nextInt();

        Calendar today = Calendar.getInstance();
        int currentYear = today.get(Calendar.YEAR);
        int currentMonth = today.get(Calendar.MONTH) + 1; // Month is 0-based
        int currentDay = today.get(Calendar.DAY_OF_MONTH);

        int age = currentYear - birthYear;

        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        System.out.println("Your age is: " + age);

        scanner.close();
    }
}
