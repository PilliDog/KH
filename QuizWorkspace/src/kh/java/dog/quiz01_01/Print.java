package kh.java.dog.quiz01_01;

public class Print {
	
	public void print() {
		
		DeclarationReset start = new DeclarationReset();
		
		//DeclarationReset의 클래스 변수를 메소드를 통해 접근함
		System.out.println("byte : " + start.get_byte());
		System.out.println("long : " + start.get_long());
		System.out.println("float : " + start.get_float());
		System.out.println("double : " + start.get_double());
		System.out.println("char : " + start.get_char());
		System.out.println("String : " + start.get_String());
		System.out.print("boolean : " + start.is_boolean());
	}
}
