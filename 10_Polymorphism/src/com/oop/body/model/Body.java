package com.oop.body.model;

import member.model.vo.Member;

public class Body {
	Body[] start = new Body[5];
	int index = 0;
	
	public void action(Body b)
	{
		this.start[index] = b;
	}
	
	
	
//	public void insertMember(Member client)
//	{
//		this.client[index] = client;
//		index++;
//	}

}
