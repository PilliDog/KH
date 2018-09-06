package member.model.vo;

import member.model.vo.Member.Buyable;

public class VVip extends Member implements Buyable{
	int bonusPoint;
	
	public VVip() {}
	public VVip(String name, String grade, int point)
	{
		super(name, grade, point);
		bonusPoint();
	}

	@Override
	public void bonusPoint() {
		this.bonusPoint = (int)(getPoint() * 0.15);
	}
	public int getBonusPoint()
	{
		return bonusPoint;
	}
	
	@Override
	public int buy(int price)
	{
		return (int)(price * (1-0.15));
	}

}
