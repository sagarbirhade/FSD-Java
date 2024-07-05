package ThreadSynchrozation.SalaryExpenses;

public class Salary {

    double total_salary = 30000;
    static double expenses;
    double remaining;

    synchronized void showExpenses(double expenses){
        if(this.total_salary > expenses){
            System.out.println("Payment successful");
            this.total_salary = this.total_salary - expenses;
            this.remaining  = this.total_salary;
            System.out.println("Remaining Amount: "+this.remaining);
        }
        else{
            System.out.println("Insufficient Funds...!!! Try Again...");
            throw new InsufficientFundException("Check your balance..!!");
        }

    }
}
