package member.model.vo;

public class Silver {
	
	private String name, rate;
	private int point;
	private double bonus;

	public Silver() {}
	
	public Silver(String name, String rate, int point) {
		this.name = name;
		this.rate = rate;
		this.point = point;
		this.bonus = (point*0.02);
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
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
