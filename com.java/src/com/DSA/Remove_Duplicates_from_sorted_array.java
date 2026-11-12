package com.DSA;

import java.util.Arrays;

public class Remove_Duplicates_from_sorted_array {

	public static void main(String[] args) {
		
		int a[]= {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				a[i+1]=0;
			}
		}

		System.out.println(Arrays.toString(a));

	}

}
