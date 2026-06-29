package com.DSA;

public class String_Sub_Array_Palindrome {

	public static void main(String[] args) {
		
		String s="racecar";
		int l=0;
		int r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)==s.charAt(r)) {
				System.out.println("Is a Palindrome");
			}
			l++;
			r--;
		}

	}

}
