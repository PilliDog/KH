package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		new Test2().test();

	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		int userNum = 0;
		
		System.out.print("정수를 하나 입력하세요. : ");
		userNum = sc.nextInt();
		
		
		for(int i = 1; i <= userNum; i++)
		{
		
			if((i % 2) == 0 )
			{
				System.out.println("박");
			}
			else
			{
				System.out.println("수");
			}
		}
		
	}

}
