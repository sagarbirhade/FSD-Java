package com.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: ");
            System.out.println("1. Insert Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID: ");
                    int sid = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.println("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter Student Marks: ");
                    double marks = scanner.nextDouble();

                    System.out.println("Enter Student Contact: ");
                    long contact = scanner.nextLong();

                    insert(sid, name, marks, contact);
                    break;
                case 2:
                    System.out.println("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    delete(deleteId);
                    break;
                case 3:
                    System.out.println("Enter Student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.println("Enter new Student Name: ");
                    String newName = scanner.nextLine();

                    System.out.println("Enter new Student Marks: ");
                    double newMarks = scanner.nextDouble();

                    System.out.println("Enter new Student Contact: ");
                    long newContact = scanner.nextLong();

                    update(updateId, newName, newMarks, newContact);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void insert(int sid, String name, double marks, long contact) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Student std = new Student(sid, name, marks, contact);

        session.save(std);
        trans.commit();
        session.close();
        factory.close();

        System.out.println("Inserted Successfully");
    }

    public static void delete(int sid) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Student std = session.get(Student.class, sid);
        if (std != null) {
            session.delete(std);
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Student with ID " + sid + " not found");
        }

        trans.commit();
        session.close();
        factory.close();
    }

    public static void update(int sid, String name, double marks, long contact) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Student std = session.get(Student.class, sid);
        if (std != null) {
            std.setName(name);
            std.setMarks(marks);
            std.setContact(contact);
            session.update(std);
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Student with ID " + sid + " not found");
        }

        trans.commit();
        session.close();
        factory.close();
    }
}
