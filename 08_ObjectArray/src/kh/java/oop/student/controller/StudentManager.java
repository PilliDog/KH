package kh.java.oop.student.controller;

import java.util.Scanner;

import kh.java.oop.student.model.vo.Student;

public class StudentManager {
	
	private Student[] stdtArr = new Student[3];
	Scanner sc = new Scanner(System.in);
	int grade, classroom, stdtNo;
	String name;
	
	public void insertData() {
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
				//System.out.println(stdtArr[i].information());
				//firstTest = false;
			}else {
				//System.out.println(stdtArr[i-1].information());
				//System.out.println(stdtArr[i].information());
			}
			
		}
	}
	
	public void printData() {
		for(int j=0; j<stdtArr.length; j++)
		{
			System.out.println(stdtArr[j].information());
		}
	}

}
