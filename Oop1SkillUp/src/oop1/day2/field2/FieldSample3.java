package oop1.day2.field2;

import oop1.day2.field.FieldSample1;

public class FieldSample3 {
	private FieldSample1 fs = new FieldSample1();
	//FieldSample1과 FieldSample3는 서로 다른 패키지에 있기 때문에
	//import가 필요하다
	
	public void method() {
		System.out.println("3. 전체(다른 패키지) 접근 확인");
		//System.out.println(fs.priv);
		System.out.println(fs.pub);
	}
}
