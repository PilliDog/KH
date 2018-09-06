package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//사용자의 정수 입력값을 받기위한 변수
		int userNum;
		
		//사용자가 제대로 입력할 때 까지 반복시킴
		while(true)
		{
		System.out.print("1부터 100 사이의 정수형 값을 입력해주세요 : ");
		userNum = sc.nextInt();
		sc.nextLine();
		
			if(userNum >= 1 && userNum <= 100) //만약 사용자가 입력한 값이 1과 100 사이라면 ~
			{
				if(userNum%2 == 0) //2로 나눈 나머지가 0일 경우 ~ (2의 배수일 경우)
				{
					System.out.println("2의 배수입니다.");
				}
				else //그게 아니라면 ~
				{
					System.out.println("2의 배수가 아닙니다.");
				}
				System.exit(0); // 프로그램을 종료
			}
			else // 사용자가 입력한 값이 1과 100 사이가 아니라면 ~
			{
				System.out.print("숫자를 다시 입력해주세요.\n\n");
			}
		}
	}
}
