package member.model.vo;

import member.model.vo.Member.Buyable;

public class Ruby extends Member implements Buyable{
	int bonusPoint;

	public Ruby() {}
	public Ruby(String name, String grade, int point)
	{
		super(name, grade, point);
		bonusPoint();
	}
	
	@Override
	public void bonusPoint() 
	{
		this.bonusPoint = (int)(getPoint() * 0.2);
	}
	
	public void setBonusPoint(int bonusPoint)
	{
		this.bonusPoint = bonusPoint;
	}
	public int getBonusPoint()
	{
		return bonusPoint;
	}
	
	@Override
	public int buy(int price) {
		return (int)(price*(1-0.2));
	}
}
