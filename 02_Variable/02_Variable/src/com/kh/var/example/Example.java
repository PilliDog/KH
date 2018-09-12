package com.kh.var.example;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Example {

	public static void main(String[] args) {
		
		Example start = new Example();
		
		//start.example1();
		//start.example2();
		//start.example3();

	}
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("★★첫번째 문제★★");
		System.out.println("정수 두 개를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("더하기 : " + (num1 + num2) );
		System.out.println("빼기 : " + (num1 - num2) );
		System.out.println("곱하기 : " + (num1 * num2) );
		System.out.println("나누기 : " + (num1 / num2) );
		System.out.println("나머지 : " + (num1 % num2) );
		
		
	}
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로의 길이 입력해주세요");
		double garo = sc.nextDouble();
		
		System.out.println("세로의 길이 입력해주세요");
		double sero = sc.nextDouble();
		
		System.out.println("면적 : " + (garo*sero) + "  " + "둘레 : " + ((garo + sero) * 2));
		
		
		
		
	}
	
	public void example3() {
		
		Scanner sc = new Scanner(System.in);
		
		String text;
		
		System.out.println("영어 문자열을 입력해주세요.");
		text = sc.nextLine();
		
		char c0 = (text).charAt(0);
		char c1 = (text).charAt(1);
		char c2 = (text).charAt(2);
		
		System.out.println("첫번째 문자 : " + c0);
		System.out.println("두번째 문자 : " + c1);
		System.out.println("세번째 문자 : " + c2);
		
		
	}

}
