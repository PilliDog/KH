package kh.java.polymorphism.device;

public class Phone extends Device {
	private String carrier;

	public Phone() {}
	public Phone(String brand, String deviceName, int price, String carrier)
	{
		super(brand, deviceName, price);
		this.carrier = carrier;
	}
	
	public void setCarrier(String carrier)
	{
		this.carrier = carrier;
	}
	public String getCarrier()
	{
		return carrier;
	}
	
	@Override
	public String getDeviceInfo()
	{
		return super.getDeviceInfo() + ", carrier : " + carrier;
	}
}

