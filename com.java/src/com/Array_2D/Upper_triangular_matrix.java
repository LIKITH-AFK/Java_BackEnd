package com.Array_2D;

public class Upper_triangular_matrix {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{0,5,6},
				{0,0,9}
		};
		boolean status=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(i>j) {
					if(a[i][j]!=0) {
						status=false;
						break;
					}
					
				}
			}
		}
		if(status) {
			System.out.println("it is a upper triangular matrix");
		}else {
			System.out.println("Not a upper triangular matrix");
		}

	}

}
