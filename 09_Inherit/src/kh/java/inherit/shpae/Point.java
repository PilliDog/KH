package kh.java.inherit.shpae;

public class Point {
	private int x;
	private int y;
	
	public Point() 
	{
		//기본값
		this(0,0);
	}
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//Object클래스의 toString메소드를 오버라이딩
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
