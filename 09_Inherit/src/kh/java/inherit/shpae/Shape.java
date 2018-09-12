package kh.java.inherit.shpae;

public class Shape {
	private double area; //도형의 넓이
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Shape() {}
	public Shape(double area) {
		this.area = area;
	}
	
	public void draw() {
		System.out.println("도형을 그립니다.");
	}
	
	public double calcArea() {
		
		return area;
	}
	
	
}
