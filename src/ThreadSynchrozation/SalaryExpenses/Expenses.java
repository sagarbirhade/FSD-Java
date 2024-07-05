package ThreadSynchrozation.SalaryExpenses;

public class Expenses extends Thread {
    static double expenses;
    static Salary s;
    static double remaining;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        s.showExpenses(expenses);
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) throws InterruptedException {
        s = new Salary();

        Expenses travelling = new Expenses();
        travelling.expenses = 3000;
        travelling.start();
        Thread.sleep(1000);


        Expenses food = new Expenses();
        food.expenses = 4000;
        food.start();
        Thread.sleep(1500);


        Expenses accomodation = new Expenses();
        accomodation.expenses = 3000;
        accomodation.start();
        Thread.sleep(1000);

        Expenses entertainment = new Expenses();
        entertainment.expenses = 3000;
        entertainment.start();
        Thread.sleep(1000);

        Expenses hiking = new Expenses();
        hiking.expenses = 3000;
        hiking.start();
        Thread.sleep(1000);
    }
}
