package com.kh.test.condition.function;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Salary start = new Salary();
		start.calc();

	}
	
	
	public void calc() {
		
		Scanner sc = new Scanner(System.in);
		int money,sellMoney,bonus = 0;
		
		System.out.print("월급을 입력하세요. : ");
		money = sc.nextInt();
		
		System.out.println("매출액을 입력하세요.(만원 단위) : ");
		sellMoney = sc.nextInt();
		
		if(sellMoney >= 5000)
		{
			bonus += (sellMoney * 0.05);
		}
		//else if(sellMoney >= 3000)
		
	}

}
