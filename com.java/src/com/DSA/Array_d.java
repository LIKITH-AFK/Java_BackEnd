package com.DSA;

public class Array_d {
	public static void main(String[] args){
		int[] a= {1,2,6,6,6,6,7};
		int d=a.length/3;
		int br=0;
		int[] b= new int[a.length];		
		for(int i=0;i<a.length;i++)
		{int c=0;
			for(int j=0;j<a.length;j++)
			{
			   if(a[i]==a[j])
			   {
				   c++;
			   }
			}
			b[i]=c;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" "+b[i]);
		}
	}
}
