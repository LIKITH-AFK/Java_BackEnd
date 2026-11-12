package com.Multithreading;

public class MyThread extends Thread{
	@Override
	public void run() {
		for (int i=0;i<=5;i++) {
			System.out.println("Hello from MyThread"+i);
		}
	}

	public static void main(String[] args) {
		
		MyThread obj=new MyThread();
		
		obj.start();
		

	}

}
