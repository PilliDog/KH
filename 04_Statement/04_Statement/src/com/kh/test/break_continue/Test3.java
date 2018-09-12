package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		new Test3().test();
		

	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		int userNum = 0;
		
		//입력구간
		while(true)
		{
			System.out.print("2보다 큰 정수를 입력해주세요. : ");
			userNum = sc.nextInt();
			
			if(userNum < 2)
			{
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.\n");
			}
			else
			{
				break;
			}
		}
		
		//소수 판단구간
		for(int i = 2; i < userNum; i++)
		{
			if(userNum%i != 0)
			{
				//continue;
			}
			else
			{
				System.out.println(userNum + " 는 소수가 아님");
				return;
			}
		}
		
		System.out.println(userNum + " 는 소수임");
		
		
		
	}

}
