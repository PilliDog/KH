package net.kh.product2.controller;

import net.kh.product2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Product start = new Product("책", "광준이의 자서전", "2100000000", 1, false);
		start.productlnfo();
		
		System.out.println();
		System.out.println();
		
		Product start2 = new Product("책", "광준이의 자서전", "2100000000", 1, true, 0.3);
		start2.productlnfo();

	}

}
