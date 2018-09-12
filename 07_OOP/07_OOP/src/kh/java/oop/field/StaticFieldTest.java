package kh.java.oop.field;

public class StaticFieldTest {
	
	//static 필드 (클래스변수)
	//객체 생성없이 접근 가능함
	//프로그램 최초 실행 시 메모리에 static영역에 적재됨
	//static영역도 heap처럼 초기값을 지정하지 않으면, 타입별 기본값으로 세팅됨
	//static 특성상 공용자원으로 많이 쓰이기 때문에
	//private 접근 제한자보다는 public을 주로 사용함
	
	public static int num = 100;
	
	//상수 필드
	//public static fianl 키워드를 동시에 사용
	//상수 필드는 반드시 선언과 동시에 초기화 해야함
	
	public static final int STATIC_NUM = 77;
	

}
