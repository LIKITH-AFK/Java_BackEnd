package com.Array_2D;

import java.util.Arrays;

public class Matrix_Addition {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int c[][]=new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(Arrays.toString(c[i]));
		}
		int left_diag = 0;
		for(int i=0;i<c.length;i++) {
			for(int j=i;j<c.length;j++) {
				if(i==j) {
					left_diag=left_diag+c[i][j];
				}
			}
		}
		System.out.println("Left_Diagnol elements addition : "+left_diag);
		
		int right_diag=0;
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(i+j==c.length-1) {
					right_diag=right_diag+c[i][j];
				}
			}
		}
		System.out.println("Right_Diagnol elements addition : "+right_diag);
		

	}

}
