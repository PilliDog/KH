package net.kh.student.model;

public class Sudent {
	
	private static String school = "kh정보교육원";
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Sudent.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		
		return ("school : " + school + "\n"
				+ "grade : " + grade + "\n"
				+ "classroom : " + classroom + "\n"
				+ "name : " + name + "\n"
				+ "height : " + height + "\n"
				+ "gender : " + gender + "\n");
		
	}

}
