package kh.java.oop.accessfeild;

/*
 * 클래스 영역에 작성한 변수를 필드라고 함
 * 멤버변수, 인스턴스 변수는 객체가 가지는 멤버임
 * 전역변수 : 클래스 영역 어디서든 모든 메소드에서 접근할 수 있기 때문임
 */

public class NonStaticFiledTest {

	private int num;
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	public void fieldTest() {
		System.out.println("멤버변수 num : " + num);
	}
	
	public void localVarTest(int param) {
		//메소드 영역에 선언된 변수는 지역변수임
		//매개변수 param도 하나의 지역변수임
		//어차피 매개인자값이 넘어오므로 초기화 하지 않아도됨
		//하지만 매개변수를 제외한 지역변수는 반드시 사용하기 전 초기화 해야함
		//지역변수는 접근제한자를 가질 수 없음
		
		int num;//지역변수는 전역변수와 스코프가 다름(유효범위가 다름), 동일한 이름이라도 관계없음.
		num = 999;
		
		System.out.println("param : " + param);
		System.out.println("지역num : " + num);
		System.out.println("클래스num : " + this.num);
	}
	
}
