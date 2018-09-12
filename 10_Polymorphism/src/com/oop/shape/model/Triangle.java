package com.oop.shape.model;

import com.oop.shape.model.Shape.IShape;

public class Triangle implements IShape{
	
	private double base;
	private double height;
	
	public Triangle() {}
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public double getHypotenuse()
	{
		return Math.sqrt(base*base + height*height);
	}

	@Override
	public double area() {
		return (base * height)/2;
	}

	@Override
	public double perimeter() {
		return base + height + getHypotenuse();
	}

}
