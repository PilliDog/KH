package com.oop.body.model;

public class Head extends Body{
	
	static String hairColor; 
	
	public Head() {
		headBang();
	}
	public Head(String hairColor)
	{
		this.hairColor = hairColor;
	}
	
	public String getHairColor()
	{
		return hairColor;
	}
	public void setHairColor(String hairColor)
	{
		this.hairColor = hairColor;
	}
	
	public void headBang()
	{
		System.out.println("~색 머리를 돌립니다.");
	}

}
