package kh.java.condition;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
	
		Test8 start = new Test8();
		start.test();

	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		int scUserNum = 0;
		
		
		System.out.println("******* 메  뉴********");
		System.out.println("1. 떡볶이 -------- 1000");
		System.out.println("2. 김밥 -------- 2000");
		System.out.println("3. 오뎅 -------- 1000");
		System.out.println("4. 순대 -------- 2000");
		System.out.println("5. 튀김 -------- 3000");
		System.out.println("6. 떡튀순 -------- 8000");
		System.out.println("**********************");
		System.out.print("메뉴번호 입력 : ");
		
		scUserNum = sc.nextInt();
		
		
		switch(scUserNum)
		{
			case 1 : System.out.println("떡볶이는 1000원 입니다.");
			break;
			
			case 2 : System.out.println("김밥은 2000원 입니다.");
			break;
			
			case 3 : System.out.println("오뎅은 1000원 입니다.");
			break;
			
			case 4 : System.out.println("순대는 2000원 입니다.");
			break;
			
			case 5 : System.out.println("튀김은 3000원 입니다.");
			break;
			
			case 6 : System.out.println("떡튀순은 8000원 입니다.");
			break;
			
			default : System.out.println("번호가 잘못 입력되었습니다. 영업을 종료합니다.");
			return;
		}
		
	}

}
