package kh.java.oop.student;

public class Run {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "조하영";
		s1.gender = '남';
		s1.age = 26;
		
		s1.introduce();
		
		Student s2 = new Student();
		s2.name = "박광준";
		s2.gender = '남';
		s2.age = 29;
		
		s2.introduce();
		
	}

}
