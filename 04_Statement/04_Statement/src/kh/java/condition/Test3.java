package kh.java.condition;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Test3 start = new Test3();
		start.test();

	}
	
	
	public void test() {
		
		int userNum1, userNum2 = 0;
		char cal = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력해주세요. : ");
		userNum1 = sc.nextInt();
		System.out.print("정수를 또 하나 입력해주세요. : ");
		userNum2 = sc.nextInt();
		System.out.print("계산하실 연산자를 입력해주세요. : ");
		cal = sc.next().charAt(0);
		
		if(userNum1 < 0 || userNum2 < 0)
		{
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}

		
		System.out.println("입력하신 두 정수는 다음과 같습니다.");
		System.out.println(userNum1 + " / " + userNum2);
				
		switch(cal)
		{
			case '+' : System.out.println("두 정수의 합은 " + (userNum1 + userNum2) + "입니다." );
					   System.out.println(userNum1 + " " + cal + " " + userNum2 + " = " + (userNum1 + userNum2));
			break;
			
			case '-' : System.out.println("두 정수의 차는 " + (userNum1 - userNum2) + "입니다." );
					   System.out.println(userNum1 + " " + cal + " " + userNum2 + " = " + (userNum1 - userNum2));
			break;
			
			case '*' : System.out.println("두 정수의 곱은 " + (userNum1 * userNum2) + "입니다." );
					   System.out.println(userNum1 + " " + cal + " " + userNum2 + " = " + (userNum1 * userNum2));
			break;
			
			case '/' : System.out.println("두 정수의 나눔은 " + (userNum1 / userNum2) + "입니다." );
				       System.out.println(userNum1 + " " + cal + " " + userNum2 + " = " + (userNum1 / userNum2));
			break;
			
			default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		
		
	}




}
