package com.Object_NonStaticVariables_Methods;

public class Car {
	String carMake ;
	String carModel ;
	int manufacturingYear ;
	
	public void addCarDetails(String carmake,String carmodel,int manufacturingyear) {
		carMake=carmake;
		carModel=carmodel;
		manufacturingYear=manufacturingyear;
	}
	
	public String displayDetails() {
		return ("Carmake :"+carMake+"\nCar Model :"+carModel+"\nManufaturing Year :"+manufacturingYear);
	}

	public static void main(String[] args) {
		Car c=new Car();
		c.addCarDetails("Ford", "Mustang", 1969);
		System.out.println(c.displayDetails());
	}

}
