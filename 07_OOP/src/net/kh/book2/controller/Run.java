package net.kh.book2.controller;

import net.kh.book2.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book start = new Book("이것은 label", 2018, "광준이의 자서전", "박광준", "박광준", '남', 1, "인천");
		
		start.bookinfo();

	}

}
