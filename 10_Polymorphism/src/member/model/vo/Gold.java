package member.model.vo;

import member.model.vo.Member.Buyable;

public class Gold extends Member implements Buyable{
	int bonusPoint;
	
	public Gold() {}
	public Gold(String name, String grade, int point)
	{
		super(name, grade, point);
		bonusPoint();
	}
	
	@Override
	public void bonusPoint() 
	{
		this.bonusPoint = (int)(getPoint() * 0.05);
	}
	public int getBonusPoint()
	{
		return bonusPoint;
	}
	
	@Override
	public int buy(int price) {
		
		return (int)(price * (1-0.05));
	}

}
