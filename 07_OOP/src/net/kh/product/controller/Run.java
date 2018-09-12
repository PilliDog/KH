package net.kh.product.controller;

import net.kh.product.model.Product;

public class Run {

	public static void main(String[] args) {
		
		Product start = new Product();
		
		start.setpName("물건1");
		start.setPrice(10000);
		start.setBrand("노브랜드");
		start.setTaxRate(20.0);
		
		start.information();

	}

}
