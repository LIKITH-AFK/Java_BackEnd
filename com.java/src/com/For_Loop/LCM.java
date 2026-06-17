package com.For_Loop;

public class LCM {
	
	public void lcm(int a,int b) {
		for(int i=1;i<=a*b;i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		LCM obj=new LCM();
		obj.lcm(3, 5);

	}

}
