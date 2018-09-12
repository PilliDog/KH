/*
 2. 자신의 신상정보를 저장할 변수를 만들고 정보를 변수에 대입, 출력하는 프로그램을 작성하세요.
 	- 이름, 나이, 성별,주소, 전화번호, 이메일      

작성한 변수를 활용해 옆 친구의 신상정보를 다시 변수에 대입 출력하는 프로그램으로 수정하세요.
 */
package com.kh.test;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("본인의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("본인의 나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		System.out.print("본인의 성별을 입력해주세요 : ");
		char sex = sc.next().charAt(0);
		
		System.out.print("본인의 주소를 입력해주세요 : ");
		sc.nextLine();
		String adress = sc.nextLine();
		
		
		System.out.print("본인의 전화번호를 입력해주세요 : ");
		String phoneNumber = sc.nextLine();
		
		System.out.print("본인의 이메일을 입력해주세요 : ");
		String eMail = sc.nextLine();
		//sc.nextLine();
		
	
		System.out.println("\n\n당신이 입력한 신상 정보는 다음과 같습니다.");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("주소 : " + adress);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("이메일 : " + eMail);

	}

}
