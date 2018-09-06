package member.controller;

import member.model.vo.Member;

public class MemberManager {
	Member[] client = new Member[40];
	int index = 0;
	
	public MemberManager() {}
	
	public void insertMember(Member client)
	{
		this.client[index] = client;
		index++;
	}
	
	public void printData()
	{
		for(int i=0; i<client.length; i++)
		{
			if(client[i] != null)
			{
			System.out.print(client[i].toString() + " ");
			System.out.println(client[i].getBonusPoint());
			}
		}
		System.out.println();
		for(int i=0; i<client.length; i++)
		{
			if(client[i] != null)
			{
			printBuyInfo(client[i], 10000);
			}
		}
	}
	
	public void printBuyInfo(Member m, int price)
	{
		System.out.println(m.getGrade() + "등급회원 " 
						 + m.getName() + "은 10000원 상품을 "
						 + m.getPrice()
						 + "원에 구매합니다.");
	}
	
	


}
