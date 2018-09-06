package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.Person;

public class PersonController {
	
	Person[] engine = new Person[5];
	Scanner sc = new Scanner(System.in);
	
	String name;
	int age, balance;
	double cm, kg;
	double ageAvg = 0, cmAvg = 0, kgAvg = 0, balanceAvg = 0;
	
	public PersonController() {}
	
	public void insertData() {
		for(int i=0; i<engine.length; i++)
		{
			//객체를 생성하자
			engine[i] = new Person();
			//사용자에게 입력값을 받음
			System.out.print("이름을 입력하세요 : ");
			engine[i].setName(sc.nextLine());
			System.out.print("나이를 입력하세요 : ");
			engine[i].setAge(sc.nextInt());
			sc.nextLine();
			System.out.print("재산을 입력하세요 : ");
			engine[i].setBalance(sc.nextInt());
			sc.nextLine();
			System.out.print("키를 입력하세요 : ");
			engine[i].setCm(sc.nextDouble());
			sc.nextLine();
			System.out.print("몸무게를 입력하세요 : ");
			engine[i].setKg(sc.nextDouble());
			sc.nextLine();
			System.out.println();
			
			//평균을 구하기 위한 합계
			ageAvg += engine[i].getAge();
			cmAvg += engine[i].getCm();
			kgAvg += engine[i].getKg();
			balanceAvg += engine[i].getBalance();
			
			
		}	
	}
	
	public void print() {
		System.out.println("===== 출력 확인용 =====");
		for(int j=0; j<engine.length; j++)
		{
			System.out.println("이름 : " + engine[j].getName());
			System.out.println("나이 : " + engine[j].getAge());
			System.out.println("재산 : " + engine[j].getBalance());
			System.out.println("키 : " + engine[j].getCm());
			System.out.println("몸무게 : " + engine[j].getKg());
			System.out.println();
		}
		System.out.print("==================\n\n\n");
		
	}
	
	public void calAvg() {	
			
		//배열의 마지막까지 입력을 했다면 ~ , 평균내기
		for(int i=0; i<engine.length; i++)
		{
			if(i == (engine.length - 1))
			{
				ageAvg /= (i+1);
				cmAvg /= (i+1);
				kgAvg /= (i+1);
				balanceAvg /= (i+1);
			}
			System.out.println("나이 평균 : " + ageAvg);
			System.out.println("키 평균 : " + cmAvg);
			System.out.println("몸무게 평균 : " + kgAvg);
			System.out.println("재산 평균 : " + balanceAvg);
		}
	}

}
