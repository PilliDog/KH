package kh.java.oop.encapsulation.student;

public class Student {
	
	private String name;
	private char gender;
	private int age;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "입니다. 저는 " + gender + "자이구요, " + age + "살입니다. 반갑습니다.");
	}

}
