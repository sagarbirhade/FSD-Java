package ExceptionHeandeling.CustomException;

import java.io.*;

public class CheckExceptionDemo {
    public static void readFile() throws FileNotFoundException {
        FileReader f1 = new FileReader("C:/Users/spati/OneDrive/Desktop/test.txt");
        BufferedReader fileinput = new BufferedReader(f1);

        try{
            String s = fileinput.readLine();
            System.out.println(s);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void createFile() throws IOException {
        FileWriter f2 = new FileWriter("C:/Users/spati/OneDrive/Desktop/test.txt");
        String data = "Hello World";
        BufferedWriter fwriter = new BufferedWriter(f2);
        f2.write(data);
        f2.close();
    }

    public static void main(String[] args) {

        try{
            createFile();
        }catch(IOException e){
            e.printStackTrace();
        }

//        try {
//            readFile();
//            System.out.println("File read successfully");
//        } catch (FileNotFoundException e) {
//            System.out.println("Error: File not found - " + e.getMessage());
//        }

        // Can directly execute createFile() method withiought try catch by
        //making main methods like public static void main(String[] args) throws IOException
    }
}
