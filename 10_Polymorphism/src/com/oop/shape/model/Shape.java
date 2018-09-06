package com.oop.shape.model;

public abstract class Shape {
	
	public Shape() {}
	

	public interface IShape{
		public abstract double area(); //면적 계산 리턴용
		public abstract double perimeter(); //둘레 계산 리턴용
	}
}
