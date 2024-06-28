package Encapsulation.BankingDetails;

import java.sql.SQLOutput;

public class Bank {
    private long ac_no;
    private long balance;
    private long check_no;
    private long deposit;
    private long withdrawal;
    private long atm_no;

    public Bank(long ac_no, long balance, long check_no, long deposit, long withdrawal, long atm_no){
        this.ac_no = ac_no;
        this.balance = balance;
        this.check_no = check_no;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.atm_no = atm_no;
    }
    public Bank(long ac_no, long check_no, long atm_no){
        this.ac_no = ac_no;
        this.balance = 0;
        this.check_no = check_no;
        this.deposit = 0;
        this.withdrawal = 0;
        this.atm_no = atm_no;
    }

    public Bank(){

    }

    public long getAc_no() {
        return ac_no;
    }

    public void setAc_no(long ac_no) {
        this.ac_no = ac_no;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getCheck_no() {
        return check_no;
    }

    public void setCheck_no(long check_no) {
        this.check_no = check_no;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(long withdrawal) {
        this.withdrawal = withdrawal;
    }

    public long getAtm_no() {
        return atm_no;
    }

    public void setAtm_no(long atm_no) {
        this.atm_no = atm_no;
    }
    void deposit(long deposit){
        this.balance = balance + deposit;
        System.out.println("Deposit Successfull");
        System.out.println("Account balance: "+getBalance());
    }

    void withdrawal(long withdraw){
        this.balance = balance - withdraw;
        System.out.println("Withdrawal Successfull");
        System.out.println("Account balance: "+getBalance());
    }

    @Override
    public String toString() {
        return "Bank{" +
                "ac_no=" + ac_no +
                ", balance=" + balance +
                ", check_no=" + check_no +
                ", deposit=" + deposit +
                ", withdrawal=" + withdrawal +
                ", atm_no=" + atm_no +
                '}';
    }
}
