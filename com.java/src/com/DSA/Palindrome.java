package com.DSA;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=12321;
		int temp=num;
		int n=0;
		while(num!=0) {
			n=num%10+n*10;
			num=num/10;
			
		}
		if(n==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
