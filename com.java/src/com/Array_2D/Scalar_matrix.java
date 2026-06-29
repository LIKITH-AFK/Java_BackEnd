package com.Array_2D;

public class Scalar_matrix {

	public static void main(String[] args) {
		int c[][]= {
				{1,0,0},
				{0,1,0},
				{0,0,1}
		};
		int temp = c[0][0];
		boolean status = true;

		for (int i = 0; i < c.length; i++) {
		    for (int j = 0; j < c[i].length; j++) {

		        if (i == j) {
		            if (c[i][j] != temp) {
		                status = false;
		                break;
		            }
		        } else {
		            if (c[i][j] != 0) {
		                status = false;
		                break;
		            }
		        }
		    }
		    if (!status) break;
		}
		if(status) {
			System.out.println("it is a scalar matrix");
		}else {
			System.out.println("it is not a scalar matrix");
		}
	}

}
