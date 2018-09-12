package kh.java.condition;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		Test9 start = new Test9();
		start.test();

	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		char mainMenu = ' ';
		int sideMenu = 0;
		int sum = 0;
		String mainMenu_result = " ";
		String sideMenu_result = " ";
		
		System.out.println("******* 주 메뉴********");
		System.out.println("a. 불고기버거 -------- 5000");
		System.out.println("b. 새우버거 -------- 4000");
		System.out.println("c. 치킨버거 -------- 4500");
		System.out.println("d. 한우버거 ------- 10000");
		System.out.println("e. 디버거 -------- 7000");
		System.out.println("**********************");
		System.out.print("메뉴번호 입력 : ");
		mainMenu = sc.next().charAt(0);
		if(mainMenu == 'a' || mainMenu == 'b' || mainMenu == 'c' || mainMenu == 'd' || mainMenu == 'e')
		{
			
		}
		else
		{
			System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			return;
		}
		
		switch(mainMenu)
		{
			case 'a' :  mainMenu_result = "불고기 버거";
						sum += 5000;
			break;
			case 'b' :  mainMenu_result = "새우 버거";
						sum += 4000;
			break;
			case 'c' :  mainMenu_result = "치킨 버거";
						sum += 4500;
			break;
			case 'd' :  mainMenu_result = "한우 버거";
						sum += 10000;
			break;
			case 'e' :  mainMenu_result = "디 버거";
						sum += 7000;
			break;
		}
		
		System.out.println(sum);
		
		System.out.println("******사이드메뉴******");
		System.out.println("1. 콜라 -------- 1500");
		System.out.println("2. 사이다 -------- 1500");
		System.out.println("3. 밀크쉐이크 -------- 2500");
		System.out.println("4. 레드불 -------- 3000");
		System.out.println("**********************");
		System.out.print("메뉴번호 입력 : ");
		sideMenu = sc.nextInt();
		if(sideMenu < 1 || sideMenu > 4)
		{
			System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			return;
		}

		switch(sideMenu)
		{
			case 1 :  sideMenu_result = "콜라";
						sum += 1500;
			break;
			case 2 :  sideMenu_result = "사이다";
						sum += 1500;
			break;
			case 3 :  sideMenu_result = "밀크쉐이크";
						sum += 2500;
			break;
			case 4 :  sideMenu_result = "레드불";
						sum += 3000;
			break;
		}
		
		System.out.println(mainMenu_result + ", " + sideMenu_result + "는(은) 총 " + sum + "원입니다.");
		
		
	}

}
