package kh.java.inherit.object.car.run;

import kh.java.inherit.object.car.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		Car myCar = new Car("소나타", "블랙", 2000);
		System.out.println(myCar);

		Car yourCar = new Car("소나타", "블랙", 2000);
		System.out.println(yourCar);
		
		System.out.println(myCar == yourCar);
		System.out.println("1" + myCar.equals(yourCar));
		
		Car hisCar = new Car("소나타", "레드", 2000);
		System.out.println(myCar == hisCar);
		System.out.println("2" + myCar.equals(hisCar));
		
		//해시비교
		System.out.println("해시비교");
		System.out.println(myCar.hashCode());
		System.out.println(yourCar.hashCode());
	}
	
	/**
	 * equlas메소드와 hashCode메소드 오버라이딩은 반드시 함께한다
	 * equlas메소드의 결과가 true이면, hashCode의 값 비교도 true여야 한다.
	 * 
	 * String 클래스의 hashCode값을 이용
	 */
	
	

}
