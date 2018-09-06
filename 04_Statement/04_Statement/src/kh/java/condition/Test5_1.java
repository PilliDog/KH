package kh.java.condition;

import java.util.Scanner;

public class Test5_1 {

	public static void main(String[] args) {
	
		Test5_1 start = new Test5_1();
		start.test();

	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		double cm, kg = 0;
		double st_kg = 0;
		
		
		System.out.print("키를 입력해주세요. : ");
		cm = sc.nextDouble();
		
		System.out.println("몸무게를 입력해주세요 : ");
		kg = sc.nextDouble();
		
		st_kg = (cm - 100) * 0.9;
		
		if((st_kg + 1) >= kg && (st_kg - 1) <= kg)
		{
			System.out.println("정상입니다.");
		}
		else if((st_kg + 1) < kg)
		{
			System.out.println("과체중입니다.");
		}
		else
		{
			System.out.println("저체중입니다.");
		}
		
		
	}

}
