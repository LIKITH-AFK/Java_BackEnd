package com.ELC_BLC;

public class BankApplication {

	public static void main(String[] args) {
		
		BankAccount obj=new BankAccount();
		
		obj.setAccountHolderName("Likith");;
		obj.setAccountNumber(1234);
		obj.setBalance(100000);
		
		System.out.println(obj.getAccountHolderName());
		System.out.println(obj.getAccountNumber());
		System.out.println(obj.getBalance());
		

	}

}
