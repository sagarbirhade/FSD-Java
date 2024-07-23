package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.*;
import com.mysql.cj.xdevapi.PreparableStatement;

import entity.Customer;


public class CustomerDao {
	Customer c;
	public static boolean Insert(Customer c) throws ClassNotFoundException, SQLException{
		Connection con=DatabaseConnection.createConnection();
		String q="insert into customer_table(cid,cname,bill_no,amount) values(?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1,c.getCid());
		ps.setString(2, c.getCname());
		ps.setInt(3, c.getBill_no());
		ps.setDouble(4, c.getAmount());
		
		boolean result=ps.execute();
		if(result==false){
			System.out.println("Data inserted");
		}else{
			System.out.println("Something went wrong!!");
			
		}
		return result;
	}
	
	public static void delete(int cid) throws ClassNotFoundException, SQLException {
		Connection con= DatabaseConnection.createConnection();
		
		String q="delete from customer_table where cid=?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1, cid);
		
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.print("Record deleted successfull ! .. ");
		}else {
			System.out.println("Customer id not found. Try again !. . ");
		}
		System.out.println();
	}
	
	public static void update(Customer c) throws ClassNotFoundException, SQLException{
		Connection con = DatabaseConnection.createConnection();
		
		String q = "update customer_table set cname = ?, bill_no = ?, amount = ? where cid = ? ";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, c.getCname());
		ps.setInt(2, c.getBill_no());
		ps.setDouble(3, c.getAmount());
		ps.setInt(4, c.getCid());
		
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.print("Record updated successfully.. .. ");
		}else {
			System.out.println("Customer id not found. Try again !. . ");
		}
		System.out.println();
		
		
	}
	
	
	public static void showDatabase(int cidInput) throws ClassNotFoundException, SQLException {

	    Connection con = DatabaseConnection.createConnection();
	    
	    String q = "SELECT * FROM customer_table WHERE cid = ?";
	    PreparedStatement ps = con.prepareStatement(q);
	    ps.setInt(1, cidInput); // Set the cid parameter
	    

	    ResultSet rs = ps.executeQuery();

	    if (rs.next()) {
	        int cid = rs.getInt("cid");
	        String cname = rs.getString("cname");
	        int bill_no = rs.getInt("bill_no");
	        double amount = rs.getDouble("amount");
	        
	        System.out.println("CID: " + cid + ", CName: " + cname + ", Bill No: " + bill_no + ", Amount: " + amount);
	    } else {
	        System.out.println("No record found for CID: " + cidInput);
	    }
	    

	}


}