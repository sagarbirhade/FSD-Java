package ExceptionHeandeling.ThrowKeyword;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try{
            if(age < 18){
                throw new AgevalidationException("Not Eligible..!!");
                // System.out.println("1234"); It will not execute this bcoz it goes to AgevalidationException Class
                // if this happens this is unreachable code
            }
            else{
                System.out.println("You are eligible for vote");
                System.out.println("1234");
            }

        }catch(AgevalidationException e){
            e.printStackTrace();
        }
        System.out.println("Exception Handled!!");

    }
}
