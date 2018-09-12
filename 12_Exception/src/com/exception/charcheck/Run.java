package com.exception.charcheck;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Run {
	static String word = null;
	static int userNum = 0;
	public static void main(String[] args) {

			try {
				new Run().test1();
			} catch (Exception e) {
				e.printStackTrace();
			}			

		
	}
	
	public void test1() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열을 입력하세요 : ");
		try {
			word = br.readLine();
			for(int i=0; i<word.length(); i++)
			{
				if(' ' == word.charAt(i))
				{
					throw new Exception("체크할 문자열 안에 공백이 포함될 수 없습니다.");
				}
			}
			userNum = new CharacterProcess().countAlpha(word);
			System.out.println("전달된 영문자는 " + userNum + "입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
