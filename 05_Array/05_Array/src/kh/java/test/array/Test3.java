package kh.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		new Test3().test();

	}
	
	
	public void test() {
		
		String[] userWord = new String[1];
		char key = ' ';
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		userWord[0] = sc.nextLine();
		System.out.print("검색하실 문자를 입력해주세요. : ");
		key = sc.nextLine().charAt(0);
		
		for(int i = 0; i < userWord[0].length(); i++)
		{		
			if(key == userWord[0].charAt(i))
			{
				cnt ++;
			}
		}
		
		System.out.println("너가 찾는 문자는 " + cnt + "개야..");
		
		
	}

}
