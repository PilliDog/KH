package kh.java.oop.field.init.block;

import java.util.Random;

/*
 * 1. 멤버변수의 초기화 블럭
 * 멤버변수는 인스턴스 생성시마다 객채에 생성된다.
 * 초기값 대입순서 : 
 *  > a. jvm이 지정한 타입별 기본값(heap) -> 멤버변수 선언시 기록값 -> 초기화 블럭의 멤버변수 기록값
 *  > b. 멤버변수 선언 시 기록값
 *  > c. 초기화블럭의 멤버변수 기록값
 *  파라미터 생성자를 통해 초기화를 진행하는 경우, 위의 순서 다음으로 진행된다.
 */

public class InitBlockSample {
	
	private int num = 200;
	private int[] lotto;
	
	//멤버 변수 초기화 블럭
	//단순히 선언으로 처리하기 힘든 로직을 초기화블럭에서 처리함
	//예)난수를 생성해서 값을 대입
	{
		System.out.println("[초기화 블럭 Setting 전 num] : " + num);
		num = makeNum();
		System.out.println("[초기화 블럭 Setting 후 num] : " + num);
	}
	
	
	public static int snum = 100;
	//static변수 초기화블럭
	//static자원은 non-static자원을 참조할 수 없다.
	//non-static자원은 static자원을 참조할 수 있다.
	static 
	{
		System.out.println("[static 초기화 블럭 setting 전 snum] : " + snum);
		snum = 888;
		System.out.println("[static 초기화 블럭 setting 후 snum] : " + snum);
	}
	

	
	public static int makeNum() {
		
		Random rnd = new Random();
		return rnd.nextInt(10)+1;
		
	}
	
}
