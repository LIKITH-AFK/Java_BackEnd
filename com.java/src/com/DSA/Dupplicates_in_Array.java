package com.DSA;

public class Dupplicates_in_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,1};
//		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			int n=a[i];
			for(int j=0;j<a.length;j++) {
				if(n==a[j]) {
					count++;
					if(count>1) {
						System.out.println(n);
					}
				}
			}
		}

	}

}
