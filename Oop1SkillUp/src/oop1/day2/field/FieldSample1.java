package oop1.day2.field;

public class FieldSample1 {
	
	
	/**** 클래스 영역 ****/
	//접근제한자를 써서 변수 만들기
	private String priv = "private";
	protected String prot = "protected";
	String def = "default"; //default의 접근제한자는 생략해서 사용
	public String pub = "public";
	
	public void method1() {
		/**** 메소드 영역 ****/
		System.out.println("1. 해당 클래스 내부에서 접근");
		System.out.println(priv);
		System.out.println(def);
		System.out.println(prot);
		System.out.println(pub);
		
		
		
	}
}










