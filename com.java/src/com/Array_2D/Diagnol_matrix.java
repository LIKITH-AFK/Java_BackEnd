package com.Array_2D;

import java.util.Iterator;

public class Diagnol_matrix {

	public static void main(String[] args) {
		int c[][]= {
				{1,0,0},
				{0,2,0},
				{0,0,3}
		};
		boolean status=true;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if(i!=j) {
					if(c[i][j]!=0) {
						status=false;
						break;
					}
				}
			}
		}
		if(status) {
			System.out.println("it is a diagnol matrix");
		}else {
			System.out.println("it is not a diagnol matrix");
		}

	}

}
