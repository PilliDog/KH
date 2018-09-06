package kh.java.polymorphism.device;

public class LapTop extends Device{
	
	private int capacity; //저장용량
	
	public LapTop() {}
	public LapTop(String brand, String deviceName, int price, int capacity)
	{
		super(brand, deviceName, price);
		this.capacity = capacity;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", capacity : " + capacity;
	}
	
	public String getLapTopInfo()
	{
		return getDeviceInfo() + ", capacity : " + capacity; 
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

}
