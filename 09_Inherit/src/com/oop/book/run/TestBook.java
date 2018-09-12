package com.oop.book.run;

import com.oop.book.model.vo.Book;

public class TestBook{

	public static void main(String[] args) {
		Book tb1 = new Book("광준이의 자서전", "박광준", 9999999);
		Book tb2 = new Book("광준이의 자서전", "박광준", 9999999);
		
		System.out.println("toString으로 찍어볼게");
		System.out.println(tb1.toString());
		System.out.println(tb2.toString());
		
		System.out.print("두개가 일치하니? : ");
		System.out.println(tb1.equals(tb2));

	}
	
	 

}
