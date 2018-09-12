package kh.java.inherit.shpae;

import java.util.Arrays;

/**
 * 
 * 실습문제 : Shape클래스를 상속받은 Rectangle클래스를 작성
 *
 * 필드 : 
 * Point1,2,3,4
 * width
 * height
 * 
 * 생성자
 * 기본생성자
 * 파라미터 : Point leftTop, int width, int height
 * 
 * 다음메소드를 오버라이딩하세요.
 * draw()
 * calcArea()
 */
public class Rectangle extends Shape{
	private Point Point[] = new Point[4];
	private int width, height;

	public Rectangle() {}
	public Rectangle(Point leftTop, int width, int height)
	{
		this.Point[0] = leftTop;
		this.width = width;
		this.height = height;
		Point[1] = new Point();
		Point[2] = new Point();
		Point[3] = new Point(); 
		Point[1].setX(Point[0].getX() + width);
		Point[2].setY(Point[0].getY() - height);
		Point[3].setY(Point[0].getY() - height);
		Point[3].setX(Point[0].getX() + width);
	}
	
	
	@Override
	public void draw() {
		System.out.println("네 꼭지점이 " + Point[0]
					  	   			  + Point[1]
					  	   			  + Point[2]
					  	   			  + Point[3]);
//		System.out.print(("(" +Point[0].getX() + ", "+ Point[0].getY() + ")"));
//		System.out.print(("(" +Point[1].getX() + ", "+ Point[1].getY() + ")"));
//		System.out.print(("(" +Point[2].getX() + ", "+ Point[2].getY() + ")"));
//		System.out.print(("(" +Point[3].getX() + ", "+ Point[3].getY() + ")\n"));
		//System.out.println("사각형의 너비 : " + width * height);
	}
	
	@Override
	public double calcArea() {
		return width * height;
	}
	
	
}
