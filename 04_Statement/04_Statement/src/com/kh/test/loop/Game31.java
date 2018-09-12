package com.kh.test.loop;

import java.util.Random;
import java.util.Scanner;

public class Game31 {

	public static void main(String[] args) {
		
		new Game31().test();

	}
	
	public void test() {
		
		int result = 0, userNum = 0;
		boolean trun = true;
		
		Scanner sc = new Scanner(System.in);
		Random generate = new Random();
		
		System.out.println("귀엽고 깜찍하게 3~~~~1~~");
		
		
		if(trun == true) //유저 차례!
		{
		
			while(true)
			{
				System.out.print("몇 번을 외칠 것인가..(최대3번) : ");
				userNum = sc.nextInt();
				
				if(userNum > 3)
				{
					System.out.println("최대 3번까지 외칠 수 있습니다. 다시 입력하세요.");
					userNum = 0;
				}
				else
				{
					result += userNum;
					trun = false;
					break;
				}
			}
			
		}
		else //컴퓨터 차례
		{
			result += generate.nextInt(3) + 1;
			trun = true;
		}
		
		if(result >= 31 && trun == false)
		{
			System.out.println("졌어!!");
		}
		else
		{
			System.out.println("이겼어!!!");
		}
		
		
		
	}

}
