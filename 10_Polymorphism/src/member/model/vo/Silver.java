package member.model.vo;

import member.model.vo.Member.Buyable;

public class Silver extends Member implements Buyable{
	int bonusPoint;

	public Silver() {}
	public Silver(String name, String grade, int point)
	{
		super(name, grade, point);
		bonusPoint();
	}
	
	@Override
	public void bonusPoint() 
	{
		this.bonusPoint = (int)(getPoint() * 0.02);
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
		return (int)(price*(1-0.02));
	}

}
