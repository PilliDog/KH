package kh.java.inherit.object.car.model.vo;

public class Car {
	private String carName;
	private String carColor;
	private int engineCC;
	
	public Car() {}
	public Car(String carName, String carColor, int engineCC)
	{
		this.carName = carName;
		this.carColor = carColor;
		this.engineCC = engineCC;
	}
	
	public String getCarName()
	{
		return carName;
	}
	public void setCarName(String carName)
	{
		this.carName = carName;
	}
	public String getCarColor()
	{
		return carColor;
	}
	public void setCarColor(String carColor)
	{
		this.carColor = carColor;
	}
	public int getEngineCC()
	{
		return engineCC;
	}
	public void setEngineCC(int engineCC)
	{
		this.engineCC = engineCC;
	}
	
	@Override
	public String toString() {
		return "carName : " + carName + ", "
			 + "carColor : " + carColor + ", "
			 + "engineCC : " + engineCC;  
	}
	
	@Override
	public boolean equals(Object obj) {
		//this == obj // 두 객체간 참조주소값이 같으면 같은 객체이다
		if(this==obj) return true;
		//현재 객체는 null이 아니고, obj는 null인 경우
		if(obj==null) return false;
		//같은 클래스타입인 경우가 아니면
		if(this.getClass() != obj.getClass()) return false;
		
		Car other = (Car)obj; //ojbect타입을 Car타입으로 형변환
		if(carName.equals(other.getCarName()) && carColor.equals(other.getCarColor()) &&engineCC == other.getEngineCC())
			return true;
		else 
			return false;
	}
	
	
	@Override
	public int hashCode()
	{	//소나타블랙2000
		return (carColor + carName + engineCC).hashCode();
	}
	
	
	
}
