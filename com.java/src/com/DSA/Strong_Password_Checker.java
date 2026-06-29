package com.DSA;

import java.util.Scanner;

public class Strong_Password_Checker {
	
	public boolean strongPasswordCheckerII(String password) {
	       String abc="abcdefghijklmnopqrstuvwxyz";
	       String ABC="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	       String num="1234567890"; 
	       int digit=0;
	       int small=0;
	       int capital=0;
	       int special=0;
	       int adj1=0;
	       int adj2=1;
	       int adj=0;
	       for(int i=0;i<password.length()-1;i++){
	        if(password.charAt(adj1+i)==password.charAt(adj2+i)){
	            adj++;
	        }
	       }
	        for(int i=0;i<password.length();i++){
	            char ch=password.charAt(i);
	            String s2=ch+"";
	            if(num.contains(s2)){
	                digit++;
	            }
	            else if(abc.contains(s2)){
	                small++;
	            }
	            else if(ABC.contains(s2)){
	                capital++;
	            }
	            else{
	                special++;
	            }
	        }
	       
	            if(adj==0 && digit>0 && small>0 && capital>0 && special>0 &&password.length()>=8){
	                return true;
	            }else{
	                return false;
	            }
	    }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Strong_Password_Checker obj=new Strong_Password_Checker();
		String password=sc.next();
//		obj.strongPasswordCheckerII(password);
		System.out.println(obj.strongPasswordCheckerII(password));
		
		sc.close();

	}

}
