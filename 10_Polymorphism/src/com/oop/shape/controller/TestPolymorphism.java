package com.oop.shape.controller;

import com.oop.shape.model.Circle;
import com.oop.shape.model.Rectangle;
import com.oop.shape.model.Shape.IShape;
import com.oop.shape.model.Triangle;

public class TestPolymorphism {

	public static void main(String[] args) {

		IShape[] iarr = new IShape[5];
		
		iarr[0] = new Circle(5);
		iarr[1] = new Rectangle(5,5);
		iarr[2] = new Triangle(5,7);
		iarr[3] = new Circle(7);
		iarr[4] = new Triangle(4,4);
		
		
		for(int i=0; i<iarr.length; i++)
		{
			System.out.println("== iarr " + i + " ==");
			System.out.println("넓이 : " + iarr[i].area());
			System.out.println("둘레 : " + iarr[i].perimeter());
			if(iarr[i] instanceof Triangle) System.out.println("빗변길이 : " + ((Triangle)iarr[i]).getHypotenuse());
		}
		System.out.println("== iarr 0 ==");
		System.out.println("넓이 : " + iarr[0].area());
		System.out.println("");
		
	}

}
