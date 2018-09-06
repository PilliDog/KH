package kh.java.dog.quiz01_02;

import java.util.Scanner;

public class InputOutput {

	Scanner sc = new Scanner(System.in);
	
	String name, adress, phoneNum, email;
	int age;
	char gender;
		
	
	//사용자에게 입력을 받는 메소드
	public void input() {
		
		System.out.print("이름을 입력해주세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력해주세요 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별을 입력해주세요 : ");
		gender = sc.nextLine().charAt(0);
		System.out.print("주소를 입력해주세요 : ");
		adress = sc.nextLine();
		System.out.print("전화번호를 입력해주세요 : ");
		phoneNum = sc.nextLine();
		System.out.print("이메일을 입력해주세요 : ");
		email = sc.nextLine();
		
	}
	
	
	//사용자에게 입력받은 메소드를 출력하는 메소드, 입력을 받지 않고 사용할 수 없다.
	public void output() {
		
		System.out.println();
		System.out.println("==========================");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("주소 : " + adress);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("이메일 : " + email);
		System.out.print("==========================");
		
	}

}
