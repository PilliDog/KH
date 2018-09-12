package kh.java.condition;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Test4 start = new Test4();
		start.test();

	}
	
	
	public void test() {
		
		int userNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 10까지의 정수 중 하나를 입력해주세요. : ");
		userNum = sc.nextInt();
		
		if(userNum >= 1 && userNum <= 10)
		{
			userNum %= 2;
			if(userNum == 0)
			{
				System.out.println("이것은 짝수입니다.");
			}
			else
			{
				System.out.println("이것은 홀수입니다.");
			}
		}
		else
		{
			System.out.println("반드시 1~10 사이의 정수를 입력하셔야 합니다.");
		}
		
		
	}

}
