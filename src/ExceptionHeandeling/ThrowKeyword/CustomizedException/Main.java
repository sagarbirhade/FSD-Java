package ExceptionHeandeling.ThrowKeyword.CustomizedException;

import ExceptionHeandeling.ThrowKeyword.PasswordValidation.PasswordValidationException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = null;
        int arr[] = new int[4];

        try {
            try{
                String s = null;
                if(s == null)
                {
                    //throw new ArithmeticException("You are Failed...Please try Again...!!!");
                    throw new StringNullException("Your age is low for the Creterion...Please try Again...!!!");
                }
                else
                {
                    System.out.println("You Have valid age to Go...!!!");
                }

            } catch (StringNullException e) {
                e.printStackTrace();
            }
            System.out.println("First Exception done");


            try{
                if(arr.length > 5){
                    throw new ArrayIndexException("Array index exception");
                }
            }catch(ArrayIndexException e){
                e.printStackTrace();
            }
            System.out.println("Second Exception done");


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter username");
            String user = sc.nextLine();
            System.out.println("Enter password: ");
            String pass = sc.nextLine();
            String passval = "123456";
            String userval = "potato1234";
            try{
                if(pass.equals(passval) && user.equals(userval)){
                    System.out.println("Welcome you are logged in");
                }
                else{
                    throw new PasswordValidationException("Invalid Password Exception");
                }

            }catch(PasswordValidationException e){
                e.printStackTrace();
            }
            System.out.println("Exception Handled");

        }catch(MyException e){
            e.printStackTrace();
        }
        System.out.println("All exception handled Successfully");

    }
}
