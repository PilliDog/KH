package com.oop.book.run;

import com.oop.book.controller.BookManager;

public class Run {

	public static void main(String[] args) {
		new BookManager().menu();
		//menu메소드가 종료되면 아래코드가 실행됨
		System.out.println("프로그램 종료~~~~");

	}

}
