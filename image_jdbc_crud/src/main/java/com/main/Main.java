package com.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Scanner;

import com.dao.*;
import com.dao.EmployeeDao;
import com.entity.*;
import com.entity.*;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Press 1 for Insert");
			System.out.println("Press 2 for Delete");
			System.out.println("Press 3 for Update");
			System.out.println("Press 4 to showInfo");
			System.out.println("Press 4 for Exit");
			
			int choice=sc.nextInt();
			
			if(choice==1){
				System.out.println("Enter Employee id");
				int emp_id = sc.nextInt();
				
				System.out.println("Enter Employee name");
				String emp_name = sc.next();	
				
				System.out.println("Enter Image path");
				Employee e1 = new Employee(emp_id, emp_name, null);
				EmployeeDao.insert(e1);
				
			}else if(choice==2){
				System.out.println("Please enter Employee ID");
				int emp_id=sc.nextInt();
				EmployeeDao.delete(emp_id);
				
			}
			else if (choice==3) {
				System.out.println("Enter ID to Update");
				int emp_id = sc.nextInt();
				System.out.println("Enter new Employee name");
				String emp_name = sc.next();
				
				Employee e = new Employee(emp_id, emp_name, null);
				EmployeeDao.update(e);
			}
			
			else if(choice == 4){
				System.out.println("Enter ID to Update");
				int emp_id = sc.nextInt();
				
				EmployeeDao.readData(emp_id);
				
			}
			else{
				break;
			}
			
		}
		
		
	}

}
