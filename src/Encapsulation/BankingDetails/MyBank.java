package Encapsulation.BankingDetails;

import Codes.Investment;

import java.util.Scanner;
public class MyBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank(123455, 4545, 9090);
        int con;
        do {
        System.out.print("Enter 1 for Display Amount: \n");
        System.out.print("Enter 2 for Deposit Amount: \n");
        System.out.print("Enter 3 for Withdraw Amount: \n");
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
                    System.out.print("Enter Withdraw Amount: ");
                    long withdraw = sc.nextLong();
                    b1.withdrawal(withdraw);
                    break;
                default:
                    System.out.println("Enter Correct Input");

            }
            System.out.print("Do you want to continue(0/1): ");
            con = sc.nextInt();

        } while (con == 1 || con == 0);

    }
}
