package com.firstproject;

import java.sql.Connection;

import java.sql.PreparedStatement;

public class StudentDao {
	
	public static boolean insertStudentToDB(students st) {
		
		boolean f=false;
		
		try {		
			Connection con =cp.createC();
			String q ="insert into student(sname, sphone) values(?,?)";
			PreparedStatement pstmt=  con.prepareStatement(q);
			
			pstmt.setString(1, st.getStdName());
			pstmt.setString(2, st.getStdPhone());
			
			
			pstmt.executeUpdate();
			f=true;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

}
