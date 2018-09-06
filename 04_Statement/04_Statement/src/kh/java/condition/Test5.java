package kh.java.condition;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Test5 start = new Test5();
		start.test();

	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		double cm, kg = 0;
		double bmi = 0;
		
		System.out.print("키를 입력해주세요.(cm) : ");
		cm = sc.nextDouble();
		cm /= 100;
	
		System.out.println("몸무게를 입력해주세요 : ");
		kg = sc.nextDouble();
		
		
		bmi = (kg / (cm * cm));
		System.out.println("당신의 BMI 는 : " + bmi + " 입니다.");
		
		if(bmi >= 30)
		{
			System.out.println("고도비만 입니다.");
		}
		else if(bmi >= 25 && bmi < 30)
		{
			System.out.println("비만 입니다.");
		}
		else if(bmi >= 23 && bmi < 25)
		{
			System.out.println("과체중 입니다.");
		}
		else if(bmi >= 18.5 && bmi < 23)
		{
			System.out.println("정상 입니다.");
		}
		else
		{
			System.out.println("저체중 입니다.");
		}
		
	}

}
