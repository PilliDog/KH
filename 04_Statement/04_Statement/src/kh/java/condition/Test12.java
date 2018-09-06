package kh.java.condition;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		

	}
	
	
	public void inputPoint() {
		
		int hangle, english, math = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		hangle = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		english = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		avg = ((hangle + english + math) /3);
		
		if(avg < 60)
		{
			System.out.println("평균점수 미달로 불합격 입니다.");
		}
		else
		{
			if(hangle < 40)
			{
				System.out.println("국어 점수 미달로 불합격입니다.");
			}
			else if(english < 40)
			{
				System.out.println("영어 점수 미달로 불합격입니다.");
			}
			else if(math < 40)
			{
				System.out.println("수학 점수 미달로 불합격입니다.");
			}
			else
			{
				System.out.println("합격이야!!!!!!!!!");
			}
				
		}
		
		
		
	}

}
