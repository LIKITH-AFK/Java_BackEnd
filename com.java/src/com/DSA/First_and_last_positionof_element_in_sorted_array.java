package com.DSA;

public class First_and_last_positionof_element_in_sorted_array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,8};
		int target=8;
		for(int i=0;i<a.length;i++){
            if(a[i]==target){
                System.out.println(i);
            }
        }

	}

}
