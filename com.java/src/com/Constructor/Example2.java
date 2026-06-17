package com.Constructor;

class Parent{
	Parent(){
		System.out.println("Parent class No parameterizaed constructor");
	}
}

class Child extends Parent{
	Child(){
		super();//by default it will be there
		System.out.println("Child class No parameteized constructor");
	}
	
}

public class Example2 {
	

	public static void main(String[] args) {
		Parent obj=new Parent();
		Parent obj1=new Child();
		Child obj2=new Child();
		
	}

}
