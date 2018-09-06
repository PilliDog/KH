package kh.java.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 start = new Test1();
		//start.test1();
		//start.test2();
		start.test3();

	}
	
	public void test1() {
		
		double hangle, english, math;
		double sum, avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		//점수 입력받음
		System.out.print("국어 점수를 입력하세요. : ");
		hangle = sc.nextDouble();
		
		System.out.print("영어 점수를 입력하세요. : ");
		english = sc.nextDouble();
		
		System.out.print("수학 점수를 입력하세요. : ");
		math = sc.nextDouble();
		
		//합계, 평균 계산
		sum = (hangle + english + math);
		avg = (sum / 3);
		
		
		//판단
		if(sum >= 250)
		{
			System.out.println("당신의 총점은 " + sum + "이고 평균은 " + avg + "입니다.");
			System.out.println("축하합니다. 우수생입니다.");
		}
		
		
	}
	
	
	public void test2() {
		
		int a, b, c = 0;
		Scanner sc = new Scanner(System.in);
		
		//연봉입력받음
		System.out.print("A의 연봉을 입력해주세요.(만원 단위) : ");
		a = sc.nextInt();
		
		System.out.print("B의 연봉을 입력해주세요.(만원 단위) : ");
		b = sc.nextInt();
		
		System.out.print("C의 연봉을 입력해주세요.(만원 단위) : ");
		c = sc.nextInt();
		
		//판단
		if(a >= 5000)
		{
			System.out.println("A는 고액 연봉자입니다.");
		}
		
		if(b >= 5000)
		{
			System.out.println("B는 고액 연봉자입니다.");
		}
		
		if(c >= 5000)
		{
			System.out.println("C는 고액 연봉자입니다.");
		}
		
		
	}
	
	
	public void test3() {
		
		int userNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력해주세요.");
		userNum = sc.nextInt();
		
		if((userNum % 2) == 0 )
		{
			System.out.println("이것은 짝수입니다.");
		}
		else
		{
			System.out.println("이것은 홀수입니다.");
		}
		
	}

}
