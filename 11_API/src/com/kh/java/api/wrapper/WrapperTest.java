package com.kh.java.api.wrapper;
/** 
 * WrapperClass
 * 기본형(Primitive Type)도 객체로써 다루어야 할 경우가 있다.
 * 	- 매개변수로 객체를 요구할때
 * 	- 기본형이 아닌 객체로 저장해야할때
 * 	- 객체간의 비교가 필요할 때
 * 
 * 위와 같은 상황에서 기본형을 객체로 형변환 후 작업해야함
 * 이를 지원하는 것이 wrapper class임
 *
 */
public class WrapperTest {

	public static void main(String[] args) {
//		new WrapperTest().test1();
		new WrapperTest().test2();
	}
	
	public void test2()
	{
		//valueOf 메소드는 기본 자료형값을 레퍼클래스 타입으로 변경
		Byte b = Byte.valueOf((byte)1);
		Short s = Short.valueOf((short)1);
		Integer i = Integer.valueOf(100);
		Long l = Long.valueOf((long)1);
		Float f = Float.valueOf((float)1.0);
		Double d = Double.valueOf((double)1.0);
		Boolean bool = Boolean.valueOf((boolean)true);
		Character c = Character.valueOf('C');
		
		//해당객체를 문자열로 변환
		//toString메소드를 호출하면, 객체가 가진 값이 문자열로 반환됨
		String bStr = b.toString();
		System.out.println("bStr : " + bStr);
		System.out.println("b : " + b.toString());
		//여기에 toString은 오버라이딩 되었다!! 궁금하면 컨트롤 키를 누른 상태에서 toString을 눌러보자
	}
	
	public void test1()
	{
		int num = 100; //기본형
		Integer i = new Integer(100); //boxing(기본형을 객체타입으로 형변환)
		Integer i2 = new Integer("100"); //Integer.paraseInt(String s)
		
		//num. >> 객체가 아니므로 객체접근 연산자를 사용할수 없다
		System.out.println(i + num);
		System.out.println(i.intValue() + num);
		//i+num의 연산을 위해 >> (객체 + 기본형)
		//내부적으로 wrapper객체 > 기본형 : i.intValue => unboxing
		//boxing, unboxing 자동형변환 >> autoboxing, autounboxing
		
		int num2 = 100;
		//기본형 비교
		System.out.println("num == num2 : " + (num == num2));
		//객체 비교
		System.out.println("i == i2 : " + (i == i2));
		System.out.println("i.equals(i2) : " + i.equals(i2));
		
		//autoboxing / autounboxing
		//int x = new Integer(100);
		//객체에 담긴 100을 꺼냈다 >> unboxing
		int x = (int)new Integer(100);
		//Integer y = 100;
		Integer y = (Integer)100;
		
		((Integer)100).intValue();//사용자가 명시적으로 형변환 해야함
	}
	

}
