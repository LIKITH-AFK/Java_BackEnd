package com.Scanner;
import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name=sc.next();
		sc.nextLine();
		System.out.println("Enter Adress : ");
		String address=sc.next();
		sc.nextLine();
		System.out.println("Enter Phone Number : ");
		Long phnumber=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Deposit Amount : ");
		double amount=sc.nextDouble();
		sc.nextLine();
		
		BankApplication obj=new BankApplication(name, address, phnumber, amount);
		
		while(true) {
			
			System.out.println("**** Select an Option from Below ****\r\n"
					+ "1. Withdraw\r\n"
					+ "2. Deposit\r\n"
					+ "3. Show Balance\r\n"
					+ "4. Exit\r\n"
					+ "Enter your option [1-4]: 1");
			int choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("Withdrawl Ammount : ");
			amount=sc.nextDouble();
			obj.withdraw(amount);
			break;
		case 2:
			System.out.println("Deposit Amount : ");
			amount=sc.nextDouble();
			obj.deposit(amount);
			break;
		case 3:
			obj.showBalance();
			break;
		case 4:
			System.out.println("Thank You");
			return;
		default:
			System.out.println("Invalid Option");
			
		}
		sc.close();
		}
			

	}

}
