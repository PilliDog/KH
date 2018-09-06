package kh.java.oop.constructor.run;

import java.util.Date;

import kh.java.oop.constructor.User;

public class Run {

	public static void main(String[] args) {
		
		User start = new User();
		start.setUserId("kjun815");
		start.setUserPassword("1234");
		start.setUserName("박광준");
		start.setEnrollDate(new Date());
		start.information();
		
		User start2 = new User("kjun815", "4321", "박꽝준", new Date());
		start2.information();
		
		User start3 = new User("tube", "1234", "튜브");
		start3.information();
	}

}
