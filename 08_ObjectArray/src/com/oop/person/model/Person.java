package com.oop.person.model;

public class Person {
	
	String name;
	int age, balance;
	double cm, kg;
	
	public Person() {}
	public Person(String name, int age, int balance, double cm, double kg) {
		this.name = name;
		this.age = age;
		this.balance = balance;
		this.cm = cm;
		this.kg = kg;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getCm() {
		return cm;
	}
	public void setCm(double cm) {
		this.cm = cm;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	
	
	public void information() {
	
	}

}
