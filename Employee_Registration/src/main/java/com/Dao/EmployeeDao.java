package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Connection.Connector;
import com.entity.Employee;

public class EmployeeDao {
	
	public int register(Employee e) throws ClassNotFoundException, SQLException {
		
		Connection con = Connector.createConnection();
		String q = "insert into emp_tbl(empid, firstname, lastname, username, password, address, contact) values(?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(q);
		ps.setInt(1, e.getEmpid());
		ps.setString(2, e.getFirstName());
		ps.setString(3, e.getLastName());
		ps.setString(4, e.getUserName());
		ps.setString(5, e.getPassword());
		ps.setString(6, e.getAddress());
		ps.setString(7, e.getContact());
		
		return ps.executeUpdate();
	}

}
