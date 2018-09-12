package com.api.string;

import java.util.Scanner;

public class StringTest {
	static Scanner sc = new Scanner(System.in);
	static String userString;
	static char userChar;
	static int userChar_Cnt = 0;

	public static void main(String[] args) {
		
		StringProcess engine = new StringProcess();
		
		System.out.print("문자열을 입력하세요 : ");
		userString = sc.nextLine();
		System.out.print("찾으실 문자를 입력하세요 : ");
		userChar = sc.nextLine().charAt(0);
		
		userString = new StringProcess().preChar(userString);
		userChar_Cnt = new StringProcess().charSu(userString, userChar);
		
		System.out.println("검색할 문자열 : " + userString);
		System.out.println("문자 갯수 : " + userChar_Cnt);
		
		
	}
}
