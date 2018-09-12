package kh.java.basic.method;

import java.util.Scanner;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		
		MethodWithReturnValue start = new MethodWithReturnValue();
		//start.test1();
		//start.test2();
		//start.inputName();
		//start.outputName();
		
		//퀴즈!!! 사용자에게 5개의 수를 입력받고, 그 합을 출력하세요.
		
		int c = start.inputNum();
		System.out.println(c);
		
	}
	
	/*
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		String name = new String();
		
		//1. 입력
		System.out.print("이름을 입력하세요  : ");
		name = sc.next();
		
		
		//2. 출력
		System.out.println("이름 : " + name);
		
	}
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		String name = new String();
		
		//1. 입력
		System.out.print("이름을 입력하세요  : ");
		name = sc.next();
		
		
		//2. 출력
		System.out.println("이름 : " + name);
		
	}
	*/
	/*
	public String inputName() {
		
		Scanner sc = new Scanner(System.in);
		String name = new String();
		
		//1. 입력
		System.out.print("이름을 입력하세요  : ");
		return name = sc.next();
		
	}
	
	public void outputName() {
		
		String name = inputName();
		System.out.println("이름 : " + name);
	}
	*/
	
	public int inputNum() {
		
		int userNum = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 숫자를 입력해주세요. ");
		userNum = sc.nextInt();
		sum += userNum;
		System.out.println("2. 숫자를 입력해주세요. ");
		userNum = sc.nextInt();
		sum += userNum;
		System.out.println("3. 숫자를 입력해주세요. ");
		userNum = sc.nextInt();
		sum += userNum;
		System.out.println("4. 숫자를 입력해주세요. ");
		userNum = sc.nextInt();
		sum += userNum;
		System.out.println("5. 숫자를 입력해주세요. ");
		userNum = sc.nextInt();
		sum += userNum;
		
		return sum;
		
		
	}
	
	
	

}
