package kh.java.oop.student.run;

import java.util.Scanner;

import kh.java.oop.student.controller.StudentManager;
import kh.java.oop.student.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//복수의 학생들을 관리해보자!!!!
		Student start = new Student();
		StudentManager engine = new StudentManager();
		Student[] stdtArr = new Student[3];
		Scanner sc = new Scanner(System.in);
		
		engine.insertData();
		engine.printData();
		//int grade, classroom, stdtNo;
		//String name;
		
		/* 1
		System.out.print("학년을 입력해주세요 : ");
		grade = sc.nextInt();
		System.out.print("반을 입력해주세요 : ");
		classroom = sc.nextInt();
		System.out.print("번호를 입력해주세요 : ");
		stdtNo = sc.nextInt();
		sc.nextLine();
		System.out.print("이름을 입력해주세요 : ");
		name = sc.nextLine();
		Student start = new Student(grade, classroom, stdtNo, name);
		*/
		
		/* 2
		Student start = new Student();
		System.out.print("학년을 입력해주세요 : ");
		start.setGrade(sc.nextInt());
		System.out.print("반을 입력해주세요 : ");
		start.setClassroom(sc.nextInt());
		System.out.print("번호를 입력해주세요 : ");
		start.setStdtNo(sc.nextInt());
		sc.nextLine();
		System.out.print("이름을 입력해주세요 : ");
		start.setName(sc.nextLine());
		*/
		/*
		boolean firstTest = true;
		for(int i=0; i<stdtArr.length; i++)
		{
			stdtArr[i] = new Student();
			System.out.print("학년을 입력해주세요 : ");
			stdtArr[i].setGrade(sc.nextInt());
			System.out.print("반을 입력해주세요 : ");
			stdtArr[i].setClassroom(sc.nextInt());
			System.out.print("번호를 입력해주세요 : ");
			stdtArr[i].setStdtNo(sc.nextInt());
			sc.nextLine();
			System.out.print("이름을 입력해주세요 : ");
			stdtArr[i].setName(sc.nextLine());
			if(firstTest == true) {
				System.out.println(stdtArr[i].information());
				firstTest = false;
			}else {
				System.out.println(stdtArr[i-1].information());
				System.out.println(stdtArr[i].information());
			}
			
		}
		*/
		
		
	}

}
