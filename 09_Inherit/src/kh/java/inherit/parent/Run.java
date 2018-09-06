package kh.java.inherit.parent;

public class Run {

	public static void main(String[] args) {
		Parent p = new Parent("p1", 100);
		p.say();
//		p.doGame();
		System.out.println(p);
		System.out.println("-------------------");
		
		Child1 c1 = new Child1();
		c1.setId("c1");
		c1.setNum(200);
		c1.say();
		c1.doGame();
		System.out.println(c1);
		System.out.println("-------------------");
		
		Child2 c2 = new Child2();
		c2.setId("c2");
		c2.setNum(300);
		c2.say();
		System.out.println(c2);
		System.out.println("-------------------");
		
		GrandChild1 gc1 = new GrandChild1();
		gc1.setId("gc1");
		gc1.setNum(999);
		gc1.say();
		gc1.doGame();
		System.out.println(gc1);
		
	}

}
