package com.firstproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class cp {

	static Connection con;
	
	public static Connection createC() {
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String user ="root";
			String password="Shubham@2807";
			String url ="jdbc:mysql://localhost:3306/student_manage";
			con = DriverManager.getConnection(url, user, password);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
