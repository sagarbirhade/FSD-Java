package Polymorphism;

public class Team_Lead extends Manager {
    int working_hours = 10;
    static double salary = 70000;

    void printWorkingHours(){
        System.out.println("Team Lead :"+working_hours );
        System.out.println("manager: "+super.working_hours);
        System.out.println("Team Lead: "+salary);
        System.out.println("manager: "+super.salary);
        System.out.println("Manager: "+Manager.salary);

    }

    public static void main(String[] args) {
        Team_Lead t1 = new Team_Lead();
        t1.printWorkingHours();
    }

}
