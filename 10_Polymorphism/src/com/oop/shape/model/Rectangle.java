package com.oop.shape.model;

import com.oop.shape.model.Shape.IShape;

public class Rectangle extends Shape implements IShape{
	private double with, height;
	
	public Rectangle() {}
	public Rectangle(double with, double height)
	{
		this.with = with;
		this.height = height;
	}
	
	@Override
	public double area() {
		return (with * height);
	}
	@Override
	public double perimeter() {
		return (with + height) * 2;
	}
	
	public void setWith(double with)
	{
		this.with = with;
	}
	public double getWith()
	{
		return with;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getHeight()
	{
		return height;
	}
	

}
