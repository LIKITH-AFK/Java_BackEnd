package com.DSA;
import java.util.Scanner;

public class gmail_check {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String a=sc.next();
		String a="likith.15@gmail.com";
		String gmail="@gmail.com";
		String num="1234567890";
		String abc="abcdefghijklmnopqrstuvwxyz";
		String special="~!@$%^&*-_=+`,.<>/?|{}[]";

		String a1=a.charAt(0)+"";
		int len=a.length()-10;

		String first=a.substring(0, len);
		System.out.println(first);

		String second=a.substring(first.length(), a.length());
		System.out.println(second);

		boolean status = true;

		if(gmail.equals(second) && !special.contains(a1)) {

			for(int i=0;i<first.length();i++) {
				String ch = first.charAt(i)+"";

				if(!(abc.contains(ch) || num.contains(ch) ||
						ch.equals(".") || ch.equals("_"))) {
					status = false;
					break;
				}
			}

			if(status) {
				System.out.println("Valid");
			}
			else {
				System.out.println("Invalid");
			}
		}
		else{
			System.out.println("Invalid");
		}
	}
}