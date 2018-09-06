package com.kh.test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해");
		int age = sc.nextInt();
		
		System.out.println("주소를 입력해");
		sc.nextLine();
		String adress = sc.nextLine();
		
		System.out.println("키를 입력해");
		double cm = sc.nextDouble();
		int cmResult = (int) cm;
		System.out.println("몸무게를 입력해");
		double kg = sc.nextDouble();
		int kgResult = (int) kg;
		System.out.println("성별을 입력해");
		char sex = sc.next().charAt(0);
		
		System.out.println("\n\n당신이 입력한 정보는 다음과 같습니다.");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + adress);
		System.out.printf("키 : %d", cmResult);
		System.out.printf("\n몸무게 : %d", kgResult);
		System.out.println("\n성별 : " + sex);
		
		
	}

}
