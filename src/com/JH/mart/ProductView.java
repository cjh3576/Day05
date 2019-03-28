package com.JH.mart;

public class ProductView {
	//제품의 정보를 출력하는 메소드
	public void listView(Product product) {
		System.out.println(product.price);
		System.out.println(product.amount);
		System.out.println(product.brand);
		System.out.println(product.sale);
		
	}
}
