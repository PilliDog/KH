package kh.java.scanner;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
	
		ScannerTest s = new ScannerTest();
		//s.test1();
		s.test2();
	}
	
	
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print(" > int값을 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println("i : " + i);
		
		System.out.print(" > long값을 입력하세요 : ");
		long l = sc.nextLong();
		System.out.println("l : " + l);
		
		System.out.print(" > double값을 입력하세요 : ");
		double d = sc.nextDouble();
		System.out.println("d : " + d);
		
		System.out.print(" > boolean값을 입력하세요 : ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool : " + bool);
		*/
		
		//문자, 문자열
		//1. next() : 공백/개행문자 전까지 버퍼에서 읽어옴.
		//2. nextLine() : 개행문자까지 읽어와서 개행문자는 버리고 변수에 담음.
		//단, char 타입으로의 변환은 charAt(int index)메소드를 사용함
		
		//입력데이터는 버퍼 > RAM
		System.out.print("문자를 입력하세요 : ");
		char c = sc.next().charAt(0);
		System.out.println("c : " + c);
		
		//개행문자 날리기용(버퍼에 남은 개행문자를 날려버림
		sc.nextLine();
		
		System.out.print("> 문자열을 입력하세요.: ");
		String s = sc.nextLine();
		System.out.println("s : " + s);
		
		
		
	}
	
	//next, nextLine 메소드 비교
	public void test2() {
		
		String test = "hello, world!\n\n나 문자열이야..\n";
		Scanner sc = new Scanner(test);
		
		//스캐너야 다음에 더 읽어올 것이 있니? 있으면 계속 읽어줘
		while(sc.hasNext()) {
			/*
			//1. next()
			//문자열 이전에 만나는 공백, 개행문자는 무시함
			//문자열 이후에 처음 만나는 공백, 개행문자 전까지 읽어옴
			String s = sc.next();
			System.out.println("[" + s + "]");
			*/
			
			//2. nextLine()
			//개행문자까지 잃어와서 개행문자 버림(공백무시)
			
			String s = sc.nextLine();
			System.out.println("[" + s + "]");
		}
		
	}

}
