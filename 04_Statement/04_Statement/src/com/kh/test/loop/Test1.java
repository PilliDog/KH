package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		new Test1().test();

	}
	
	public void test() {
		
		int userNum, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력해주세요. : ");
		userNum = sc.nextInt();
		
		for(int i = 1; i <= userNum; i++)
		{
			if(i % 2 == 0)
			{
				sum += i;
			}
		}
		
		System.out.println("1부터 입력하신 숫자까지 존재하는 짝수의 합은 " + sum + "입니다.");
		
	}

}
