package kh.java.condition;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Test10 start = new Test10();
		start.test();
		
	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		int userNum = 0;
		
		System.out.print("점수를 입력하세요 : ");
		userNum = sc.nextInt();
		
		if(userNum <= 100 && userNum >= 90)
		{
			System.out.println(userNum + "점은 수입니다.");
		}
		else if(userNum <= 89 && userNum >= 80)
		{
			System.out.println(userNum + "점은 우입니다.");
		}
		else if(userNum <= 79 && userNum >= 70)
		{
			System.out.println(userNum + "점은 미입니다.");
		}
		else if(userNum <= 69 && userNum >= 60)
		{
			System.out.println(userNum + "점은 양입니다.");
		}
		else
		{
			System.out.println(userNum + "점은 가입니다.");
		}
		
	}
	
	

}
