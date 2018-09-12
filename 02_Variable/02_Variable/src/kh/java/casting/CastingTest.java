/*
 	## 컴퓨터 동작원리
 	1. 반드시 같은 데이터 타입간에 연산을 해
 	2. 반드시 동일한 데이터 타입의 값을 동일한 데이터 타입의 변수에 대입해
 	3. 연산의 결과값 또한 동일한 데이터 타입이야
 	
 	## 자동형변환은 이럴때 해
 	형변환 데이터 손실이 없는 경우, 자동형변환 됨.
 	1. byte(1byte) -> short(2byte) -> int(4byte) -> long(8byte) -> float((4byte) -> double(8byte) 이런 순서로는 자동으로 해줘. 역으로는 안돼
 	                   char(2byte) ->
 	Ex. byte와 short가 만나 연산을 하게되면 byte는 자동으로 short로 형변환되어 연산돼
 */

package kh.java.casting;

public class CastingTest {

	public static void main(String[] args) {
		CastingTest c = new CastingTest();
		c.test1();
		c.test2();
		
		System.out.println("==========================");
		char chTest = 65;
		System.out.println(chTest);
		
		System.out.println((char)65); //65 v
		int aaa = (char)65;
		char bbb = (char)65;
		double ccc = (char)65;
		System.out.println("aaa : " + aaa);
		System.out.println("bbb : " + bbb);
		System.out.println("ccc : " + ccc);
	}
	
	public void test1() {
		
		//1. 자동 형변환
		//자료형이 다른 변수에 대입될 때, 해당 변수 타입보다 크다면? >> 자동으로 형변환
		byte bnum = 100;
		int i = bnum;
		
		//자료형이 다른 값이 계산될 땐?
		int a = 3;
		double b = 5.7;
		b = a+b;
		//System.out.println(a+b); //이건 double과의 연산이야. int가 double로 바뀌었어. 결과는 double형 데이터 타입이니 double데이터 타입 변수에만 넣을 수 있어.
		
		/*byte, short, char 연산 시 주의점!
			int(4byte) 아래 크기의 byte, short, char가
			사칙연산을 만나면 자동으로 int로 형변환됨
	    */

		byte b1 = 10, b2 = 20;
		int result = b1 + b2;
		//byte result = (b1 + b2); >> result는 byte고 사칙연산을 하면서 byte가 int로 바뀌어서 오류를 내뱉어
		
		char ch = 97; //왜 ''를 안하고 했을까? >> 아스키코드
		System.out.println("ch : " + ch);
		System.out.println("ch : " + (ch + a)); //>> char가 int형을 만나서 char가 int가 되었어. 따라서 100!
		System.out.println("ch : " + ch + a); 
		
		char ch_2 = (char)97; //강제형변환 코드가 생략되었음
		System.out.println("ch_2 : " + ch_2);
		System.out.println("ch_2 : " + (ch_2 + a)); //>> char가 int형을 만나서 char가 int가 되었어. 따라서 100!
		System.out.println("ch_2 : " + ch_2 + a);
		
		
		
		
		//2. 강제 형변환(명시적형변환)
		int num = 2147483647;
		int r = num + 1;
		System.out.println("r : " + r); // -2147483648 Over
		
		long l = (long)num + 1;
		System.out.println("l : " + l); // 성공

		
		
		//그럼 여기서 문제!
		System.out.println("\n\n\n★★실습문제★★");
		byte bno1 = 10;
		byte bno2 = 118;
		int bResult = bno1 + bno2;
		System.out.println("bResult : " + bResult);
		
	}
	
	public void test2() {
		
		System.out.println("A : " + ('A'+ 0)); //65
		
		System.out.println(" B : " + ('0' + 0)); //48 
		
		System.out.println(" C : " + (char)65); //65 v
		
		byte b1 = 125;
		char c1 = 'C';
		int i1 = b1 - c1;
		System.out.println("i1 : " + i1); //58
		
		
		boolean bool = false;
		
		bool = (2.0 == 5/2); //false v 버림처리해서 2가 나옴
		System.out.println("bool : " + bool);
		
		bool = ('A' == 65); //true
		System.out.println("bool : " + bool);
		
		bool = (9 == 011); //true
		System.out.println("bool : " + bool);
		
		bool = ('A' == 'B' - 1); //true
		System.out.println("bool : " + bool);
		
		bool = ('a' != 97); //false
		System.out.println("bool : " + bool);
		
	}
	
	
	
	

}
