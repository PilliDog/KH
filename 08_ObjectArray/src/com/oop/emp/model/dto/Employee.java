package com.oop.emp.model.dto;

public class Employee {
	static int empNo, age, salary;
	static String empName, dept, job, phone, address;
	static char gender;
	static double bonusPoint;
	
	public String empInformation() {
		return " ";
	}
	
	public static int getEmpNo() {
		return empNo;
	}

	public static void setEmpNo(int empNo) {
		Employee.empNo = empNo;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Employee.age = age;
	}

	public static int getSalary() {
		return salary;
	}

	public static void setSalary(int salary) {
		Employee.salary = salary;
	}

	public static String getEmpName() {
		return empName;
	}

	public static void setEmpName(String empName) {
		Employee.empName = empName;
	}

	public static String getDept() {
		return dept;
	}

	public static void setDept(String dept) {
		Employee.dept = dept;
	}

	public static String getJob() {
		return job;
	}

	public static void setJob(String job) {
		Employee.job = job;
	}

	public static String getPhone() {
		return phone;
	}

	public static void setPhone(String phone) {
		Employee.phone = phone;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		Employee.address = address;
	}

	public static char getGender() {
		return gender;
	}

	public static void setGender(char gender) {
		Employee.gender = gender;
	}

	public static double getBonusPoint() {
		return bonusPoint;
	}

	public static void setBonusPoint(double bonusPoint) {
		Employee.bonusPoint = bonusPoint;
	}

	public Employee() {}
	
	public Employee(int empNo, String empName, int age, char gender, String phone, String address)
	{
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	public Employee(int empNo, String empName, int age, char gender, String phone, String address, int salary, String dept, String job, double bonusPoint)
	{
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
		this.dept = dept;
		this.job = job;
		this.bonusPoint = bonusPoint;
	}

}
