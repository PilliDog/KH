package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//두 정수를 받기위한 변수를 생성
		int userNum1, userNum2;
		
		
		System.out.print("1부터 9까지의 정수 중 하나를 입력해주세요(1) :");
		userNum1 = sc.nextInt();
		sc.nextLine(); //이걸 안해서 오류가 있을 때 없을 때가 있는데 아직 개념이 확실하게 잡히지 않았다. 공부해야함 >> Line은 개행까지, next는 띄어쓰기
		System.out.print("1부터 9까지의 정수 중 하나를 입력해주세요(2) :");
		userNum2 = sc.nextInt();
		sc.nextLine();
		
		//1부터 9까지의 입력값을 받기위한 if문, 코드의 양을 늘리기 싫어 두 개를 한번에 받고 판단하도록 함
		if((userNum1 >= 1 && userNum1 <= 9) && (userNum2 >= 1 && userNum2 <= 9)) //입력받은 두 정수가 1부터 9까지 라면 ~
		{
			if((userNum1*userNum2) >= 10) //두자리 수는 10이상이다.
			{
				System.out.print("\n두자리 수 입니다.");
			}
			else
			{
				System.out.print("\n한자리 수 입니다.");
			}
		}
		else //입력받은 두 정수가 1부터 9까지가 아니라면 ~
		{
			System.out.println("숫자를 잘못 입력하셨습니다. 재실행하여 다시 입력해주세요.");
		}

	}

}
