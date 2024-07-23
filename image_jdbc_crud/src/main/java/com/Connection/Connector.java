package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	public static Connection createConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/image_jdbc_crud";
		String username="root";
		String password="root";
		
		Connection con= DriverManager.getConnection(url,username,password);
		
		if(con!=null){
			System.out.println("----------------------------------");
			System.out.println("Connection Created");
			System.out.println("----------------------------------");

		}
		else{
			System.out.println("Try Again..!!!");
		}
		return con;
	}
}
