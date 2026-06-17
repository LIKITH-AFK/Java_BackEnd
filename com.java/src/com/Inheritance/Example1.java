package com.Inheritance;

class Parent{
	
	public void X() {
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	
	public void Y() {
		System.out.println("Child Class");
	}
	
}

public class Example1 {

	public static void main(String[] args) {
//		Child obj=new Child();//we can access both parent and child class preoperties
//		obj.Y();
//		obj.X();
		
//		Parent obj=new Child();//we can access parent but not child class properties
//		obj.X();
//		obj.Y();
		
		Child obj=(Child)new Parent();//this is known as Down casting
//		obj.X();//even though we can access parent properties by downcasting we get class cast exception
		obj.Y();

	}

}
