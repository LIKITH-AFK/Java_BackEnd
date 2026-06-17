package com.Constructor;

public class Employee {
	
	int empId ;
	String name ;
	String designation ;
	double salary ;
	int performanceRating ;
	
	public Employee(int empId, String name, String designation, double salary, int performanceRating) {
		
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.performanceRating = performanceRating;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	
	public void promoteEmployee() {
		if(performanceRating>=4) {
			salary=salary*0.2+salary;
			System.out.println("Promoted to Next Level"+"\nSalary :"+salary);
		}else {
			System.out.println("No Promotion");
		}
	}
	
	
	
	

}
