package kh.java.condition;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Test2 test = new Test2();
		test.test();

	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		int hangle, english, math = 0;
		int sum = 0;
		double avg = 0;
		
		//입력받음
		System.out.print("국어 점수를 입력해주세요. :");
		hangle = sc.nextInt();
		
		System.out.print("영어 점수를 입력해주세요. :");
		english = sc.nextInt();
		
		System.out.print("수학 점수를 입력해주세요. :");
		math = sc.nextInt();
		
		
		//계산
		sum = (hangle + english + math);
		avg = (sum / 3);
		
		
		//출력
		if(hangle >= 40 && english >= 40 && math >= 40)
		{
			if(avg >= 60)
			{
				System.out.println("합격입니다!");
			}
			else
			{
				System.out.println("불합격입니다.");
			}
		}
		else
		{
			System.out.println("불합격입니다.");
		}
			
		
		
		
		
		
		
	}

}
