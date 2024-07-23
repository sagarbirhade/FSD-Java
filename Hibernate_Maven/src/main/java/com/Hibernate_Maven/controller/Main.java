package com.Hibernate_Maven.controller;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate_Maven.entity.Customer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: ");
            System.out.println("1. Insert Customer");
            System.out.println("2. Delete Customer");
            System.out.println("3. Update Customer");
            System.out.println("4. Show All Customers");
            System.out.println("5. Show Customer by ID");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer ID: ");
                    int cid = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.println("Enter Customer Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter Customer Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    System.out.println("Enter Vehicle No: ");
                    String vehicle_no = scanner.nextLine();

                    insert(cid, name, amount, vehicle_no);
                    break;
                case 2:
                    System.out.println("Enter Customer ID to delete: ");
                    int deleteId = scanner.nextInt();
                    delete(deleteId);
                    break;
                case 3:
                    System.out.println("Enter Customer ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.println("Enter new Customer Name: ");
                    String newName = scanner.nextLine();

                    System.out.println("Enter new Customer Amount: ");
                    double newAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    System.out.println("Enter new Vehicle No: ");
                    String newVehicleNo = scanner.nextLine();

                    update(updateId, newName, newAmount, newVehicleNo);
                    break;
                case 4:
                    showDetails();
                    break;
                case 5:
                    System.out.println("Enter Customer ID: ");
                    int showId = scanner.nextInt();
                    showCustomerById(showId);
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

    public static void insert(int cid, String name, double amount, String vehicle_no) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Customer c = new Customer(cid, name, amount, vehicle_no);

        session.save(c);
        trans.commit();
        session.close();
        factory.close();

        System.out.println("Inserted Successfully");
    }

    public static void delete(int cid) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Customer c = session.get(Customer.class, cid);
        if (c != null) {
            session.delete(c);
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Customer with ID " + cid + " not found");
        }

        trans.commit();
        session.close();
        factory.close();
    }

    public static void update(int cid, String name, double amount, String vehicle_no) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Customer c = session.get(Customer.class, cid);
        if (c != null) {
            c.setName(name);
            c.setAmount(amount);
            c.setVehical_no(vehicle_no);
            session.update(c);
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Customer with ID " + cid + " not found");
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

        List<Customer> customers = session.createQuery("from Customer", Customer.class).list();
        for (Customer c : customers) {
            System.out.println(c);
        }

        session.close();
        factory.close();
    }

    public static void showCustomerById(int cid) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();

        Customer c = session.get(Customer.class, cid);
        if (c != null) {
            System.out.println(c);
        } else {
            System.out.println("Customer with ID " + cid + " not found");
        }

        session.close();
        factory.close();
    }
}
