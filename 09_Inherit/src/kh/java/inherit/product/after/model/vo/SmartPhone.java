package kh.java.inherit.product.after.model.vo;

import java.util.Date;

public class SmartPhone extends Computer{
	//private String os;
	private String carrier;	//통신사		
	
	public SmartPhone(){}

	public SmartPhone(String brand, String productCode, String productName, int price, Date manufacturedDate, String os,
			String carrier) {
		super(brand, productCode, productName, price, manufacturedDate,os);
		//this.os = os;
		this.carrier = carrier;
	}

//	public String getOs() {
//		//return os;
//	}
//
//	public void setOs(String os) {
//		//this.os = os;
//	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public void printInfo() {
		System.out.println(printProductInfo() 
						+ printComputerInfo()
						+ ", carrier=" + carrier);
	}
	
}
