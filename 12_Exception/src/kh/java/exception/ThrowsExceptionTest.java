package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ThrowsExceptionTest {

												//JVM이 알아서해~ >> 응~ 망
	public static void main(String[] args) /*throws FileNotFoundException*/{
		ThrowsExceptionTest t = new ThrowsExceptionTest();
		try
		{
			t.method1();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
	
	/**
	 * 예외처리 원칙
	 * 최초 메소드를 호출한 곳에서 예외처리한다.
	 */
	public void method1() throws FileNotFoundException
	{
		System.out.println("-------- method1() start --------");
		method2();
		System.out.println("-------- method1() end --------");
	}//method1 end
	
	/**
	 * 예외 던지기
	 * 메소드 실행 도중 발생할 수 있는 예외를 메소드레벨에서 던져버림
	 * method2()를 호출한 쪽에서 예외처리를 해야함.(처리위임)
	 * 
	 */
	public void method2() throws FileNotFoundException
	{
		System.out.println("-------- method2() start --------");
		FileReader fr = new FileReader("tset.txt");
		//1. UncechkedException : 예외처리 강제화 없음
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 하나 입력하세요 : ");
//		int num = sc.nextInt(); //RuntimeException 유발코드
		System.out.println("-------- method2() end --------");
		
		//2. CechkedException
		
//		try 
//		{
//			FileReader fr = new FileReader("tset.txt");
//		}
//		catch(FileNotFoundException e)
//		{
//			e.printStackTrace();
//		}
			
	}//method2 end

}
