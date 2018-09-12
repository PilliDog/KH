package kh.java.polymorphism.animal;

/**
 * 다형성
 * 상속을 이용한 기술
 * 자식객체를 부모클래스 타입의 변수에 담아 처리하는 것
 */

public class AnimalTest {

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		Lion lion = new Lion();

		//다형성
		//부모클래스의 참조변수에 후손객체의 주소값으르 담을 수 있다
//		Animal a = tiger;
//		Animal b = lion;
		//up casting : 자동형변환
		Animal a = new Tiger();
		Animal b = new Lion();
		Object c = new Tiger();
		
		//부모타입의 참조변수는 자식객체의 메소드를 사용할 수 없다
		//부모타입에 직접 선언된 자원(필드, 메소드)만 사용 가능
		tiger.attack();
		//a.attack();
		a.say();
		
		//다시 자식클래스타입으로 형변환하면, 자식객체 메소드 사용가능
//		Tiger t = (Tiger)a;
//		t.attack();
		//.의 연산자 처리 우선순위가 높기 때문에 괄호를 씌어주어야함 >> (tiger)a. >> 안됨
		((Tiger)a).attack(); //이걸 down casting 이라고 한다. : 명시적 강제 형변환 해야함
		((Lion)b).stomp();
		((Tiger)c).attack();
		
		//Animal ani = new Animal();
		//추상 클래스는 객체화 할 수 없다
		
		//동적바인딩
		Animal ani1 = new Tiger();
		Animal ani2 = new Lion();
		Animal ani3 = new Eagle();
		
		ani1.say();
		ani2.say();
		
		//인터페이스 Runnable메소드 run실행
		((Runnable)ani1).run();
		((Runnable)ani2).run();
		
		//인터페이스 Cryable메소드 cry실행
		((Cryable)ani1).cry();
		((Cryable)ani2).cry();
		
		
		
		//@실습문제 : Animal클래스를 상속하고, Flyable인터페이스를 구현한 Eagle클래스를 작성하세요.
		//Flyable인터페이스
		//상수필드 : NUM_OF_WINGS : int = 2;
		//추상메소드 : void fly();
		
		//출력결과 : 안녕하세요, 이글이글입니다.
		//		   독수리가 2날개로 납니다.
		System.out.println("----------------------");
		ani3.say();
		((Flyable)ani3).fly();
		
	}
	
	
}
/**
 * 추상클래스 & 인터페이스
 * 공통점
 * 1. 객체화 할 수 없졍
 * 2. 메소드의 구현을 강제할 수 있졍
 * 
 * #1. 추상(미완성)클래스
 * 	public abstract class 클래스명{}
 *	클래스 안에 추상메소드를 가지고있으면, 그 클래스는 반드시 추상 클래스여야함
 *	추상 메소드가 없어도 추상 클래스는 가능 : 객체화 시키지 못함
 *
 *	추상 메소드 : 메소드의 head만 있고, body가 없음
 *	public abstract 반환형 메소드명([자료형 매개변수])
 *	표준화된 인터페이스 제공 목적으로 추상메소드를 사용함
 *	메소드 사용의 통일성을 확보함
 *
 *	#2. 인터페이스(interface)
 *	상수형 필드와 추상메소드로만 구성된 추상클래스의 변형체
 *	일반 클래스에 추상메소드를 포함시키는 구조(추상클래스)보다 더욱 메소드에 통일성을 부여하기 위해 만든 클래스
 *
 * 	public interface 인터페이스명{
 * 	//상수형 필드
 * 	public stataic final 자료형 필드명 = 초기값;
 * 
 *	추상 메소드
 *	public abstract 반환명 메소드명(자료형 매배변수)
 *  인터페이스 사용 : 상속을 통해서 후손이 부모 인터페이스의 추상메소드를 완성
 *  클래스의 상속 : extends 클래스명(단일 상속)
 *  인터페이스의 구현 : i
 *  mplements 인터페이스명(다중 상속)
 *  인터페이스 간의 상속은 extesds 사용
 *  	interface 인터페이스명 extends 부모인터페이스명{}
 */

abstract class Animal{
	private int num;
	public abstract void say();
}

interface Runnable{
	//일반필드의 사용은 제한됨
	//반드시 final 키워드를 가진 상수 필드만 허용
	//상수필드는 반드시 초기화해야함
	public /*static*/ final int NUM_OF_LEGS = 4; //상수이므로 값 재지정이 불가능하다.
	
	//추상메소드
	/*public abstract*/ void run();
}

interface Cryable{
	void cry();
}

interface Flyable{
	public final static int NUM_OF_WINGS = 2;
	void fly();
}

class Eagle extends Animal implements Flyable{

	@Override
	public void say() {
		System.out.println("안녕하세요, 이글이글입니다.");		
	}
	
	@Override
	public void fly() {
		System.out.println("독수리가 " + NUM_OF_WINGS + "날개로 납니다.");
	}
	
	
}

class Tiger extends Animal implements Runnable, Cryable{
//	public static final int NUM_OF_LEGS = 4;  >> 이건 Runnable인터페이스와 별개로 생성된다 주의
	
	public void attack() {
		System.out.println("호랑이가 공격합니다!!");
	}
	@Override
	public void say()
	{
		System.out.println("안녕하세요, 타이거입니다.");
	}
	@Override
	public void run()
	{
		System.out.println("타이거가 " + NUM_OF_LEGS + "다리로 달립니다.");
	}
	@Override
	public void cry()
	{
		System.out.println("타이거가 울부짖습니다.");
	}
}


class Lion extends Animal implements Runnable, Cryable{
	public void stomp() {	
		System.out.println("라이언이 밟습니다.");
	}
	@Override
	public void say()
	{
		System.out.println("안녕하세요, 라이언입니다.");
	}
	@Override
	public void run()
	{
		System.out.println("라이언이 " + NUM_OF_LEGS + "다리로 달립니다.");
	}
	@Override
	public void cry()
	{
		System.out.println("라이언이 울부짖습니다.");
	}
}