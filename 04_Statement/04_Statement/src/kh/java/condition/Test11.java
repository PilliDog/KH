package kh.java.condition;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Test11 start = new Test11();
		start.test();

	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		int age, exp = 0;
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		
		if(age >= 70)
		{
			age = 70;
		}
		else if(age >= 60)
		{
			age = 60;
		}
		else if(age >= 50)
		{
			age = 50;
		}
		else if(age >= 40)
		{
			age = 40;
		}
		else if(age >= 30)
		{
			age = 30;
		}
		else if(age >= 20)
		{
			age = 20;
		}
		else if(age >= 10)
		{
			age = 10;
		}
		
		
		switch(age)
		{
			case 70 : exp += 15;
			case 60 : exp += 20;
			case 50 : exp += 30;
			case 40 : exp += 15;
			case 30 : exp += 20;
			case 20 : exp += 25;
			case 10 : exp += 15;
			break;
		}
		
		System.out.println("당신의 인생 경험치는 " + exp + " 입니다.");
		
	}
	

}
