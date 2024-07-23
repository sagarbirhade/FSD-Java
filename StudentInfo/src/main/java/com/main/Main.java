package com.main;

import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

import com.dao.StudentDao;
import com.entity.Student;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to RCPIT..!!");
        
        while (true) {
        	
            System.out.println("Press 1 for Insert");
            System.out.println("Press 2 for Delete");
            System.out.println("Press 3 for Update");
            System.out.println("Press 4 to Show Info");
            System.out.println("Press 5 for Exit");
            
            int choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.println("Enter Student Roll No: ");
                int roll_no = sc.nextInt();
                sc.nextLine(); 
                System.out.println("Enter Student Name:");
                String name = sc.nextLine();
                System.out.println("Enter Student Marks:");
                double marks = sc.nextDouble();
                sc.nextLine(); 
                System.out.println("Enter Student Department:");
                String department = sc.nextLine();
                System.out.println("Enter Student Contact:");
                String contact = sc.nextLine();
                System.out.println("Enter Student Email:");
                String email = sc.nextLine();
                
                Student s = new Student(roll_no, name, marks, department, contact, email);
                boolean ans = StudentDao.insert(s);
                
            } else if (choice == 2) {
                System.out.println("Please enter Student Roll No:");
                int roll_no = sc.nextInt();
                StudentDao.delete(roll_no);
                
            } else if (choice == 3) {
            	
            	
            	while(true) {
            		System.out.println("Press 1 for updating roll no");
                    System.out.println("Press 2 for updating name");
                    System.out.println("Press 3 for updating marks");
                    System.out.println("Press 4 for upfating all info");
                    System.out.println("Press 5 for Exit");
                    System.out.println("Enter Your Choice");
                    int choice1 = sc.nextInt();
                    if(choice == 1) {
                    	
                    }
                    else if(choice == 2) {
                    	
                    	
                    }
                    else if(choice == 3) {
                    	
                    	
                    }
                    else if(choice == 4) {
                    	
                    	
                    }
                    else {
                    	break;
                    }
                    
                    
            		
            	}
            	
            	
            	
            	
            	
            	
            	
                System.out.println("Enter Student Roll No to update: ");
                int roll_no = sc.nextInt();
                sc.nextLine(); 
                
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                
                System.out.println("Enter Marks: ");
                double marks = sc.nextDouble();
                sc.nextLine(); 
                
                System.out.println("Enter Department: ");
                String department = sc.nextLine();
                
                System.out.println("Enter Contact: ");
                String contact = sc.nextLine();
                
                System.out.println("Enter Email: ");
                String email = sc.nextLine();
                
                Student s = new Student(roll_no, name, marks, department, contact, email);
                StudentDao.update(s);
                
            } else if (choice == 4) {
                System.out.println("Enter Student Roll No:");
                int roll_no = sc.nextInt();
                
                StudentDao.showDatabase(roll_no);
                
            } else {
                break;
            }
        }
        
        sc.close();
    }
}
