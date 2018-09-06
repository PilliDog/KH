package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		new Test3().test();

	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		int userNum = 0;
		
		System.out.print("구구단을 해볼 정수를 입력해주세요. : ");
		userNum = sc.nextInt();
		
		System.out.println("구구단을 외자 구구단을 외자");
		
		if(userNum >= 1 && userNum <= 9)
		{
			for(int i = 1; i <= 9; i++)
			{
				System.out.println(userNum + " * " + i + " = " + (userNum * i));
			}
		}
		else
		{
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}

}
