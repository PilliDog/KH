package kh.java.basic.method;

public class MethodWithParameter {

	public static void main(String[] args) {
	
		MethodWithParameter m = new MethodWithParameter();
		m.printInfo("박광준", 29);
		m.printInfo("박형준", 27);
		
		

	}
	
	
	
	public void test1(String name, int age) {
	
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
	
	/*
	public void test2() {
		
		//1. 데이터선언 및 할당
		String name = "박형준";
		int age = 27;
				
		//2. 데이터 출력부
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
	 */
	
	
	public void printInfo(String name, int age) {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
}
