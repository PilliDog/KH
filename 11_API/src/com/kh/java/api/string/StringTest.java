package com.kh.java.api.string;

public class StringTest {
	/*
	 * String : immutable(불변), 멀티쓰레드 지원 
	 * 	+/concat메소드를 사용하면 LiteralPool(StringPool)에 새로운 문자열을 만들고 참조
	 * 
	 * StringBuffer : mutable(변), 멀티쓰레드 지원
	 * StringBilder :  mutable(변), 싱글쓰레드만 지원
	 */

	public static void main(String[] args) {
		
		StringTest s = new StringTest();
		//s.test1();
		//StringBuilder
		s.test2();
	}
	
	public void test2()
	{
		//StringBuilder클래스는 문자열을 저장하기 위한 객체
		//StringPool을 사용하지 않고 객체 안에 저장
		StringBuilder sb = new StringBuilder("java");
		
		System.out.println("sb : " + sb);
		System.out.println("sb : " + sb.hashCode());
		
		System.out.print("\n---------- append 후 ----------\n\n");
		//문자열 변경(추가)
		//자주 변경되는 문자열의 경우 String보다는 Stringbuilder가 더 효율적
		//StringBuilder > StringBuffer > String
		//jdk1.5부터는 String타입의 +(/concat)연산시에 StringBuilder를 사용해서 효율성이 많이 증가됨
		sb.append("oracle");
		System.out.println("sb : " + sb);
		System.out.println("sb : " + sb.hashCode());
	}
	
	public void test1()
	{
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s3 == s4 : " + (s3 == s4));
		
		System.out.println("---------------");
		//문자열 값 비교 equals
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s2.equals(s3) : " + s2.equals(s3));
		System.out.println("s3.equals(s4) : " + s3.equals(s4));
		
		//String은 객체 값기준으로 hashCode()오버라이드 해두었음
		//equals의 결과값이 true면 hashcode값도 동일해야함
		System.out.println("s1의 hashcode : " + s1.hashCode());
		System.out.println("s2의 hashcode : " + s2.hashCode());
		System.out.println("s3의 hashcode : " + s3.hashCode());
		System.out.println("s4의 hashcode : " + s4.hashCode());
		
		System.out.println("---------------");
		//문자열 변경시
		s2 += "oracle"; //javaoracle, java = 1,3
		s4 += "oracle"; //javaoracle
		
		System.out.println("s1==s2 : " + (s1==s2));
		System.out.println("s1의 hashcode : " + s1.hashCode());
		System.out.println("s2의 hashcode : " + s2.hashCode());
		System.out.println("s3의 hashcode : " + s3.hashCode());
		System.out.println("s4의 hashcode : " + s4.hashCode());
		
	}

}
