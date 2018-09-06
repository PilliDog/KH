package kh.java.condition;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Test7 start = new Test7();
		start.test();

	}

	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		int scUserNum = 0;
		
		System.out.println("*******초기 메뉴********");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		System.out.println("**********************");
		System.out.print("메뉴번호 입력 : ");
		
		scUserNum = sc.nextInt();
		
		switch(scUserNum)
		{
			case 1 : System.out.println("입력메뉴 선택");
			break;
			
			case 2 : System.out.println("수정메뉴 선택");
			break;
			
			case 3 : System.out.println("조회메뉴 선택");
			break;
			
			case 4 : System.out.println("삭제메뉴 선택");
			break;
			
			case 0 : System.out.println("프로그램을 종료합니다.");
			break;
			
			default : System.out.println("번호를 잘못 누르셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
	}
}
