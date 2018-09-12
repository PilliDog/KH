package net.kh.book.controller;

import net.kh.book.model.Book;

public class Run {

	public static void main(String[] args) {
		
		Book start = new Book("이것은 제목입니다", 9900, 0.2);
		start.information();
		
		System.out.println();
		System.out.println();
		
		Book start2 = new Book("이것은 제목입니다", "박광준", "박광준", 9800, 0.1);
		start2.information();

	}

}
