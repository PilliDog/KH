package com.oop.book.controller;

import java.util.Scanner;

import com.oop.book.model.Book;

public class BookManager {
	private Book[] bar = null;
	Scanner sc = new Scanner(System.in);
	private int count; //현재 입력된 객체수
	
	{
		bar = new Book[10];
	}
	
	public void menu() {
		String menu = "***** 도서 관리 메뉴 *****\n"
					+ "1. 도서 정보 추가\n"
					+ "2. 모두 출력\n"
					+ "7. 끝내기\n"
					+ ">> ";
		do {
			System.out.println(menu);
			int selected = sc.nextInt();
			switch(selected)
			{
				case 1: bookInput();
					break;
				case 2: bookAllOutput();
					break;
				case 7: return;
			}
		}while(true);
	}
	
	public void bookInput() {
		String title, publisher, author;
		int price;
		double discountRate;
//		System.out.println("bookInput() called!");
		System.out.print("책 제목 : ");
		title = sc.next();
		System.out.print("저자 : ");
		author = sc.next();
		System.out.print("출판사 : ");
		publisher = sc.next();
		System.out.print("책 가격 : ");
		price = sc.nextInt();
		System.out.print("할인율 : ");
		discountRate = sc.nextDouble();
		
		bar[count++] = new Book(title, publisher, author, price, discountRate); //heap에 있는 참조 주소값이 리턴됨
	}
	
	public void bookAllOutput() {
//		System.out.println("bookAllOutput() called!");
		for(int i=0; i<count; i++)
		{
			System.out.println(bar[i].information());
		}
	}
}
