package oop1.day4.run;

import oop1.day4.animal.model.vo.Animal;

public class Config {

	public static void main(String[] args) {
		Animal ani1 = new Animal();
		//new 연산자가 인스턴스를 할당
		//생성자는 객체 안에 있는 필드 값을 초기화
		
		ani1 = new Animal("딸기", 5, "코숏", 'M');
		System.out.println(ani1.printInfo());
	}

}
