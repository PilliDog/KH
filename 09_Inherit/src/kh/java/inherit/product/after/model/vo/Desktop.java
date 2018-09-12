package kh.java.inherit.product.after.model.vo;

import java.util.Date;

public class Desktop extends Computer{
	//private String os;				//운영체제
	private String monitor;	
	private String keyboard;
	private String mouse;
	
	//생성자
	public Desktop() {}
	
	public Desktop(String brand, String productCode, String productName, int price, Date manufacturedDate, String os,
			String monitor, String keyboard, String mouse) {
		
//		super();//부모타입 생성자 호출
		//Desktop객체생성시 부모클래스Product의 생성자를 호출함.
		//생성자 첫줄에 작성해야함.
		super(brand, productCode, productName, price, manufacturedDate,os);
		
		//this.os = os;
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	//getter,setter
//	public String getOs() {
//		//return os;
//	}
//
//	public void setOs(String os) {
//		//this.os = os;
//	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	public void printInfo() {
		String info = printProductInfo()
					+ printComputerInfo()
					+ ", monitor="+monitor
					+ ", keyboard="+keyboard
					+ ", mouse="+mouse;
		System.out.println(info);
	} 


	
	
}
