package test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		int userNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 5까지의 숫자 중 하나를 입력하세요 : ");
		userNum = sc.nextInt();
		
		switch(userNum)
		{
			case 1 : System.out.print("** 입력이 정상적으로 되었습니다! **");
			break;
			
			case 2 : System.out.print("** 조회가 시작되었습니다! **");
			break;
			
			case 3 : System.out.print("** 수정이 정상적으로 되었습니다! **");
			break;
			
			case 4 : System.out.print("** 삭제가 정상적으로 되었습니다! **");
			break;
			
			case 5 : System.out.print("** 정상적으로 종료 되었습니다! **");
			break;
			
			default : System.out.print("** 다시 입력해 주세요! **"); //1부터 5까지가 아닐 경우
			break;
		}

	}

}
