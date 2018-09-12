package com.kh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		new Test4().test();
		
	}
	
	public void test() {
		
		Random generate = new Random();
		Scanner sc = new Scanner(System.in);
		//물고기를 만들었어
		int fish = generate.nextInt(100) + 1;
		int userNum_1, userNum_2 = 0;
		int max, min = 0;
		int gameCnt = 0;
		
		
		//이걸 잡을때까지 반복해
		while(true) {
			
			gameCnt ++;
				
			//그물의 범위값을 받았어
			System.out.println("======== " + gameCnt + "회 ========\n");
			System.out.print("그물의 범위를 설정해주세요.(하나) : ");
			userNum_1 = sc.nextInt();
			System.out.print("그물의 범위를 설정해주세요.(둘) : ");
			userNum_2 = sc.nextInt();
			
			//범위를 만들었어
			if(userNum_1 > userNum_2)
			{
				max = userNum_1;
				min = userNum_2;
			}	
			else
			{
				max = userNum_2;
				min = userNum_1;
			}
			
			//물고기가 안에 있니?
			if(min == (fish - 1) && max == (fish + 1))
			{
				System.out.println("물고기를 잡았어!!!!\n\n");
				break;
			}
			else if(fish >= min && fish <= max)
			{
				System.out.println("응 물고기가 안에 있어!!!\n\n");
			}
			else
			{
				System.out.println("물고기를 놓쳤어.....\n\n");
			}
		
		}
		
		System.out.println(gameCnt + "판 만에 성공!");
		
	}

}
