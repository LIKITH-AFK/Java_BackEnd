package com.CoreJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_demo {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/mydata82838791";
		final String username="root";
		final String password="6300937258";
		
//		String query="insert into student values(101,'Likith',99,22,'HYD')";
//		String query="insert into student values(102,'Chandu',98,23,'HYD')";
//		String query="insert into student values(103,'Rohit',98,24,'HYD')";
		String query="insert into student values(104,'Surya',98,24,'KPHB')";
//		String query="update student set stlocation='KPHB' where id=101";
//		String query="delete from student where id=102";
		
		
		try {
			//Stage-1
			Connection connection=DriverManager.getConnection(URL,username,password);
//			System.err.println("Establishing the connection sussfully");
			
			//Stage-2
			Statement st=connection.createStatement();
			
			//Stage-3
			int rows= st.executeUpdate(query);
			
			System.out.println(rows+": inserted...");
			
			connection.close();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

}
