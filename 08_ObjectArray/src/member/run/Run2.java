package member.run;

import java.util.Scanner;

import member.controller.MemberManager2;

public class Run2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MemberManager2 start = new MemberManager2();
		Run2 engine = new Run2();
		start.insertSilver();
		start.output_silver();
		
//		while(true)]
//		{
//			switch(engine.menu())
//			{
//				case 1 : start.insertUser();
//				break;
//				case 2 : start.output();
//				break;
//				case 0 : System.exit(0);
//				default : System.out.println("번호를 다시 입력해주세요.");
//			}
//		}
	}
	

	public int menu() {
		System.out.println("======== 포인트 관리 시스템 ========");
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 목록 조회");
		System.out.println("0. 종료");
		System.out.print(">> ");
		
		return sc.nextInt();
	}

}
