package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.DatabaseConnection;
import com.entity.Student;

public class StudentDao {
	
	
    public static boolean insert(Student s) throws ClassNotFoundException, SQLException {
        Connection con = DatabaseConnection.createConnection();
        String q = "INSERT INTO student_table(roll_no, name, marks, department, contact, email) VALUES(?, ?, ?, ?, ?, ?)";
        
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, s.getRoll_no());
        ps.setString(2, s.getName());
        ps.setDouble(3, s.getMarks());
        ps.setString(4, s.getDepartment());
        ps.setString(5, s.getContact());
        ps.setString(6, s.getEmail());
        
        boolean result = ps.execute();
        if (!result) {
            System.out.println("Data inserted successfully.");
        } else {
            System.out.println("Something went wrong!!");
        }
        
        ps.close();
        con.close();
        
        return result;
    }
    
    public static void delete(int roll_no) throws ClassNotFoundException, SQLException {
        Connection con = DatabaseConnection.createConnection();
        
        String q = "DELETE FROM student_table WHERE roll_no = ?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, roll_no);
        
        int result = ps.executeUpdate();
        if (result > 0) {
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("Student roll number not found. Try again.");
        }

    }
    
    public static void update(Student s) throws ClassNotFoundException, SQLException {
        Connection con = DatabaseConnection.createConnection();
        
        String q = "UPDATE student_table SET name = ?, marks = ?, department = ?, contact = ?, email = ? WHERE roll_no = ?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setString(1, s.getName());
        ps.setDouble(2, s.getMarks());
        ps.setString(3, s.getDepartment());
        ps.setString(4, s.getContact());
        ps.setString(5, s.getEmail());
        ps.setInt(6, s.getRoll_no());
        
        int result = ps.executeUpdate();
        if (result > 0) {
            System.out.print("Record updated successfully.");
        } else {
            System.out.println("Student roll number not found. Try again.");
        }
        
     
    }
    
    public static void showDatabase(int rollNoInput) throws ClassNotFoundException, SQLException {
        Connection con = DatabaseConnection.createConnection();
        
        String q = "SELECT * FROM student_table WHERE roll_no = ?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, rollNoInput);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            int roll_no = rs.getInt("roll_no");
            String name = rs.getString("name");
            double marks = rs.getDouble("marks");
            String department = rs.getString("department");
            String contact = rs.getString("contact");
            String email = rs.getString("email");
            
            System.out.println("Roll No: " + roll_no + ", Name: " + name + ", Marks: " + marks + ", Department: " + department + ", Contact: " + contact + ", Email: " + email);
        } else {
            System.out.println("No record found for Roll No: " + rollNoInput);
        }
        
        
    }
    
    public static void updateSpecific(Student s) throws ClassNotFoundException, SQLException{
    	Connection connection = DatabaseConnection.createConnection();
    	
    	
    }
}
