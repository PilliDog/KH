package oop1.day3.method.sample;

import oop1.day1.animal.Animal;

public class MethodSample1 {
	//인스턴스
	//반환형이 없고 매개변수도 없는 메소드
	public void method1() 
	{
		System.out.println("반환형이 없고 매개변수도 없음");
		System.out.println("return도 없고 연산에 사용할 매개변수 없음");
	}
	
	//반환형이 없고 매개변수는 있는 변수
	public void method1(String name)
	{
		System.out.println("제 이름은 " + name + "입니다.");
	}
	
	public void method2(String name)
	{
		System.out.println("제 이름은 " + name + "입니다.");
	}
	
	//반환형이 없고 매개변수는 있는 메소드
	public void method3(String name, int age)
	{
		System.out.println("제 이름은 " + name + "이고요, 나이는 " + age + "살 입니다.");
	}
	
	//오버로딩
	public void method3(String name, int age, String addr){}
//	public void method3(String name, int weight) {}
//	public int method3(String name, int age) {}
	public void method3(int age, String name) {}
	
	public void method3(String...strings) 
	{
		System.out.println("입력된 매개변수의 갯수 : " + strings.length);
		System.out.println("입력된 매개변수 출력");
		for(int i=0; i< strings.length; i++)
		{
			System.out.println(strings[i]);
		}
	}
	
	//참조형 매개변수
	public void method3(Animal ani)
	{
		ani.setName("딸기");
		System.out.println("우리집 고양이 이름은 " + ani.getName() + " 입니다.");
	}
	
	public String method4() {
		return "반환형이 이따!! 매개변수가 없따!!";
	}
	
	//반환형이 있고 매개변수 있는 것
	public int method4(int num1, int num2)
	{
		return num1 + num2;
	}
	
	//반환형과 매개변수가 모두 참조형
	public Animal method4(Animal ani)
	{
		ani.setName("딸기");
		ani.setAge(5);
		ani.setGender('남');
		return ani;
	}

}
