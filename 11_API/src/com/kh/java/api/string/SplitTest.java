/**
 * tokenizer는 문자 하나하나를 검사해서 제외시킴
 * Split은 하나
 */
package com.kh.java.api.string;

import java.util.StringTokenizer;

public class SplitTest {

	public static void main(String[] args) {
		new SplitTest().test1();
		
		new SplitTest().test2();
	}
	
	public void test2()
	{
		String data = "100,,,200,300";
		String[] split = data.split(",");
		StringTokenizer tokenizer = new StringTokenizer(data, ",");
		
		//1. split
		for(int i=0; i<split.length; i++)
		{
			System.out.print(split[i] + "|");
		}
		System.out.println("개수 : " + split.length);
		System.out.println("---------------------------");
		
		//2. StringTokenizer : 빈 문자열을 무시함
		System.out.println("개수 : " + tokenizer.countTokens());
		while(tokenizer.hasMoreTokens())
		{
			System.out.print(tokenizer.nextToken() + "|");
		}
		
		System.out.println("\n===================");
		
		data = "a, b, c,d e";
		split = data.split(", ");
		tokenizer = new StringTokenizer(data, ", ");
		for(int i=0; i<split.length; i++)
		{
			System.out.print(split[i] + "|");
		}
	}
	
	public void test1()
	{
		String str = "JAVA, ORACLE, JDBC, HTML5, CSS3";
		//split : String클래스가 제공하는 문자열 분리메소드
		//매게변수로 전달한 문자열을 구분자로 분리함
		//return타입은 String[]
		String[] arr = str.split(", ");
		System.out.println("분리된 문자열 개수 : " + arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//객체배열  사용시 향상된 for문을 사용가능
		for(String s : arr)
		{
			System.out.println(s);
		}
		
		System.out.println("---------------------------------");
		//2. StringTokenizer
		StringTokenizer stn = new StringTokenizer(str, ", ");
		System.out.println("분리된 문자열 개수 : " + stn.countTokens());
		
		//while문으로 요소출력
		while(stn.hasMoreTokens())
		{
			//객체 내 요소 열람
			System.out.println(stn.nextToken());
		}
		System.out.println("분리된 문자열 개수 : " + stn.countTokens());
	}

}
