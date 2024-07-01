package ExceptionHeandeling.ThrowKeyword.PasswordValidation;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
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




    }
}
