package kh.java.oop.method;

/*
 * 메소드 오버로딩
 * 한 클래스 내에서 파라미터 선언부가 다르고, 
 * 이름이 같은 메소드를 여러개 정의하는 것
 * 
 * 오버로딩 성립조건
 * 1. 메소드 이름이 같아야함
 * 2. 매개변수 선언부가 달라야함 (매개변수 타입, 개수, 순서가 . 다른걸 인정함) // 매게변수명은 구별되지 않는다
 * 
 * 주의점
 * 1. 매개변수명은 상관하지 않는다
 * 2. 접근제한자, 리턴타입은 상관하지 않는다
 * 3. 매게변수 타입이 똑같으면 안된다
 */
public class MethodOverloding {
	
	public int test() {
		
		return 0;
		
	}
	
	
	public int test(int a) {
		
		return 0;
		
	}
	
	
	public int test(int a, int b, int c)
	{
		
		return 0;
		
	}
	
	
	public int test(int a, String s) {
		
		return 0;
		
	}
	
	
	public int test(int b, int a) {
		
		return 0;
		
	}
	
	
//	public int test(int d, int e, int f) { //a, b, c와 같다
//		
//		return 0;
//	}
	
	
	//리턴타입만 다르다고 안됨.. 매개변수를 봄
//	public String test(int a, String s) {
//		
//		return "";
//	}
	

	//접근제한자가 다르다고 구별되지 않는다
//	private int test(int b, int a) {
//		return 0;
//	}
	
	
	public int test(char a, char b) {
		return 0;
	}
	
	public int test(char c, int a) {
		return 0;
	}
	
	public int test(String s, char a) {
		return 0;
	}
	
	public int test(char a, String s) {
		return 0;
	}
	
	public int test(byte a, char b) {
		return 0;	
	}
	
	public int test(short a, char b) {
		return 0;
	}

}
