package member.model.vo;

public class Member {
	private String name, rate;
	private int point;
	private double bonus;
	
	public Member() {}
	public Member(String name, String rate, int point)
	{
		this.name = name;
		this.rate = rate;
		this.point = point;
	}
	
	public double bonusPoint()
	{
		return 0.0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}
