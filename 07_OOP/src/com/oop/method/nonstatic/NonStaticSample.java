package com.oop.method.nonstatic;

import java.util.Arrays;

public class NonStaticSample {
	
	public NonStaticSample() {
		
		
		
	}
	
	//1. 반환값 없고 매개변수 없는 메소드
	//실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	public void printLottoNumbers() {
		
		int[] lottoNum = new int [6];
		
		
		for(int i=0; i<lottoNum.length; i++)
		{
			lottoNum[i] = (int) ((Math.random() * 45) + 1);
			
		
			for(int j=0; j<i; j++)
				{
					if(lottoNum[i] == lottoNum[j])
					{
						i--;
						System.out.println("중복이라 제거했어");
						break;
					}
				}
		}
		
		System.out.println(Arrays.toString(lottoNum));
		
	}
	
	
	public void outputChar(int _int, char _char) {
		
		for(int i=0; i<_int; i++)
		{
			System.out.println(_char);
		}
		
	}
	
	
	public char alphabet() {
		
		int generate = (int) (Math.random() * (122 - 97 + 1)) + 97;
		System.out.println(generate);
			
		return (char)generate;
		
	}
	
	
	public String mySubstring(String _String, int startIndex, int endIndex) {
		
		String result = " ";
		if(_String.length() < (startIndex+endIndex))
		{
			result = "NULL";
		}
		else
		{
			result = _String.substring(startIndex, (endIndex+1));
		}
		
		
		return result;
		
	}

}
