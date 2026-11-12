package com.CoreJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcResultSet {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/mydata82838791";
		final String username="root";
		final String password="6300937258";
		
		String query="select * from student";
		
		try {
			//Stage-1
			Connection connection=DriverManager.getConnection(URL,username,password);
			
			//Stage-2
			Statement st=connection.createStatement();
			
			//Stage-3
			ResultSet rs=st.executeQuery(query);
			
			//Stage-4
			
//			rs.next();
//			int id=rs.getInt(1);
//			System.out.println(id);
//			rs.next();
//			int id2=rs.getInt(1);
//			System.out.println(id2);
			
			System.out.println("ID \t Name \t Marks \t age \t StLocation");
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int marks=rs.getInt(3);
				int age=rs.getInt(4);
				String loc=rs.getString(5);
				System.out.println(id+"\t"+ name + "\t" +  marks + "\t" +age+ "\t" +loc);
			}
			
			//Stage-5
			connection.close();
			rs.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
