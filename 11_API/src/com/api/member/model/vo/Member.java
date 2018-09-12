package com.api.member.model.vo;

import java.util.Calendar;
import java.util.Date;

public class Member {
	
	private int memberNo, height, weight;
	private String memberName;
	private Calendar cal;
	
	
	public Member(String memberNo, String height, String weight, String memberName/*, String cal*/) {
		this.memberNo = Integer.parseInt(memberNo);
		this.height = Integer.parseInt(height);
		this.weight = Integer.parseInt(weight);
		this.memberName = (memberName);
//		Calendar test = new Calendar(new Date());
//		this.cal = Calendarcal;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = Integer.parseInt(memberNo);
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Calendar getCal() {
		return cal;
	}
	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	//회원정보 저장
	public Member() {}
//	public void Mmeber(String memberNo, String memberName, String height, String weight)
//	{
//		this.memberNo = Integer.parseInt(memberNo);
//		this.memberName = memberName;
//		this.height = Integer.parseInt(height);
//		this.weight = Integer.parseInt(weight);
//	}
	
	//회원정보 출력
	public void information() 
	{
		System.out.println();
		System.out.println("번호 : " + memberNo);
		System.out.println("이름 : " + memberName);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("생년월일 : " + null);
		
	}

}
