package net.kh.emp.controller;

import net.kh.emp.model.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee engine = new Employee();
		
		engine.setEmpNo(100);
		engine.setEmpName("홍길동");
		engine.setDept("영업부");
		engine.setJob("과장");
		engine.setAge(25);
		engine.setGender('남');
		engine.setSalary(2500000);
		engine.setBonusPoint(0.05);
		engine.setPhone("010-1234-5678");
		engine.setAdress("서울시 강남구");
		
		System.out.println("empNo : " + engine.getEmpNo());
		System.out.println("empName : " + engine.getEmpName());
		System.out.println("dept : " + engine.getDept());
		System.out.println("job : " + engine.getJob());
		System.out.println("age : " + engine.getAge());
		System.out.println("gender : " + engine.getGender());
		System.out.println("salary : " + engine.getSalary());
		System.out.println("bonusPoint : " + engine.getBonusPoint());
		System.out.println("phone : " + engine.getPhone());
		System.out.println("adress : " + engine.getAdress());
		
	}

}
