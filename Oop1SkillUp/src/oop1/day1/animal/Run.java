package oop1.day1.animal;

public class Run {

	public static void main(String[] args) {
		
		//Animal을 메모리에 올리는 작업 >> 인스턴스화 (new를 통해 생성되었기 때문에 heap에 생성)
		Animal animal = new Animal();
		
		//Animal 클래스는 캡슐화가 되었기 때문에 직접적인 접근이 불가능하다.
//		System.out.println(animal.gender);
//		animal.gender = 'M';
//		System.out.println(animal.gender);
		
		
		//따라서 public 메소드를 이용해 우회 접근한다.
		System.out.println("변경 전 : " + animal.getGender());
		animal.setGender('M');
		System.out.println("변경 후 : " + animal.getGender());
		
		
		System.out.println("변경 전 : " + animal.getAge());
		//animal.setGender('M');
		System.out.println("변경 후 : " + animal.getAge());
		
	}

}
