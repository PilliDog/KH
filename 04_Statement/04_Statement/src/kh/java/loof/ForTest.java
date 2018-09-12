/*
 ## For 문의 형식
 for(초기식; 조건식; 증감식){
 반복 실행 코드
 }
 
 ## 실행순서
 1. 초기식 (1번만 실행됨)
 2. 조건식 : 참이면 >> 거짓이면 반복문 종료
 3. 반복코드가 실행됨
 4. 증감식 >> 2.
 
 */

package kh.java.loof;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		
		ForTest start = new ForTest();
		
		//start.test();
		//start.test2();
		start.test3();
		//start.test4();
		
		//퀴즈!!! 짝수만 출력해보기 2부터 100까지
		//퀴즈!!! 내림차순으로 출력해보기
		//퀴즈!!! 사용자에게 이름과 출력할 횟수를 입력받아서 출력해보기
		
		

	}
	
	public void test() {
		
		for(int i = 0; i < 2147483647; i++)
		{
			System.out.println((i + 1) + "번째 안녕!");
		}
		
	}
	
	
	public void test2() {
	
		for(int i = 2; i <= 100; i+=2)
		{
			//System.out.println("i : " + i);
			
			if(i >= 100)
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(i + ", ");
			}
		}
		
	}
	
	public void test3() {
		
		for(int i = 100; i > 0; i-=2)
		{
			if(i <= 2)
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(i + ", ");
			}
		}
		
	}
	
	public void test4() {
		
		int cntsysout = 1;
		Scanner sc = new Scanner(System.in);
		String name = new String();
		int cnt = 0;
		
		System.out.print("너의 이름을 알려줘 : ");
		name = sc.next();
		
		System.out.print("몇 번 출력하고 싶니? : ");
		cnt = sc.nextInt();
		
		for(int i = cnt; i > 0; i--)
		{
			
			System.out.println((cntsysout) + "번째 " + name);
			cntsysout ++;
		}
		
	}

}
