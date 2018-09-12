package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		new Test4().test();

	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		String word = ""; 
		char key = 'a';
		int cnt = 0;
		
	
		
		System.out.print("문자열을 입력해주세요.(소문자로) : ");
		word = sc.nextLine();
		word += ' ';
		
		System.out.print("검색하실 문자를 입력해주세요. : ");
		key = sc.next().charAt(0);
		
		
		
		if(key >= 'a' && key <= 'z')
		{

			for(int i = 0; ((int)word.charAt(i) != ' '); i++)
			{

				if(word.charAt(i) == (int)key)
				{
					cnt ++;
				}
			
			}

			
			

			System.out.println(cnt);
		}
		else
		{
			System.out.println("영문자가 아닙니다.");
		}
		
	}

}
