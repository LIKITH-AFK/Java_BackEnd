package com.IF_ELSE;

public class Even_Odd_method {
	
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		Even_Odd_method obj=new Even_Odd_method();
		System.out.println(obj.isEven(10));
	}

}
