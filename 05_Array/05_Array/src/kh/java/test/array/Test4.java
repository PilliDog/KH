package kh.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		new Test4().test();

	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		String phoneNumber;
		char[] phoneNum = new char[13];
		char[] changeNum = phoneNum;
		
		System.out.println("전화번호를 '-'를 포함하여 입력해주세요.");
		phoneNumber = sc.nextLine();
		
		for(int i = 0; i < phoneNum.length; i++)
		{
			phoneNum[i] = phoneNumber.charAt(i);
			
		}
		
		changeNum = phoneNum;
		
		for(int i = 4; i < 8; i++)
		{
			changeNum[i] = '*';
		}
		
		System.out.print("당신의 번호는 : ");
		System.out.println(changeNum);
	}

}
