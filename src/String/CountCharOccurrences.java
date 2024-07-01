package String;
import java.util.Scanner;
public class CountCharOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sting: ");
        String str = sc.nextLine();
        int MAX_CHAR = 256;

        int[] charCount = new int[MAX_CHAR];

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        for (int i = 0; i < MAX_CHAR; i++) {
            if (charCount[i] > 0) {
                char ch = (char) i;
                System.out.println("Character '" + ch + "' repeated " + charCount[i] + " times");
            }
        }
    }
}
