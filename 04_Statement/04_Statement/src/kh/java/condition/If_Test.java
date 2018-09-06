package kh.java.condition;

import java.util.Scanner;

public class If_Test {

	public static void main(String[] args) {
		
		If_Test it = new If_Test();
		//it.test1();
		//it.test2();
		//it.test3();
		//it.test4();
		//it.loginCheck();
		it.test5();
		
	}
	
	
	public void test1() {
		
		int a = 20;
		
		if(a > 0) {
			
			System.out.println("실행됨");
			
		}
		
		System.out.println("test()1 종료!");

		
	}
	
	
	//실습문제! 20살 이상만 실행할 수 있는 프로그램
	public void test2() {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("너 나이가 몇이니?");
		age = sc.nextInt();
		
		
		if(age > 19) 
		{
			System.out.println("좋아, 실행했어.");
		}
		
		else 
		{
			System.out.println("미성년자 아웃!");
		}

	}
	
	
	public void test3() {
		
		int a = 10;
		
		if(a > 100)
		{
			System.out.println("a는 100보다 커");
		}
		else if(a > 30)
		{
			System.out.println("a는 30보다 커");
		}
		else if(a > 0)
		{
			System.out.println("a는 0보다 커");
		}
		
		System.out.println("메소드 종료!");	
		
	}
	
	
	public void test4() {
		
		int result;
		String point = new String();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("너의 점수를 알려줘(정수로) : ");
		result = sc.nextInt();
		/*
		// else if를 사용
		if(result >= 90) 
		{
			if(result >= 95)
			{
				System.out.println("A");
			}
			else
			{
				System.out.println("A+");
			}
		}
		else if(result >= 80)
		{
			if(result >= 85)
			{
				System.out.println("B");
			}
			else
			{
				System.out.println("B+");
			}
		}
		else if(result >= 70)
		{
			if(result >= 75)
			{
				System.out.println("C");
			}
			else
			{
				System.out.println("C+");
			}
		}
		else if(result >= 60)
		{
			if(result >= 65)
			{
				System.out.println("D");
			}
			else
			{
				System.out.println("D+");
			}
		}
		else
		{
			System.out.println("F");
		}
		*/
		
		// String 사용
				if(result >= 90) 
				{
					if(result >= 95)
					{
						point = "A+";
					}
					else
					{
						point = "A";
					}
				}
				else if(result >= 80)
				{
					if(result >= 85)
					{
						point = "B+";
					}
					else
					{
						point = "B";
					}
				}
				else if(result >= 70)
				{
					if(result >= 75)
					{
						point = "C+";
					}
					else
					{
						point = "C";
					}
				}
				else if(result >= 60)
				{
					if(result >= 65)
					{
						point = "D+";
					}
					else
					{
						point = "D";
					}
				}
				else
				{
					point = "F";
				}
		
				System.out.println("당신의 학점은 " + point + "입니다.");
		
	}
	
	
	public void loginCheck() {
		
		String id = new String();
		String password = new String();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		password = sc.next();
		
		//임의의 회원정보라 가정함
		final String ID = "hellojava";
		final String PASSWORD = "1234";

		//1. 아이디가 회원정보와 일치하는지 확인
		if(ID.equals(id)) //문자열 비교는 equals를 이용함
		{
			if(PASSWORD.equals(password))
			{
				System.out.println("로그인에 성공하였습니다.");
			}
			else
			{
				System.out.println("비밀번호가 맞지 않습니다.");
			}
		}
		else
		{
			System.out.println("존재하지 않는 아이디 입니다.");
		}
		
	}
	
	//사용자의 입력값 확인
	public void test5() {
		
		char ch;
		
		String result = new String();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요.");
		ch = sc.next().charAt(0);
		
		//연산은 int형으로 형변환됨 (따라서 ch는 int형으로 바뀌며 아스키코드를 사용)
		//if('0' <= ch && ch <= '9')
		if(Character.isDigit(ch))
		{
			result = "숫자";
		}
		else if(Character.isUpperCase(ch))
		{
			result = "영어 대문자";
		}
		else if(Character.isLowerCase(ch))
		{
			result = "영어 소문자";
		}
		else
		{
			result = "한글 또는 특수문자";
		}
		
		System.out.println("입력하신 문자 " + ch + "는 " + result + "입니다.");
		
	}

}
