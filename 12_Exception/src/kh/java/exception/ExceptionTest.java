package kh.java.exception;

import java.util.Scanner;

public class ExceptionTest {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionTest  e = new ExceptionTest();
		//e.test1();
//		e.test2();
//		e.test3();
		e.test4();
//		e.test5();
		System.out.println("프로그램 종료");
	}
	
	public void test1()
	{
		for(int i=0; i<3; i++)
		{
			//예외처리를 해보자!
			try {
				int num = 100;
				System.out.print("정수를 입력하세요 : ");
				int num2 = sc.nextInt();
				System.out.println("100을 " + num2 + "로 나눈 몫은? : " + num/num2);
			}catch(ArithmeticException e) {
				System.out.println("0 빼고 똑바로 입력해라");
			}
		}
	}//test1
	
	/**
	 * 예외처리 코드 실행순서
	 * try절에서 예외가 발생한 코드 아래는 실행되지 않는다.
	 */
	public void test2()
	{
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(100/0);
			System.out.println(3);
		}catch(ArithmeticException e) {
			System.out.println(4);
			System.out.println("프로그램 정상종료");
		}
		System.out.println(5);
	}//test2
	
	/**
	 * catch문 처리순서
	 * 상속관계를 고려해서 자식예외클래스를 부모예외클래스보다 먼저 작성하여야 함
	 * 형제 또는 계층구조상 연관이 없는 예외 클래스는 상관없음
	 */
	public void test3()
	{
		try {
//			System.out.println(100/0); //ArithmeticException
			
//			String s = null;
//			System.out.println(s.length()); //NullPointerException
			
			int[] a = new int[3];
			System.out.println(a[10]);
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//Exception은 부모클래스, 상위 클래스는 아래로
		}catch(Exception e) {
			System.out.println("Exception!!!!!!!!!!!!!!!!!");		
		}
	}//test3
	
	
	/**
	 * 예외메시지 출력
	 * 1. e.getMessage() : String
	 * 	발생한 예외클래스 객체에 저장된 메시지를 리턴
	 * 2. e.printStackTrace() : void
	 * 	예외발생시 호출스택(Call stack)에 있던 메소드 계층구조를 출력
	 */
	public void test4()
	{
		try {
			System.out.println(100/0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}//test4
	
	
	/**
	 * finally 구문
	 * 예외발생여부와 상관없이 무조건 실행되는 구문
	 * 중간에 return 문을 만나도, 먼저 finally구문은 실행되고, retrun함
	 */
	public void test5()
	{
		try 
		{
			System.out.println(1);
//			System.out.println(100/0);
			if(true) return;
			System.out.println(2);
		}
		catch(Exception e)
		{
			System.out.println(3);
		}
		finally
		{
			System.out.println(4);
		}
		System.out.println(5);
	}//test5

}
