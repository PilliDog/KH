package member.model.vo;

import member.controller.MemberManager;

public abstract class Member extends MemberManager  {
	private String name;
	private String grade;
	private int point;
	private int bonusPoint;
	private int price;
	
	public Member() {}
	public Member(String name, String grade, int point)
	{
		this.name = name;
		this.grade = grade;
		this.point = point;
		bonusPoint();
		this.price = buy(10000);
	}
	
	public interface Buyable{
		int buy(int price);
	}
	
	
	public abstract void bonusPoint();
	public abstract int buy(int price);
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	
	
	public void setBonusPoint(int bonusPoint)
	{
		this.bonusPoint = bonusPoint;
	}
	public int getBonusPoint() 
	{
		return bonusPoint;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	public String getGrade()
	{
		return grade;
	}
	public void setPoint(int point)
	{
		this.point = point;
	}
	public int getPoint()
	{
		return point;
	}
	
	@Override
	public String toString()
	{
		return name + " "
			 + grade + " "
			 + point + " ";
	}

}
