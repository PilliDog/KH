package com.oop.person.run;

import com.oop.person.controller.PersonController;

public class Run {

	public static void main(String[] args) {
		PersonController start = new PersonController();
		
		start.insertData(); //입력
		start.print(); //출력
		start.calAvg(); //평균계산
		
		
	}

}
