package com.oop.shape.controller;

import com.oop.shape.model.Circle;
import com.oop.shape.model.Rectangle;
import com.oop.shape.model.Shape;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s = new Circle(15.5);
		System.out.println("원 면적 : " + ((Circle)s).area());
		System.out.println("원 둘레 : " + ((Circle)s).perimeter());

		s = new Rectangle(34.5, 42.7);
		System.out.println("사각형 면적 : " + ((Rectangle)s).area());
		System.out.println("사각형 둘레 : " + ((Rectangle)s).perimeter());
		
	}

}
