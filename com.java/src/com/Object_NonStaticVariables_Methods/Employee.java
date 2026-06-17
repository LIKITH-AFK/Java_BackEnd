package com.Object_NonStaticVariables_Methods;

public class Employee {
	String employeeName;
	int employeeId;
	double employeeSalary;
	
	public void EmployeeDetails(String empname,int empid,double empsalary) {
		employeeName=empname;
		employeeId=empid;
		employeeSalary=empsalary;
//		System.out.println(employeeId+""+employeeId+""+employeeSalary);
		
	}
	 public String DisplayDatails() {
		 return ("Employee Name: "+employeeName+""+"\nEmployee Id: "+employeeId+""+"\nEmployee Salary: "+employeeSalary);
	 }

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.EmployeeDetails("Likith", 455, 1000000);
		System.out.println(obj.DisplayDatails());
		

	}

}
