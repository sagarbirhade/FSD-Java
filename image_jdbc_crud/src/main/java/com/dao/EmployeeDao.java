package com.dao;

import java.awt.geom.Ellipse2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import java.io.ByteArrayOutputStream;


import com.Connection.Connector;
import com.entity.Employee;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class EmployeeDao {
	
	public static boolean insert(Employee e) throws ClassNotFoundException, SQLException, FileNotFoundException{
		Connection con = Connector.createConnection();
		
		String q = "insert into image_table values(?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setInt(1, e.getEmp_id());
		ps.setString(2, e.getEmp_name());
		
		FileInputStream fis = new FileInputStream("C://Users//spati//OneDrive//Pictures//Snapchat-17896255.jpg");
		ps.setBinaryStream(3, fis);
		boolean result = ps.execute();
		
		if(result != false) {
			System.out.println("Failed....Try again..");
			System.out.println("----------------------------------");

		}
		else {
			System.out.println("data inserted");
			System.out.println("----------------------------------");

		}
		return false;
		
		
	}
	
	public static void delete(int emp_id) throws ClassNotFoundException, SQLException {
		Connection con = Connector.createConnection();
		
		String q = "delete from image_table where emp_id = ?";
		PreparedStatement ps = con.prepareStatement(q);
		
		ps.setInt(1, emp_id);
		
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.print("Record deleted successfully! .. ");
			System.out.println("----------------------------------");

		}else {
			System.out.println("Customer id not found. Try again!. . ");
			System.out.println("----------------------------------");

		}
		System.out.println();
		
	}
	
	public static void update(Employee e) throws ClassNotFoundException, SQLException, FileNotFoundException {
		Connection connection = Connector.createConnection();
		
		String q = "update image_table set emp_name = ?, image = ? where emp_id = ?";
		PreparedStatement ps = connection.prepareStatement(q);
		
		ps.setInt(3, e.getEmp_id());
		ps.setString(1, e.getEmp_name());
		
		FileInputStream fis = new FileInputStream("C:\\Users\\spati\\OneDrive\\Pictures\\Screenshots\\mayur.png");
		ps.setBinaryStream(2, fis);
		
		int result = ps.executeUpdate();
		if(result > 0) {
			System.out.println("Details updated");
			System.out.println("----------------------------------");

		}
		else {
			System.out.println("Failed to update!!");
			System.out.println("----------------------------------");

		}
	}
	
	public static void readData(int emp_id) throws ClassNotFoundException, SQLException, IOException {
		Connection con = Connector.createConnection();
		
		String q = "select * from image_table where emp_id = ?";
		String path = "C:\\Users\\spati\\OneDrive\\Desktop\\JFSD\\image.jpg";
		PreparedStatement ps = con.prepareStatement(q);
		
		ps.setInt(1, emp_id);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			InputStream is = rs.getBinaryStream("image");
			OutputStream fos = new FileOutputStream(path);
			
			byte[] buffer = new byte[4096];
			int bytesread;
			while((bytesread = is.read(buffer))!= -1) {
				fos.write(buffer, 0, bytesread);
			}
			
			is.close();
			fos.close();
		}
	}
}
