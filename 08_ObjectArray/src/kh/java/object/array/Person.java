package kh.java.object.array;

/**
 * VO 클래스 : (Value Object)
 * == entity 클래스 (DB)
 * == do 클래스 (Domain Object)
 * == dto 클래스 (Data Transfer Object)
 * == bean 클래스 (Bean, jsp, EJB에서 사용되는 이름)
 */
public class Person {
	
	private String name;
	private int age;
	
	
	//생성자
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//gerPersonInfo : String => 모든 필드정보를 리턴하는 메소드
	public String gerPersonInfo() {
		return name + age;
	}

}
