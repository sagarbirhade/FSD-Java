package ExceptionHeandeling.CustomException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckExceptionDemo {
    public static void readFile() throws FileNotFoundException {
        FileReader f1 = new FileReader("C:/Users/spati/OneDrive/Desktop/test.txt");
        // No further operations needed before exception handling
    }

    public static void main(String[] args) {
        try {
            readFile();
            System.out.println("File read successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }
    }
}
