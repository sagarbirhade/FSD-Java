package com.Hibernate_Maven_3rd_Method.controller;

import java.util.Scanner;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate_Maven_3rd_Method.entity.Employee;

public class Employee_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: ");
            System.out.println("1. Insert Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Show All Employees");
            System.out.println("5. Show Employee by ID");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Employee ID: ");
                    int empid = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.println("Enter Employee First Name: ");
                    String fname = scanner.nextLine();

                    System.out.println("Enter Employee Last Name: ");
                    String lname = scanner.nextLine();

                    System.out.println("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    System.out.println("Enter Contact No: ");
                    long contact = scanner.nextLong();

                    insert(empid, fname, lname, salary, contact);
                    break;
                case 2:
                    System.out.println("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    delete(deleteId);
                    break;
                case 3:
                    System.out.println("Enter Employee ID: ");
                    int updateempid = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.println("Enter Employee First Name: ");
                    String updatefname = scanner.nextLine();

                    System.out.println("Enter Employee Last Name: ");
                    String updatelname = scanner.nextLine();

                    System.out.println("Enter Salary: ");
                    double updatesalary = scanner.nextDouble();

                    System.out.println("Enter Contact No: ");
                    long updatecontact = scanner.nextLong();

                    update(updateempid, updatefname, updatelname, updatesalary, updatecontact);
                    break;
                case 4:
                    showDetails();
                    break;
                case 5:
                    System.out.println("Enter Employee ID: ");
                    int showId = scanner.nextInt();
                    showEmployeeById(showId);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void insert(int empid, String fname, String lname, double salary, long contact) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Employee e = new Employee(empid, fname, lname, salary, contact);

        session.save(e);
        trans.commit();
        session.close();
        factory.close();

        System.out.println("Inserted Successfully");
    }

    public static void delete(int empid) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Employee e = session.get(Employee.class, empid);
        if (e != null) {
            session.delete(e);
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Employee with ID " + empid + " not found");
        }

        trans.commit();
        session.close();
        factory.close();
    }

    public static void update(int empid, String fname, String lname, double salary, long contact) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Employee e = session.get(Employee.class, empid);
        if (e != null) {
            e.setFname(fname);
            e.setLname(lname);
            e.setSalary(salary);
            e.setContact(contact);

            session.update(e);
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Employee with ID " + empid + " not found");
        }

        trans.commit();
        session.close();
        factory.close();
    }

    public static void showDetails() {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();

        List<Employee> employees = session.createQuery("from Employee", Employee.class).list();
        for (Employee e : employees) {
            System.out.println(e);
        }

        session.close();
        factory.close();
    }

    public static void showEmployeeById(int empid) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();

        Employee e = session.get(Employee.class, empid);
        if (e != null) {
            System.out.println(e);
        } else {
            System.out.println("Employee with ID " + empid + " not found");
        }

        session.close();
        factory.close();
    }
}
