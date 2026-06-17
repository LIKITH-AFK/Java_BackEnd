package com.Scanner;

public class BankApplication {
	
	String customerName;
	String customerAddress;
	long phoneNumber;
	double balance;
	
	public BankApplication(String customerName, String customerAddress, long phoneNumber, double balance) {
		
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		System.out.println("Account Created Succesfully");
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Amount Succesfully Added  \nUpdated Balance : "+balance);
		}else {
			System.out.println("Error");
		}
	}
	
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Withdrawl succesful \nUpdated Balance : "+balance);
		}else if(amount>balance){
			System.out.println("Insufficient Balance");
		}else {
			System.out.println("Invalid Withdrawl amount");
		}
	}
	
	public void showBalance() {
		System.out.println("Balance : "+balance);
	}
	
	

}
