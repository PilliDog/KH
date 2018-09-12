package kh.java.oop.encapsulation.student;

public class Run {

	public static void main(String[] args) {
		
		Run start = new Run();
		start.result();
		
		Student start2 = new Student();
		start2.setName("하하하");
		start2.introduce();

	}
	
	
	public void result() {
		
		Student engine = new Student();
		engine.setName("박광준");
		engine.setGender('남');
		engine.setAge(29);
		engine.introduce();
		
	}

}
