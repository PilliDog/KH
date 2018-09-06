package kh.java.oop.method.recursion;

public class RecursionTest {

	public static void main(String[] args) {
		
		//!5 = 5*4*3*2*1
		
		//1. 반복문을 통한 factorial 연산
		int result = new RecursionTest().factorialLoop(5);
		System.out.println(result);
		
		//2. 재귀함수
		result = new RecursionTest().factorial(5);
		System.out.println(result);
	}
	
	public int factorialLoop(int a) {
		
		for(int i=a; i>0; i--)
		{
			if(i == 1) break;
			a *= (i-1);
		}
		
		return a;
		
	}
	
	
	public int factorial(int num) {
		if(num == 1) return 1;
		return num * factorial(num-1);
	}

}
