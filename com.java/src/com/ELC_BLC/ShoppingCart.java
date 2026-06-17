package com.ELC_BLC;

public class ShoppingCart {

	public static void main(String[] args) {
		Product obj=new Product();
		obj.setPrice(20000);
		obj.setProductId(1234);
		obj.setProductName("Samsung S20");
		obj.setQuantity(1);
		
		System.out.println(obj.getPrice());
		System.out.println(obj.getProductId());
		System.out.println(obj.getProductName());
		System.out.println(obj.getQuantity());

	}

}
