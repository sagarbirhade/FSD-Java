package ExceptionHeandeling.BankingApp;

import Encapsulation.BankingDetails.Bank;
import ExceptionHeandeling.ThrowKeyword.PasswordValidation.PasswordValidationException;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username");
        String user = sc.nextLine();
        System.out.println("Enter password: ");
        String pass = sc.nextLine();
        String passval = "123456";
        String userval = "potato1234";
        String newpass = passval;
        try{
            if(pass.equals(passval) && user.equals(userval)){
                System.out.println("Welcome you are logged in");
            }
            else{
                throw new PasswordValidationException("Invalid Password Exception");
            }

        }catch(PasswordValidationException e){
            System.out.println(e);
        }


        Bank1 b1 = new Bank1(123455, 4545, 9090);
        int con;
        do {

            System.out.print("Enter 1 for Display Amount: \n");
            System.out.print("Enter 2 for Deposit Amount: \n");
            System.out.print("Enter 3 for Withdraw Amount: \n");
            System.out.print("Enter 4 for Changing Password: \n");
            System.out.println("Enter Input: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println(b1.toString());
                    break;

                case 2:
                    System.out.print("Enter deposit Amount: ");
                    long deposit = sc.nextLong();

                    b1.deposit(deposit);
                    break;

                case 3:
                    try{
                        System.out.print("Enter Withdraw Amount: ");
                        long withdraw = sc.nextLong();
                        if(withdraw > b1.getBalance()){
                            throw new InsufficientBalanceException("Insufficient Balance!");
                        }
                        else{
                            b1.withdrawal(withdraw);
                            System.out.println("Withdrawal Successfull");
                        }

                    }catch(InsufficientBalanceException e){
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.print("Enter Current Password: ");
                    String enteredCurrentPassword = sc.nextLine();

                    if (!enteredCurrentPassword.equals(passval)) {
                        throw new InvalidPasswordException("Incorrect Password");

                    }

                    System.out.print("Enter New Password: ");
                    String newPassword = sc.nextLine();

                    if (newPassword.equals(passval)) {
                        System.out.println("New password cannot be the same as current password!");
                        break;
                    }
                    passval = newPassword;
                    System.out.println("Password Changed Successfully!");
                    break;

                default:
                    System.out.println("Enter Correct Input");

            }
            System.out.print("Do you want to continue(0/1): ");
            con = sc.nextInt();

        } while (con == 1 || con == 0);


    }
}
