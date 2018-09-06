package kh.java.condition;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Test6 start = new Test6();
		start.test();

	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		String userInput = new String();
		
		System.out.print("과일 이름을 입력해주세요. : ");
		userInput = sc.nextLine();
		
		if(userInput.equals("사과"))
		{
			System.out.println("사과는 1000원!!");
		}
		else if(userInput.equals("바나나"))
		{
			System.out.println("바나나는 3000원!!");
		}
		else if(userInput.equals("복숭아"))
		{
			System.out.println("복숭아는 2000원!!");
		}
		else if(userInput.equals("키위"))
		{
			System.out.println("키위는 5000원!!");
		}
		else
		{
			System.out.println("그런 과일은 여기 없어..");
		}
				
	}

}
