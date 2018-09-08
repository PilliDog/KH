package com.api.string;

public class StringProcess {

	public String preChar(String s)
	{
		s = Character.toUpperCase(s.charAt(0)) 
				   + s.substring(1); //첫글자 대문자 변환
		return s;
	}
	
	public int charSu(String s, char ch)
	{
		int cnt = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == ch) cnt++;
		}
		return cnt;
	}
	
}
