package com.oop.shape.model;

import com.oop.shape.model.Shape.IShape;

public class Circle extends Shape implements IShape{
	private static final double PI = Math.PI;
	private double radius;
	
	public Circle() {}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double getPI()
	{
		return PI;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double fadius)
	{
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return (radius * PI);
	}
	@Override
	public double perimeter() {
		return ((radius * radius) * PI);
	}
}
