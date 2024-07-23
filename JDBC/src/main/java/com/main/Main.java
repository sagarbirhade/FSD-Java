package com.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.CustomerDao;
import com.Connection.*;
import java.util.*;

import entity.Customer;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to jdbc..!!");
		
		while(true){
		System.out.println("Press 1 for Insert");
		System.out.println("Press 2 for Delete");
		System.out.println("Press 3 for Update");
		System.out.println("Press 4 to showInfo");
		System.out.println("Press 4 for Exit");
		
		int choice=sc.nextInt();
		
		if(choice==1){
			System.out.println("Enter Customer ID: ");
			int cid=sc.nextInt();
			System.out.println("Enter Customer Name:");
			String cname=sc.next();
			System.out.println("Enter Customer Bill number:");
			int bill_no=sc.nextInt();
			System.out.println("Enter Amount:");
			double amount=sc.nextDouble();
			
			Customer c=new Customer(cid,cname,bill_no,amount);
			boolean ans=CustomerDao.Insert(c);
			
		}else if(choice==2){
			System.out.println("Please enter customer ID");
			int cid=sc.nextInt();
			CustomerDao.delete(cid);
			
		}
		else if (choice==3) {
			System.out.println("Enter Customer id to update: ");
			int cid = sc.nextInt();
			
			System.out.println("Enter name: ");
			String cname = sc.next();
			
			System.out.println("Enter Bill No: ");
			int bill_no = sc.nextInt();
			
			System.out.println("Enter Amount: ");
			double amount = sc.nextDouble();
			Customer c = new Customer(cid, cname, bill_no, amount);
			CustomerDao.update(c);
			
		}
		
		else if(choice == 4){
			System.out.println("Enter Customer id to update: ");
			int cid = sc.nextInt();
			
			CustomerDao.showDatabase(cid);
			
		}
		else{
			break;
		}
		
	}
		
//		Main m=new Main();
//		Connection_Example c=new Connection_Example();
//		try {
//			c.createConnection();
//		} catch (ClassNotFoundException e) {
//			
//			e.printStackTrace();
//		}catch (Exception e) {
//			
//			e.printStackTrace();
//		}
	}
}