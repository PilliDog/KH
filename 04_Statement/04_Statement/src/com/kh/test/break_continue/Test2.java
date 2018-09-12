package com.kh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		new Test2().test();

	}
	
	
	public void test() {
		
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		int RanNum = 0;
		int userNum = 0;
		int cnt = 0;
		
		RanNum = generator.nextInt(100) + 1;
		
		
		
		
		while(true)
		{	
			cnt ++;
			
			System.out.print("정수를 하나 입력해주세요. : \n");
			userNum = sc.nextInt();
			
			if(RanNum > userNum)
			{
				System.out.println("입력하신 정수보다 큽니다.\n");
			}
			else if(RanNum < userNum)
			{
				System.out.println("입력하신 정수보다 작습니다.\n");
			}
			else
			{
				System.out.println(cnt + " 회 만에 정답을 맞추셨습니다!!");
				break;
			}
		}
	}

}
