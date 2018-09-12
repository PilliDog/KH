package net.kh.circle.model;

public class Circle {
	
	
	
	private static final double PI = 3.14;
	private int radius = 1;
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public static double getPI() {
		return PI;
	}

	
	public void incrementField() {
		
		radius ++;
		
	}
	
	public void getAreaOfCircle() {
		
		System.out.println("원주 : " + radius*radius*PI);
		
	}
	
	public void getSizeOfCircle() {
		
		System.out.println("원넓이 : " + radius * PI);
		
	}

}
