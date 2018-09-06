package kh.java.dog.quiz01_03;

import java.util.Scanner;

public class InputOutput {
	
	Scanner sc = new Scanner(System.in);
	
	String name, adress;
	int age;
	char gender;
	double cm, kg;
	
	
	//사용자에게 정보를 입력받는 메소드
	public void input() {
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		adress = sc.nextLine();
		System.out.print("키를 입력하세요 : ");
		cm = sc.nextDouble();
		sc.nextLine();
		System.out.print("몸무게를 입력하세요 : ");
		kg = sc.nextDouble();
		sc.nextLine();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.nextLine().charAt(0);
		
	}
	
	
	//사용자에게 입력받은 정보를 출력하는 메소드, 키와 몸무게는 실수로 받지만 정수형으로 출력한다. 
	public  void output() {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + adress);
		System.out.println("키 : " + (int)cm);
		System.out.println("몸무게 : " + (int)kg);
		System.out.println("성별 : " + gender);
		
	}

}
