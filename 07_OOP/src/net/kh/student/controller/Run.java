package net.kh.student.controller;

import net.kh.student.model.Sudent;

public class Run {

	public static void main(String[] args) {
		
		Sudent start = new Sudent();
		
		start.setGrade(4);
		start.setClassroom(4);
		start.setName("박광준");
		start.setHeight(172.33);
		start.setGender('남');
		
		System.out.println(start.information());

	}

}
