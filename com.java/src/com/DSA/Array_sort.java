package com.DSA;

import java.util.Arrays;

public class Array_sort {

	public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5};
//	for(int i=1;i<a.length;i++) {
//		if(a[i-1]>a[i]) {
//			System.out.println(false);
//		}else {
//			System.out.println(true);
//		}
//	}
//	int temp=a[0];
//	for(int i=0;i<a.length-1;i++) {
//		a[i]=a[i+1];
//	}
//	a[a.length-1]=temp;
//	System.out.println(Arrays.toString(a));
	
	int temp=a[a.length-1];
	for(int i=a.length-1;i>=1;i--) {
		a[i]=a[i-1];
		System.out.println(a[i]);
	}
	a[0]=temp;
	System.out.println(Arrays.toString(a));
	}

}
