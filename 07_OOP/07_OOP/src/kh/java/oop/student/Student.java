package kh.java.oop.student;

public class Student {
	
	//학생의 정적인 부분을 정의해보았다.
	String name;
	char gender;
	int age;
	
	
	public void introduce() {
		
		System.out.println("안녕하세요. 저는 " + name + "입니다. 저는 " + gender + "자이구요, " + age + "살입니다. 반갑습니다.");
		
	}

}
