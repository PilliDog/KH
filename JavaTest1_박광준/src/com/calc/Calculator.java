package com.calc;

public class Calculator {

	public static void main(String[] args) {
		
		//사칙연산의 결과를 담기위한 변수를 생성
		int plus, minus, times, division; 
		
		//args 배열에 담긴 String타입의 값을 int로 바꿔주고 계산하자
		plus = (Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		minus = (Integer.parseInt(args[0]) - Integer.parseInt(args[1]));
		times = (Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
		division = (Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		
		//출력, 이미 int형으로 선언하고 받았기에 형변환이 필요없음
		System.out.println("합 : " + plus);
		System.out.println("차 : " + minus);
		System.out.println("곱 : " + times);
		System.out.println("나누기 : " + division);
		
	}

}
