package com.Constructor;
import java.util.Scanner;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee obj=new Employee(0, null, null, 0, 0);
		
		obj.setEmpId(sc.nextInt());
		obj.setName(sc.next());
		sc.nextLine();
		obj.setDesignation(sc.next());
		obj.setSalary(sc.nextDouble());
		
		System.out.println(obj.getDesignation());
		System.out.println(obj.getEmpId());
		System.out.println(obj.getName());
		System.out.println(obj.getPerformanceRating());
		System.out.println(obj.getSalary());
		System.out.println("=============================");
		obj.promoteEmployee();
		
		sc.close();
		

	}

}
