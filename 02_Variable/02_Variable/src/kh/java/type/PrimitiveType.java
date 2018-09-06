package kh.java.type;

/*
 	## 자료형 타입
 	1. 기본형(primitive type)
 		실제 데이터 (값)을 저장
 		논리형, 문자형, 숫자형(정수형, 실수형) -> 총 8가지
 		각 자료형별로 데이터 저장 크기가 다름.
 	
 	2. 참조형(reference type)
 		데이터가 저장된 주소를 저장(객체의 주소)
 		기본형을 제외한 나머지(String, 사용자정의 자료형, java api)
 		4byte 공간을 할당
 		
 	## 원시형 타입
 	1. 문자형 char(2byte) : 하나의 문자를 표현, 0 ~ 65,535 가지의 문자를 표현
 	2. 숫자형 
 		a. 정수형 
 			- byte(1byte) : -128 ~ 127
 			- short(2byte) : -32,768 ~ 32,767
 			- int(정수 기본형, 4byte) : -2,147,483,648 ~ 2,147,483,647 
 			- long(8byte) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 
 		b. 실수형
 			- float(4byte) : 소수점이하 7자리 보장
 			- double(8byte) : 소수점이하 16자리 보장
 	
 	3. 논리형
 		boolean(1byte) : true/false
 		
 		
 	## 변수명명규칙
 	1. 대소문자를 구분하면서 길이제한이 없다.
 	2. 자바 예약어를 사용할 수 없다.
 	3. 숫자로 시작할 수 없다.
 	4. 특수문자는 '_'와 '$'만 가능하다.
 	
 	5. 여러단어이름은 단어의 첫글자를 대문자로 표기함.
 		userName, ageOfVampire => Camel Casing 기법
 	6. 한글입력 가능함. 하지만 사용하지 말것.
 	7. 직관적인 변수명을 사용하기
  
 */

public class PrimitiveType {

	public static void main(String[] args) {
		
		PrimitiveType p = new PrimitiveType();
		//p.test1();
		//p.test2();
		p.test3();
		
		//변수는 반드시 선언후에 값을 할당해서 사용해야함.
		// 선언과 동시에 값을 할당할 수 있음(초기화)
		
						
	}

	private void test1() {
		
		//#1. 선언을 해보자!
		byte b;
		short s;
		int i;
		long l;
		
		float f;
		double d;
		double D;
		
		char c;
		boolean bool;
		boolean 참거짓; //한글은 쓰지말자.. 되기는 함
		
		//#2. 값을 할당하고 출력해보자!
		//지역변수는 반드시 값을 대입해서 사용해야함.
		//지역변수 : 메소드 안에 선언된 변수
		b = 100;
		System.out.println("byte형 변수 b : "+ b );
		
		s = 20000;
		//s = 40000; //데이터형의 범위를 넘어서 오류
		System.out.println("short형 변수 s : "+ s );
		
		i = 2147483647;
		System.out.println("int형 변수 i : "+ i );
		
		l = 50000L; //기본 숫자는 int형으로 인식한다, 지정해줘야함.
		System.out.println("long형 변수 l : "+ l );
		
		//실수형의 기본형은 double
		f = 0.123456789F;
		d = 0.12345678901234567890123456789012345678901234567890;
		System.out.println("float형 변수 f : "+ f );
		System.out.println("double형 변수 f : "+ d );
		
		c = 'ㅎ';
		System.out.println("char형 변수 c : "+ c );
		
		bool = true;
		bool = 5>2;
		System.out.println("bool형 변수 bool : "+ bool );
		
		//#3. 초기화, 변수를 선언하고 동시에 할당하자!
		
		byte bb = 1;
		short ss = 2;
		int ii = 3;
		long ll = 4L;
		
		float ff = 1.01F;
		double dd = 1.02;
		
		char cc = 'a';
		boolean booll = false;
		
		
		//#4. 상수 : 한번 값이 정해지면 변명불가, 상수는 대문자로 변수명을 표현함.
		final int AGE = 20;
		//AGE = 21; >>> 안됨
		
		//Data Overflow; //시계를 생각해보자, 도돌이
		i ++;
		System.out.println("Data Overflow : " + i);
		//뭐가 나올까?? >> 2147483648 >>> -2147483648 가장 낮은수가 나왔다!!
		
		i ++;
		System.out.println("Data Overflow2 : " + i);
		//뭐가 나올까?? >> -2147483648 >>> -2147483647 가장 낮은수에서 하나가 올라갔다!!
				
	}
	
	//자바에서 숫자 진법표현
	public void test2() {
		int a;
		
		//10진수(Deciaml Number)
		a = 9;
		System.out.println("10진수 9 : " + a);
		
		//8진수(Octal Number)
		//정수 맨 앞에 0을 접두사로 사용한다. (처음시작을 0으로 하면 8진수로)
		a = 011;
		System.out.println("8진수 011 : " + a);
		
		//16진수(0~9 + A~F, Hexadecimal Number)
		//정수 맨 앞에 0x를 접두사용 사용한다.
		a = 0x11;
		System.out.println("16진수 0x11 : " + a);
		a = 0x1f;
		System.out.println("16진수 0x1f : " + a);
		
		//2진수(Binary Number)
		//0b, 0B
		a = 0b11111;
		System.out.println("2진수 0b111111 : " + a);
		
		//printf
		int b = 30;
		System.out.println(">>>>> printf <<<<<");
		System.out.printf("10진수 %d, 8진수 %o, 16진수 %x\n", b, b, b);
		//b를 여기서 매게변수라함
		System.out.printf("2진수 %s", Integer.toBinaryString(b));
		
		
	}
	
	//369를 10, 16, 8, 2진수로 표현하보자.
	public void test3() {
		
		int testNumber = 369;
		
		System.out.printf("10진수 : %d\n" , testNumber);
		System.out.printf("16진수 : %x\n" , testNumber);
		System.out.printf("8진수 : %o\n" , testNumber);
		System.out.printf("2진수 : %s\n" , Integer.toBinaryString(testNumber));
	}
	
	

}
