package ncs.test3;

public class Tv {
	String name, description;
	int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Tv() {}
	public Tv(String name, int price, String description) 
	{
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public String toString() {
		return name + " " + price + " " + description;
	}
	

}
