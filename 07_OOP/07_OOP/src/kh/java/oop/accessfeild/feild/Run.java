package kh.java.oop.accessfeild.feild;

public class Run {

	public static void main(String[] args) {
		
		AccessModifierTest engine = new AccessModifierTest();
		System.out.println("public : " + engine.pulicVar);
		System.out.println("protected : " + engine.protectedVar);
		System.out.println("defalt : " + engine.defaultVar);
		//System.out.println("private : " + engine.privateVar);
		//같은 클래스가 아니기 때문에 private가 안됨

	}

}
