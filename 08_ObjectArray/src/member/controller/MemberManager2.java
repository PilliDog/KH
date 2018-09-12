package member.controller;

import java.util.Scanner;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class MemberManager2 {
	static Silver[] customer_silver = new Silver[10];
	static Gold[] customer_gold = new Gold[10];
	static Vip[] customer_vip = new Vip[10];
	static Vvip[] customer_vvip = new Vvip[10];
	Scanner sc = new Scanner(System.in);
	//MemberManager engine = new MemberManager();
	static int countSilver = 0, countGold = 0, countVip = 0, countVvip = 0;
	String userRate;
	
	public void insertUser() {
		
			System.out.println();
			System.out.print("등급을 입력해주세요 : ");
			userRate = sc.next();
			if(userRate.equals("silver")) 
			{
				new MemberManager2().insertSilver();
			}
			else if(userRate.equals("gold"))
			{
				new MemberManager2().insertGold();
			}
			else if(userRate.equals("vip"))
			{
				new MemberManager2().insertVip();
			}
			else
			{
				new MemberManager2().insertVvip();
			}
		
	}
	
	public void insertVvip() {
		if(countVvip == 10)
		{
			System.out.println("모든 리스트에 저장이 완료되어 추가가 불가능합니다.");
			return;
		}
		customer_vvip[countVvip] = new Vvip();
		customer_vvip[countVvip].setRate("silver");
		System.out.print("이름을 입력해주세요 : ");
		customer_vvip[countVvip].setName(sc.nextLine());
		System.out.print("포인트를 입력해주세요 : ");
		customer_vvip[countVvip].setPoint(sc.nextInt());
		customer_vvip[countVvip].setBonus((customer_vvip[countVvip].getPoint()*0.1));	
		System.out.println();
		countVvip ++;
	}
	
	public void insertVip() {
		if(countVip == 10)
		{
			System.out.println("모든 리스트에 저장이 완료되어 추가가 불가능합니다.");
			return;
		}
		customer_vip[countVip] = new Vip();
		customer_vip[countVip].setRate("silver");
		System.out.print("이름을 입력해주세요 : ");
		customer_vip[countVip].setName(sc.nextLine());
		System.out.print("포인트를 입력해주세요 : ");
		customer_vip[countVip].setPoint(sc.nextInt());
		customer_vip[countVip].setBonus((customer_vip[countVip].getPoint()*0.1));	
		System.out.println();
		countVip ++;
	}
	
	public void insertSilver() {
		if(countSilver == 10)
		{
			System.out.println("모든 리스트에 저장이 완료되어 추가가 불가능합니다.");
			return;
		}
		customer_silver[countSilver] = new Silver("홍길동", "Silver", 1000);
		countSilver ++;
	}
	
	public void insertGold() {
		if(countGold == 10)
		{
			System.out.println("모든 리스트에 저장이 완료되어 추가가 불가능합니다.");
			return;
		}
		customer_gold[countGold] = new Gold();
		customer_gold[countGold].setRate("gold");
		System.out.print("이름을 입력해주세요 : ");
		customer_gold[countGold].setName(sc.nextLine());
		System.out.print("포인트를 입력해주세요 : ");
		customer_gold[countGold].setPoint(sc.nextInt());
		customer_gold[countGold].setBonus((customer_gold[countGold].getPoint()*0.05));		
		System.out.println();
		countGold ++;
	}
	
	public void output() {
		System.out.println();
		System.out.println("===============================================");
		System.out.print("이름\t\t등급\t포인트\t\t보너스 포인트\n");
		if(countVvip > 0) output_vvip();
		if(countVip > 0) output_vip();
		if(countGold > 0) output_gold();
		if(countSilver > 0) output_silver();
		System.out.println("===============================================");
		System.out.println();
		if(countSilver == 0 && countGold == 0) System.out.print("조회할 회원이 없습니다.\n\n");
	}
	
	public void output_vvip() {
		for(int i=0; i<countVvip; i++)
		{
			System.out.print(customer_vvip[i].getName() + "\t"
					+customer_vvip[i].getRate() + "\t"
					+customer_vvip[i].getPoint() + "\t\t"
					+customer_vvip[i].getBonus() + "\n");
		}	
	}
	
	public void output_vip() {
		for(int i=0; i<countVip; i++)
		{
			System.out.print(customer_vip[i].getName() + "\t"
					+customer_vip[i].getRate() + "\t"
					+customer_vip[i].getPoint() + "\t\t"
					+customer_vip[i].getBonus() + "\n");
		}	
	}
	
	public void output_gold() {
		for(int i=0; i<countGold; i++)
		{
			System.out.print(customer_gold[i].getName() + "\t"
					+customer_gold[i].getRate() + "\t"
					+customer_gold[i].getPoint() + "\t\t"
					+customer_gold[i].getBonus() + "\n");
		}	
	}
	
	public void output_silver() {
		for(int i=0; i<countSilver; i++)
		{
			System.out.print(customer_silver[i].getName() + "\t"
					+customer_silver[i].getRate() + "\t"
					+customer_silver[i].getPoint() + "\t\t"
					+customer_silver[i].getBonus() + "\n");
		}
	}

}
