package kh.java.inherit.product.after.model.vo;

import java.util.Date;

public class Computer extends Product{
	private String os;
	
	public Computer() {}
	public Computer(String brand, String productCode, String productName, int price, Date manufacturedDate, String os) {
		//Computer클래스에서 처리할 수 없는 필드는 부모클래스 생성자를 호출해서 처리함
		super(brand, productCode, productName, price, manufacturedDate);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public String printComputerInfo() {
		
		return " " + os;
		
	}

}
