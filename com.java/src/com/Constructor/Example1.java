package com.Constructor;

public class Example1 {
	
	Example1(){
		System.out.println("No paramaterized Constructor");
	}
	Example1(int a){
		this();
		System.out.println("Single Parameterized Constructor");
	}
	Example1(int a,int b){
		this(10);
		System.out.println("Two Parameterized COnstructor");
	}

	public static void main(String[] args) {
		Example1 obj=new Example1(10,20);

	}

}
