package com.kh.function.run;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Example start = new Example();
		//start.onSample1();
		//start.onSample2();
		start.onSample3();
		//start.onSample4();
	}
	
	public void onSample1() {
		
		int hangle, english, math, sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요.");
		hangle = sc.nextInt();
		
		System.out.println("영어 점수를 입력해주세요.");
		english = sc.nextInt();
		
		System.out.println("수학 점수를 입력해주세요.");
		math = sc.nextInt();
		
		sum = hangle + english + math;
		avg = (sum/3);
		
		//if문 미사용
		System.out.println(hangle >= 40 && english >= 40 && math >= 40 && avg > 60 ? "합격" : "불합격" );
		
		
		/* if문을 사용함
		if(hangle >= 40 && english >= 40 && math >= 40 && avg > 60) {
			
			System.out.println("합격");
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
		
		}else {
			System.out.println("불합격");
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
		}
		*/
		
	}
	
	public void onSample2() {
		
		String name = new String();
		int grade;
		int calssNumber;
		int number;
		int male;
		double result;
		
		String mf = new String();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();
		
		System.out.println("학년을 입력하세요.");
		grade = sc.nextInt();
		
		System.out.println("반을 입력하세요.");
		calssNumber = sc.nextInt();
		
		System.out.println("번호를 입력하세요.");
		number = sc.nextInt();
		
		System.out.println("성별을 입력하세요.M/F");
		male = sc.next().charAt(0);
		
		//if문 미사용
		mf = (male == 'M' || male == 'm' ? "남학생":"여학생");
		/* if문 사용
		if(male == 'M' || male == 'm') {
			mf = "남학생" ;
		}else {
			mf = "여학생" ;
		}
		*/
		
		System.out.println("성적을 입력하세요.\n\n");
		result = sc.nextDouble();
		
		System.out.println(grade + "학년 " + calssNumber + "반 " + number + "번 " + mf + " " + name + "은 성적이 " + result + "입니다.");
		
		
	}
	
	public void onSample3() {
		
		int scNumber;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나를 입력하세요.");
		scNumber = sc.nextInt();
		
		//if문 미사용
		System.out.println((scNumber > 0 ? "양수야" : (scNumber == 0 ? "이건 0이야" : "음수야")));
		
		/* if문 사용
		if(scNumber > 0) {
			
			System.out.println("이것은 양수야");
			
		}else if(scNumber == 0) {
			
			System.out.println("이것은 0이야");
			
		}else {
			
			System.out.println("이것은 음수야");
			
		}
		*/
	}
	
	
	public void onSample4() {
		
		int scNumber2;
		String result = new String();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		scNumber2 = sc.nextInt();
		
		result = (scNumber2 % 2 == 0 ? "이것은 짝수야" : "이것은 홀수야");
		
		/*
		if(scNumber2 % 2 == 0) {
			result = "이것은 짝수야";
		}else {
			result = "이것은 홀수야";
		}
		*/
		
		System.out.println(result);
		
		}
		
		
	

}
