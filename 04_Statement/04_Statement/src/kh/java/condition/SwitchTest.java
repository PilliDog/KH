/*
	switch문은 특정값에 따른 조건문이다. '값'임, 조건문 아님.
	
	switch(변수 또는 계산식)
	{
		case 값1 : 실행문;
		break;
		
		case 값2 : 실행문;
		break;
		
		...
		
		default : 실행문; //else같은 거임
	}
	
	switch문 괄호 안의 변수, 수식은 어떤 범위로 표현되어서는 안된다.
	변수의 타입은 byte, short, char, int, String(1.7 이상에서만 허용)으로 제한한다. (float, double, long 비허용)
 */


package kh.java.condition;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		SwitchTest st = new SwitchTest();
		//st.test1();

		//퀴즈!! : 성씨별 인구순위를 출력하기 >> 너의 성씨의 순위는 몇위야, 없으면 순위에 없어
		//st.famillyNameTest();
		
		st.fallThroughTest();
		
	}
	
	
	public void test1() {
		
		int userSc;
		
		Scanner sc = new Scanner(System.in);
		String color = new String();
		
		System.out.print("원하는 과일번호를 선택해주세요. (1.사과/2.바나나/3.오렌지) : ");
		userSc = sc.nextInt();
		
		switch(userSc)
		{
			case  1 : color = "빨간색";
			break;
			
			case  2 : color = "노란색";
			break;
			
			case  3 : color = "주황색";
			break;
			
			default : System.out.println("똑바로 입력해");
			return;
		}
		
		System.out.println("선택한 과일의 색상은 " + color + "입니다.");
		
	}
	
	
	public void famillyNameTest() {
		
		char name;
		int rank;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("▶ 너의 성을 입력해 : ");
		name = sc.next().charAt(0);
		
		switch(name)
		{
			case '김' : rank = 1;
			break;
			
			case '이' : rank = 2;
			break;
			
			case '박' : rank = 3;
			break;

			case '최' : rank = 4;
			break;
			
			case '정' : rank = 5;
			break;
			
			case '강' : rank = 6;
			break;
			
			case '조' : rank = 7;
			break;

			case '윤' : rank = 8;
			break;
			
			case '장' : rank = 9;
			break;
			
			case '림' : rank = 10;
			break;
			
			default : System.out.println("순위에 없어..");
			return;
		}
		
		System.out.println("너의 순위는 " + rank + "위야.");
		
	}
	
	
	public void fallThroughTest() {
		
		int grade;
		String present = "";
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("당신의 회원등급 번호를 선택하세요. (1.골드/2.실버/3.브론즈) : ");
		grade = sc.nextInt();
		
		
		switch(grade)
		{
		case 1 : present += "스마트TV, ";
		case 2 : present += "선풍기, ";
		case 3 : present += "커피쿠폰 ";
		break;
		
		default : System.out.println("없는 번호입니다.");
		return;
		
		/*
			case 1 : present = "커피쿠폰, 선풍기, 스마트TV";
			break;
			
			case 2 : present = "커피쿠폰, 선풍기";
			break;
			
			case 3 : present = "커피쿠폰";
			break;
			
			default : System.out.println("없는 번호입니다.");
			return;
		*/
		}
		
		System.out.println("당신이 받게 될 상품은 " + present + "입니다.");
		
	}

}
