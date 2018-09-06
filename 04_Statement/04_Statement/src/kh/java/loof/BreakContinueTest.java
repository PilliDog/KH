/*
	## break
	반복문을 빠져나가는 구문이야
	break 구문을 만나면 즉시 반복문을 탈출!!!
	
	## continue
	반복문 실행 시 contnue 이하 구문은 실행하지 않고, 반복문을 다시 실행
	
	단 반복문에 따라 다시 실행하는 위치가 달라
	while문 : 조건식으로 이동하고
	for문 : 증감식으로 이동해
 */


package kh.java.loof;

import java.util.Scanner;

public class BreakContinueTest {

	public static void main(String[] args) {
		
		BreakContinueTest start = new BreakContinueTest();
		//start.breakTest();
		//start.continueTest();
		
		//퀴즈!!! 1부터 사용자가 입력한 수까지의 홀수의 합을 구하라.
		//start.test1();
		//start.test2();
		
		//퀴즈!! 아스키코드 중에서 숫자와 영문자만 출력하기
		start.test3();
	}
	
	
	public void breakTest() {
		
		//## for문에서..
//		for(int i = 1; i < 10; i++)
//		{
//			if(i == 7) break; // 인접한 블럭을 빠져나간다.
//			System.out.println(i);
//		}
		
		//추가 팁! for문으로 무한을 하고싶다!
		//for(int i = 0; true; i++){
		//}	
		
		//퀴즈!! 1부터 사용자 입력값까지의 합을 구하세요.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int inputNum = 0;
		
		System.out.print("숫자 하나를 입력해 : ");
		inputNum = sc.nextInt();
		
		//## while 문에서..
		while(true)
		{
			sum += inputNum;
			inputNum --;
			if(inputNum == 0) break;
		}
		
		System.out.println(sum);
		
	}
	
	
	
	public void continueTest() {
		
		//퀴즈!!! 1부터 100까지 짝수만 출력하기!!
		
		for(int i = 2; i <= 100; i++)
		{
			if(i%2 != 0)
			{
				continue; // 그럼 증감식으로 이동해~
			}
			System.out.println(i);
		}
		
	}
	
	
	//퀴즈!!! 1부터 사용자가 입력한 수까지의 홀수의 합을 구하라.
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		int userNum = 0;
		int sum = 0;
		int test = 0;
		
		System.out.print("정수를 하나 입력해주세요. : ");
		userNum = sc.nextInt();
		
		for(int i = 1; true; i++)
		{
			System.out.println("i의 값은 " + test);
			if(userNum < i)
			{
				System.out.println("i의 값은 " + test);
				break;
			}
			else
			{
				if(i%2 == 0)
				{
					continue;
				}
					sum += i;
					test = i;
			}
		}
		
		System.out.println("i의 값은 " + test);
		System.out.println("1부터 입력한 수까지의 홀수 합은 " + sum + "입니다.");
		
	}
	
	
	
	//퀴즈!!! 1부터 시작하여 제곱의 값이 1000보다 작은 값에서 멈춰봐
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		int resultNum = 0;
		int maxNum = 1000;
		
		//for문
//		for(int i = 1; true; i++)
//		{
//			if((i * i) > maxNum)
//			{
//				break;
//			}
//			
//			if(i%2 == 0) continue;
//				
//			resultNum = i * i;
//			System.out.println("i의 값은 : " + i + " / " + i + " * " + i + " = " + resultNum);
//		}
		
		//while문
		int i = 0;
		while(true)
		{
			
			if((i * i) > maxNum)
			{
				break;
			}
			
			
			if(i%2 == 0) {
				i++;
				continue;
			}

			resultNum = i * i;
			System.out.println("i의 값은 : " + i + " / " + i + " * " + i + " = " + resultNum);
			
			i++;
			
		}
		
	}
	
	
	
	public void test3() {
		
		
		
		
//		for(int i = 0; true; i++) 
//		{
//			if(i == 255) break;
//	
//			code = (char)i;
//			if(code >= 65 && code <= 90) //대문자
//			{
//				System.out.println(code);
//			}
//			else if(code >= 48 && code <= 57) //숫자
//			{
//				System.out.println(code);
//			}
//			else if(code >= 97 && code <= 122) //소문자
//			{
//				System.out.println(code);
//			}
//			else
//			{
//				continue;
//			}
//		}
		
		char code = 0;
		int i = 0;
		
		while(true)
		{
			i++;
			
			if(i == 255) break;
			
			code = (char)i;
			if(code >= 'A' && code <= 'Z') //대문자
			{
				System.out.println(code);
			}
			else if(code >= '0' && code <= '9') //숫자
			{
				System.out.println(code);
			}
			else if(code >= 'a' && code <= 'z') //소문자
			{
				System.out.println(code);
			}
			else
			{
				continue;
			}
		}
		
			
		
		
		
	}

}
