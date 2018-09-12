package kh.java.io.byte_.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * 표준입력
 * 1. 표준입력 : System.in
 * 		'사용자의 키보드입력'을 대상으로 하는 InputStream
 * 2. 표준출력 : System.out
 * 		'콘솔'을 대상으로 하는 PrintStream 객체
 *
 */

public class SystemIOTest {
	
	public static void main(String[] args) {
		SystemIOTest s = new SystemIOTest();
		//s.test1();
		
		//외부버퍼를 이용한 입출력처리
		//s.test2();
		
		//보조스트림을 사용하기
		s.test3();
	}
	
	
	public void test3()
	{
		//byte기반 : System.in
		//byte => char 보조스트림 : InputStreamReader인자로 전달
		//char기반 보조스트림 : BufferedReader인자로 전달 => 라인단위
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = ""; //라인단위로 읽어온 데이터를 담을 변수
		
		try {
			while((input=br.readLine()) != null)
			{
				System.out.println(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//사용한 자원반납
				//보조스트림을 사용한 경우, 보조스트림만 반납
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 외부버퍼를 이용한 입출력처리
	 */
	public void test2()
	{
		byte[] b = new byte[256]; //한번에 담을 최대크기
		int len = 0;//사용자가 입력한 크기를 담을 변수
		
		try {
			//b에 닮김(buffer)
			while((len = System.in.read(b)) != -1)
			 //1. 저장된 buffer의 값 출력
			 //매번 출력시 마다 buffer를 비우지 않기 때문에 이전 입력값과 함께 출력된다
			{
				//System.out.write(b);
				//2. 사용자가 입력한 크기, 정확히 읽어온 크기만큼만 출력
				System.out.write(b, 0, len); //0은 인덱스
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void test1()
	{
		//사용자 입력을 잃어와서 담을 변수
		int input = 0;
		
		try 
		{
			//IOException은 checkedException으로 예외처리를 강제화함
			while((input=System.in.read()) != -1) //-1 값이 없는거
			{
				System.out.println("input : " + input);
				//byte기반이므로 범위를 넘어서는 한글에 대한 처리 불가함
			}
		}
		catch(IOException e) 
		{
			
		}
		finally
		{
			//입출력자원은 반드시 사용후에 반납해야함
			//jvm이 os로부터 빌려온 자원
			//반납하지 않으면 jvm이 프로그램 종료시에 반납하기는 하나
			//효율적인 프로그램 운영을 위해 사용이 끝나면 반납하는 코딩습관을 들이자!!
			//예외) 표준입출력을 사용한 자원은 반납하지 않는다.(스캐너 등, 반납하면 다시는 못씀...(프로그램 재실행까지))
			try {
				System.in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.close();
		}
		
	}

}
