package kh.java.args;

import java.util.Scanner;

public class CommandLineArgumentsTest {

	public static void main(String[] args) {
		
//		for(int i=0; i<args.length; i++)
//		{
//			System.out.println("args[" + i + "] : " + args[i]);
//		}
		
		CommandLineArgumentsTest start = new CommandLineArgumentsTest();
		//start.test1(args);
		//start(test2);
		start.test2(args);

	}
	
	
	public void test1(String[] args) {
		
		//사용자에게 이름, 성별, 나이, 키, 몸무게를 입력받음
		String name = "";
		char gender = ' ';
		int age = 0;
		double height = 0.0;
		
		for(int i=0; i<args.length; i++)
		{
			switch(i)
			{
			case 0 : name = args[i]; 
			break;
			
			case 1 : gender = args[i].charAt(0);
			break;
			
			case 2 : age = Integer.parseInt(args[i]);
			break;
			
			case 3 : height = Double.parseDouble(args[i]);
			break;
			}
		}
		
		//출력하기
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	
	public void test2(String[] args) {
		//사용자에게 임의의 갯수 정수를 받고 총합을 출력

		int sum = 0, num = 0;
		for(int i=0; i<args.length; i++)
		{
			num = Integer.parseInt(args[i]);
			sum += num;
		}
		
		System.out.println("sum : " + sum);
	}

	

}
