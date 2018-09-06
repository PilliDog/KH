package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//new Test1().test1();
		new Test1().test2();

	}
	
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		int resultNum = 0;
		int maxNum = 0;
		
		System.out.print("정수를 하나 입력해주세요. : ");
		maxNum = sc.nextInt();
		
		int i = 0;
		while(true)
		{
			
			if(maxNum < i)
			{
				break;
			}
			
			
			if(i%2 == 0) {
				i++;
				continue;
			}

			resultNum = i * i;
			System.out.println("i의 값은 : " + i + " / " + i + " * " + i + " = " + resultNum);
			
			i++;
			
		}
		
	}
	
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		int userNum_1, userNum_2;
		int max, min, sum = 0;
		
		System.out.print("정수를 입력하세요.(1) : ");
		userNum_1 = sc.nextInt();
		System.out.print("정수를 입력하세요.(2) : ");
		userNum_2 = sc.nextInt();
		
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
		
		int i = (min - 1);
		while(true)
		{
			if(i >= max)
			{
				break;
			}
			else
			{
				i ++;
				if(i%2 == 0) continue;
				sum += i;
				System.out.println(sum);
			}
			
			
		}
		
		System.out.println(min + "부터 " + max + "까지 홀수의 합은 " + sum + "입니다.");
	}

}
