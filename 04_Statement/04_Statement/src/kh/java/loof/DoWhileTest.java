/*
 	## DoWhile
	반복문(조건식 -> 실행코드)의 순서를 뒤집어
	(실행코드 -> 조건식)의 순서로 처리됨
 */

package kh.java.loof;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		//new DoWhileTest().test();
		//new DoWhileTest().test2();
		new DoWhileTest().test3();
		
	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		char wannaContinue = 'y';
		
		while(wannaContinue != 'n')
		{
			System.out.println("게임 시작");
			System.out.println("얍!");
			System.out.println("게임이 끝났어요.");
			
			System.out.print("게임을 더 하시겠습니까?(y/n) : ");
			wannaContinue = sc.next().charAt(0);
		}
		
		System.out.println("이용해주셔서 감사합니다.");
		
	}
	
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		char wannaContinue;
		
		do {
			System.out.println("게임 시작");
			System.out.println("얍!");
			System.out.println("게임이 끝났어요.");
			
			System.out.print("게임을 더 하시겠습니까?(y/n) : ");
			wannaContinue = sc.next().charAt(0);
		}while(wannaContinue != 'n');
		
	}
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		int selected = 0;
		String menu = "-------------------\n"
					+ "1. 입금 \n"
					+ "2. 출금 \n"
					+ "3. 계좌이체 \n"
					+ "4. 직원연결 \n"
					+ "9. 종료 \n"
					+ "-------------------\n"
					+ "선택 : ";
		
		do {
			System.out.println(menu);
			selected = sc.nextInt();
			System.out.println(selected + "를 선택하셨습니다.");
		}while(selected != 9);
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
