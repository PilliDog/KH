package oop1.day2.field;

public class FieldSample2 {
	
	private FieldSample1 fs = new FieldSample1();
	//FieldSample1과 FieldSample2는 같은 패키지 안에 위치하고 있어서
	//import가 필요하지 않다.
	
	public void method() {
		System.out.println("2. 같은 패키지 내에서 접근");
		//System.out.println(fs.priv);
		//The field FieldSample1.priv is not visible, 접근 불가
		System.out.println(fs.def);
		//같은 패키지 내이기 때문에 접근 가능
		System.out.println(fs.prot);
		System.out.println(fs.pub);
	}
}
