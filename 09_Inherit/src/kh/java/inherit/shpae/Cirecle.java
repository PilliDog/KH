package kh.java.inherit.shpae;

public class Cirecle extends Shape{
	private Point center; //중심점
	private int r; //반지름
	
	public Cirecle() {
		//기본원
		this(new Point(0,0), 100);
	}
	public Cirecle(Point center, int r)
	{
		this.center = center;
		this.r = r;
	}
	
	@Override
	public void draw() {
		System.out.println("원점이 " + center.getX() + ", " + center.getY() + "반지름이 : "+ r + "인 원을 그린다.");
	}
	
	@Override
	public double calcArea() {
		return 3.14 * (r*r);//원너비 구하기
	}
}
