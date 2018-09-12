package kh.java.exception;

import java.util.Scanner;

import kh.java.exception.custom.UnderAgeException;

/**
 * 예외를 직접 던지기
 *
 */

public class ThrowExceptionTest {
	
	public static void main(String[] args){
		ThrowExceptionTest t = new ThrowExceptionTest();
		t.inputAge();
		System.out.println("======== 프로그램 종료 ========");
	}
	
	
	public void inputAge()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		//나이를 검사하고, 20세 미만인 경우 예외를 던지는 메소드
		try
		{
			checkAge(age);
			System.out.println("프로그램을 시작합니다.");
		}
		catch(Exception e)
		{
//			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}
	}
	
	
	public void checkAge(int age) throws Exception
	{
		if(age < 20)
		{
			throw new UnderAgeException("적정 연령이 아닙니다.");
		}
	}
	

}
