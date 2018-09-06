package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		new Test5().input();

	}
	
	
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		String info = "======== 저장회원 ========\n";
		int cnt = 1;
		String name, adress;
		int age, phoneNum;
		double cm, kg;
		int maxCnt = 0;
		
		System.out.print("몇 명을 입력하실 건가요? : ");
		maxCnt = sc.nextInt();
		
		while(cnt <= maxCnt)
		{
			
		info += cnt;
		info += " ";
		System.out.print("이름을 입력하세요. : ");
		name = sc.nextLine();
		info += name;
		info += " ";
		System.out.print("나이를 입력하세요. : ");
		age = sc.nextInt();
		info += age;
		info += "세 ";
		System.out.print("주소를 입력하세요. : ");
		adress = sc.nextLine();
		info += adress;
		info += " ";
		System.out.print("키를 입력하세요. : ");
		cm = sc.nextDouble();
		info += cm;
		info += "cm ";
		System.out.print("몸무게를 입력하세요. : ");
		kg = sc.nextDouble();
		info += kg;
		info += "kg ";
		System.out.print("연락처를 입력하세요. : ");
		phoneNum = sc.nextInt();
		info += phoneNum;
		info += " \n";
		System.out.println(" ");
		//result += info;
		cnt ++;
		}
		
		System.out.println(info);
		System.out.println("=========================");
		System.out.println();
		
	}

	
	
}





