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
	
	/**
	 * <결론>
	 * static??
	 * 1. static 왜 쓰는가?
	 * 	쉽게 생각해보기 위해서 Math 생각해보기
	 * static영역에 한번에 넣고 필요할 때마다 쓸 수 있도록 만들어서
	 * 메모리 소모를 줄여준다
	 * 
	 * 2. 언제써야해?
	 * 쓰이는 빈도가 높으면서 여러 곳에서 같은 상태를 유지하고 싶을때(공유)
	 * 그리고 객체 생성이 굳이 필요하지 않을때
	 * 
	 * 3. 주의할 점
	 * 소멸되는 시기가 프로그램이 종료되는 종료 시점이기 때문에
	 * 사용하지 않는 것도 계속 메모리에 올라가 있음... 비효율적....
	 * 또한 문제가 생기면 공유되는 변수이기 때문에, 수정이 어려웡
	 */
	
	

}
