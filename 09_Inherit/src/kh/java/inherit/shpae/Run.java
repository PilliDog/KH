package kh.java.inherit.shpae;

public class Run {
	//Circle - Shape : Is a 상속관계 => Circle is a Shape.
	//Circle - Point : Has a 포함관계 => Circle has a Shape
	
	/**
	 * Overriding
	 * 자식클래스에서 상속받은 부모클래스 메소드를 재작성함
	 * 부모가 제공하는 기능을 후손이 일부 고쳐쓰겠다는 의미
	 * 1. 메소드이름, 파라미터타입/개수, 리턴타입 모두 동일해야함
	 * 				@override 어노테이션 사용가능
	 * 2. 부모메소드의 접근제어자 수정가능. 단 부모의 접근제어자보다 넓은 단위로만 가능함
	 * protected => protected/public
	 * 3. 부모 메소드의 예외처리 클래스 개수 수정가능
	 * 단, 부모메소드의 예외처리 클래스보다 크거나 처리범위가 넓을 수 없음
	 */

	public static void main(String[] args) {
		Cirecle c1 = new Cirecle();
		Cirecle c2 = new Cirecle(new Point(150,150),50);
		
		c1.draw();//도형을 그립니다.
		System.out.println("원의 넓이 : " + c1.calcArea());
		c2.draw();//도형을 그립니다.
		System.out.println("원의 넓이 : " + c2.calcArea());
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(new Point(0,0), 200, 100);
		
		r2.draw();
		System.out.print("사각형의 너비 : " + r2.calcArea());
		
		

	}

}
