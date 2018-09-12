package kh.java.inherit.parent;

public class Child1 extends Parent {
	
	public Child1() {}

	@Override
	public void say() {
		System.out.println("난 자식1호다.");
	}
	
	public void doGame() {
		System.out.println("자식1호가 배그를 한다.");
	}
}
