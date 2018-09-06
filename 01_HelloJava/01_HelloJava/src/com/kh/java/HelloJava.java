package com.kh.java;
import java.util.Date;

import com.kh.other.*;

public class HelloJava {

	public static void main(String[] args) {

		System.out.println( "안녕" );
		
		HelloJava hj = new HelloJava();
		hj.test();

		Other jh = new Other();
		jh.otherMethod();
		
	}
	
	
	public void test() {
		
		Date today = new Date();
		System.out.println(today);
		
		//java.lang 패키지는 import문 없이 사용할 수 있다.
		String s = new String("안녕2");
		System.out.println(s);
		
		//@퀴즈@ Other클래스의  other메소드 호출하기
		// 1. Other 클래스 객체
		// 2. import작성
		// (java.lang패키지, 같은패키지가 아닌 클래스는 반드시 import)
		// 3. 메소르 호출
		
		
		Other jh = new Other();
		jh.otherMethod();
	}
	
	

}
