package com.CoreJava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Callable_statement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		final String URL="jdbc:mysql://localhost:3306/mydata82838791";
		final String username="root";
		final String password="6300937258";
		String query="{call getStudent(?)}";
		
		try {
			//Stage-1
			Connection connection= DriverManager.getConnection(URL,username,password);
			
			//Stage-2
			CallableStatement cs= connection.prepareCall(query);
			System.out.println("Enter Student ID :- ");
			int IDs=Integer.parseInt(sc.nextLine());
			cs.setInt(1, IDs);
			
			//Stage-3
			ResultSet rs= cs.executeQuery();
			
			//Stage-4
			System.out.println("ID \t Name \t Marks \t age \t StLocation");
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int marks=rs.getInt(3);
				int age=rs.getInt(4);
				String loc=rs.getString(5);
				System.out.println(id+"\t"+ name + "\t" +  marks + "\t" +age+ "\t" +loc);
			}
			
			connection.close();
			rs.close();
			cs.close();
			sc.close();
			
			//Stage-5
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
