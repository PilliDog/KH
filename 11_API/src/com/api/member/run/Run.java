package com.api.member.run;

import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

public class Run {

	static String memberNo, height, weight;
	static String memberName;
	static String cal;
	
	public static void main(String[] args) {
		
		String omgMessage = "\"1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319\" \"\"";
		omgMessage = omgMessage.substring(1);
		omgMessage = omgMessage.substring(0, omgMessage.length() -4);
		
		String[] userInfo = omgMessage.split("\\|");
		
		for(int i=0; i<userInfo.length; i++)
		{
			System.out.println(userInfo[i]);
//			userInfo[i] = userInfo[i].split(",");
		}
		
		
		
		for(int i=0; i<3; i++)
		{
			StringTokenizer token = new StringTokenizer(userInfo[i], ",");
			memberNo = token.nextToken();
			memberName = token.nextToken();
			height = token.nextToken();
			weight = token.nextToken();
			Member m = new Member(memberNo, height, weight, memberName);
			m.information();
//			m.setMemberNo(memberNo);
//			m.setMemberName(omgMessage);
//			m.setHeight();
		}
		
	}

}
