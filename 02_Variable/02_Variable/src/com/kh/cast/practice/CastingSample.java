package com.kh.cast.practice;

import java.util.Scanner;

public class CastingSample {

	public static void main(String[] args) {
		
		CastingSample start = new CastingSample();
		
		start.printUniCode();
		start.calculatorScore();

	}
	
	public void printUniCode() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 하나를 입력해주세요.");
		char ch = sc.next().charAt(0);
		
		int c = ch;
		
		System.out.println("A is unicode : " + c);
		System.out.println(ch+" is unicode "+(int)ch);//54620
		//System.out.println('\ud55c');//한
	}
	
	public void calculatorScore(){
		
		double hangle;
		double english;
		double math;
		double totalPoint;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력해주세요.");
		hangle = sc.nextInt();
		
		System.out.println("영어점수를 입력해주세요.");
		english = sc.nextInt();
		
		System.out.println("수학점수를 입력해주세요.");
		math = sc.nextInt();
		
		totalPoint = (hangle + math + english); 
		System.out.println("총점 : " + totalPoint);
		System.out.println("평균 : " + totalPoint/3);
		
	}
	
	public void printBitCount() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 => ");
		int num = sc.nextInt();
		//System.out.println(Integer.toBinaryString(num));
		
		int cnt = Integer.bitCount(num);
		System.out.println(num+"의 2진수에 포함된 1의 갯수 : "+cnt+"개");
		
	}
}