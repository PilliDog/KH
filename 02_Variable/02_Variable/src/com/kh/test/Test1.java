/*
# 변수연습문제

1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.

 	- 정수형 100, 9999억, 
   	- 실수 486.520(float), 567.890123
   	- 문자 A
   	- 문자열 Hello world, 
   	- 논리 true
     
     단, 변수를 이용하여 출력하시오 .

 */

package com.kh.test;

public class Test1 {

	public static void main(String[] args) {
		
		int num1 = 100;
		long num2 = 999999999999L;
		char ch1 = 'A';
		String ch2 = new String("Hello world");
		String ch2_2 = ("Hello world");
		boolean bool = true;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch2_2 : " + ch2_2);
		System.out.println("bool : " + bool);
		

	}

}
