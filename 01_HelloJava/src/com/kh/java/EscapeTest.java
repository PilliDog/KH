package com.kh.java;

public class EscapeTest {

	public static void main(String[] args) {
		EscapeTest et = new EscapeTest();
		et.test();
		
		//@퀴즈@ :다음 문장을 출력해보세요.
		//하나의 print문을 사용해서 출력하세요.
		et.test1();
		
		//@퀴즈@ : 탐색기에서 얻은 현재파일의 경로를 출력하세요.
		et.test2();
		

	}
	
	public void test() {
		//출력후 개행하는 메소드
		System.out.println("ㅎㅇ");
		//출력후 개행하지 않는 메소드 
		System.out.print("반가웡\n");
		System.out.print("반가웡\n");
		System.out.print("반가웡\n");
		System.out.print("반가웡\n");
		System.out.print("반가웡\n\n\n\n\n\n");
		
		/*
		 escape 문자
		 인쇄할 수 없거나 키보드로 표현할 수 없는 특별한 문자표현시 사용함
		 \의 다음문자하나를 결합해서 사용함
		 
		 *다음의 효과
		 \n : 엔터
		 \t : Tab
		 \r : 캐리지리턴 커서의 위치를 현재줄의 처음으로 옮김
		 \\ : \출력
		 \" : "출력
		 \' : '출력
		 
		 */
		
	}
	
	public void test1() {
		System.out.println("■ 퀴즈 1!!!!! ■\n");
		System.out.print("아침잠이 많은 사람을 위한 어플리케이션 \"Shakelt 알람\"\n===========================================\n\t흔들기  쏴리질러\t터치하기\t원터치    \n============================================\n아침부터 쌩쑈를 해야 알람을 끌 수 있음.\n\n\n\n");
		
	}
	
	public void test2() {
		
		System.out.println("■ 퀴즈 2!!!!! ■\n");
		System.out.print("C:\\Workspaces\\java_workspace\n\\01_HelloJava\\sro\\com\\kh\\java\\EscapeTest");
		
	}

}
