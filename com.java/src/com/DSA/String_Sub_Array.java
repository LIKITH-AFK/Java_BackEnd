package com.DSA;

public class String_Sub_Array {
	
	public void palindrome(String s) {
		String temp="";
		String rev="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			temp=temp+ch;
			rev=ch+rev;
		}
		if(temp.equals(rev)) {
			System.out.println(rev+"     "+"is Palindrome");
		}
		else {
			System.out.println(rev+"     "+"Not a Palindrome");
		}
	}

	public static void main(String[] args) {
		
		String s="color";
//		for(int i=0;i<s.length();i++) {
//			for(int j=i;j<s.length();j++) {
//				for(int k=i;k<=j;k++) {
//					System.out.print(s.charAt(k));
//				}
//				System.out.println();
//			}
//		}
		String_Sub_Array obj=new String_Sub_Array();

		for(int i=0;i<s.length();i++) {
		    String temp = "";
		    for(int j=i;j<s.length();j++) {
		        temp = temp+s.charAt(j);
//		        System.out.println(temp);
		        obj.palindrome(temp);
		    }
		   
		}
		
		
		
		

	}

}
