package oop1.day4;

import oop1.day3.method.sample.MethodSample1;

public class MethodSample2 {
	
	private int num1; //인스턴스 필드
	private static int num2; //스태틱 필드
	MethodSample1 ms1 = new MethodSample1();
	
	//static메소드
	//Math.random() = 난수 뽑기
	
	public void method1() //인스턴스 메소드
	{
		num1 = 10; 
		num2 = 20;
		ms1.method1();
	}
	
	public static void method2()//static 메소드
	{
		/*
		 * num1 = 11;
		 * Cannot make a static reference to the non-static field num1
		 * 인스턴스 필드는 객체를 생성해야만 접근이 가능
		 * static메소드는 객체 생성 없이 접근 가능
		 */
		//
		
		num2 = 23;
		//num1 = 10;
		//ms1.
		/**
		 * 아무것도 보이지 않는다.
		 * ms1안에 있는 모든 메소드가 인스턴스 메소드이기 때문에 객체 생성이 필요하기 때문이다
		 */	
		method3();
		//method4();
		
	}
	
	public static void method3() {}
	public void method4() {} //인스턴스 메소드

}
