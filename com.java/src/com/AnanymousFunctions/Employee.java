package com.AnanymousFunctions;
import java.util.function.Predicate;
import java.util.function.Consumer;


public class Employee {
	
	String empname;
	String empdesg;
	double empsal;

	public Employee(String empname, String empdesg, double empsal) {
		this.empname = empname;
		this.empdesg = empdesg;
		this.empsal = empsal;
	}
	public String getEmpname() {
		return empname;
	}
    public String getEmpdesg() {
		return empdesg;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setEmpdesg(String empdesg) {
		this.empdesg = empdesg;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empdesg=" + empdesg + ", empsal=" + empsal + "]";
	}
	public static void main(String[] args) {
		
		Predicate<Employee> p=new Predicate<Employee>() {
			
			@Override
			public boolean test(Employee t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		Consumer<Employee> c=new Consumer<Employee>() {
			
			@Override
			public void accept(Employee t) {
				// TODO Auto-generated method stub
				
			}
		};
		
		

	}

}
