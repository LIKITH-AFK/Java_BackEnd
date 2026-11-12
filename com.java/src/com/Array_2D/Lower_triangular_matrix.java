package com.Array_2D;

public class Lower_triangular_matrix {

	public static void main(String[] args) {
		int a[][]= {
				{1,0,0},
				{4,5,0},
				{7,8,9}
		};
		boolean status=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(i<j) {
					if(a[i][j]!=0) {
						status=false;
						break;
					}
					
				}
			}
		}
		if(status) {
			System.out.println("it is a lower triangular matrix");
		}else {
			System.out.println("Not a lower triangular matrix");
		}

	}

}
