package Codes;

import javax.swing.*;
import java.util.Scanner;

public class Investment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amt: ");
        double mainAmt = sc.nextDouble();
        System.out.println("Enter Details: ");
        System.out.print("Enter ROI: ");
        double roi = sc.nextDouble();
        System.out.print("Enter Principal Amt: ");
        double pa = sc.nextDouble();
        System.out.print("Enter duration: ");
        double dur = sc.nextDouble();
        Investment i1 = new Investment();
        System.out.print("Enter 1 for SIP: \n");
        System.out.print("Enter 2 for FD: \n");
        System.out.print("Enter 3 for RD: \n");
        int num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println("SIP Amt: "+i1.SIP(roi,pa,dur,mainAmt));

                break;

            case 2:
                System.out.println("FD Amt: "+i1.FD(pa, roi, dur));
                break;

            case 3:
                System.out.println("RD Amt: "+i1.RD(pa,roi,dur));
                break;
            default:
                System.out.println("Enter Correct Input");

        }

    }
    public double SIP(double roi, double pa, double dur, double mainAmt) {
        // Future value of main amount
        double futureValueMain = mainAmt * Math.pow(1 + roi, dur);

        // Existing SIP formula
        double sipValue = pa * ((Math.pow(1 + roi, dur - 1) - 1) / roi);

        // Maturity amount with main amount
        return futureValueMain + sipValue;
    }
    public double FD(double principal, double interestRate, double duration) {
        // Calculate maturity amount using simple interest (adjust for compounding if needed)
        double interest = principal * interestRate * duration;
        return principal + interest;
    }
    public double RD(double pa, double roi, double duration) {
        // Formula for RD maturity amount (adjust based on specific RD scheme)
        double durationYears = duration / 12; // Convert months to years
        double maturityAmount = pa * ((Math.pow(1 + roi, durationYears) - 1) / roi);
        return maturityAmount;
    }




}
