package com.exception.charcheck;

public class CharacterProcess {
	public CharacterProcess () {}
	
	public int countAlpha(String s)
	{ 
		int count = 0;
		for(int i=0; i<s.length(); i++)
		{

				if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
				{
					count ++;
				}
				else if(s.charAt(i) == ' ')
				{
					throw new CharCheckException();
				}

		}
		
		return count;
	}

}
