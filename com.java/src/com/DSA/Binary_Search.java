package com.DSA;
import java.util.Scanner;

public class Binary_Search {
	
	public int search(int arr[],int target) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(mid==target)
				return mid;
			else if(mid<target)
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Binary_Search obj=new Binary_Search();
		Scanner sc=new Scanner(System.in);
		
	}

}
