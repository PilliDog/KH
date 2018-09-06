package kh.java.oop.accessfeild;

import kh.java.oop.field.StaticFieldTest;

public class Main {

	public static void main(String[] args) {

		NonStaticFiledTest engine = new NonStaticFiledTest();
		//1. 멤버변수(필드)
		engine.setNum(99);
		System.out.println(engine.getNum());
		
		//2. 지역변수 테스트
		engine.localVarTest(50);
		
		//3. static field test
		System.out.println(StaticFieldTest.num);
		StaticFieldTest.num = 888;
		System.out.println(StaticFieldTest.num);
		
		System.out.println("상수 : " + StaticFieldTest.STATIC_NUM);

	}

}
