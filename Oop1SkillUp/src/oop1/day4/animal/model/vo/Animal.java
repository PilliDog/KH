package oop1.day4.animal.model.vo;

// [접근제한자] [예약어?_final_을 쓰게되면 상속불가, _abstract(추상클래스-추상메소드가 들어가있음)] class명
public class Animal {
	
	//초기값을 주지 않으면 기본값으로 선언됨
	//필드 
	private String name = "삑삑이";
	private int age;
	private String kind = "닭";
	private char gender;
	
	public Animal() {}
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public Animal(char gender)
	{
		this.gender = gender;
	}
	public Animal(String name, int age, String kind, char gender)
	{
		this.name = name;
		this.age = age;
		this.kind = kind;
		this.gender = gender;
	}
	
	public String printInfo()
	{
		return "이름 : " + name + " \n"
			 + "나이 : " + age + "\n"
			 + "종    : " + kind + "\n"
			 + "성별    : " + gender;
	}
	
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
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
