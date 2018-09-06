package kh.java.inherit.product.after.model.vo;

import java.util.Date;

public class Television extends Product {
	private String resolution;		//해상도 HD, FHD, UHD 
	private int size;				//화면크기 인치
	
	public Television(){}

	public Television(String brand, String productCode, String productName, int price, Date manufacturedDate,
			String resolution, int size) {
		super(brand, productCode, productName, price, manufacturedDate);
		this.resolution = resolution;
		this.size = size;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	public void printInfo() {
		System.out.println(printProductInfo() + ", resolution=" + resolution
				+ ", size=" + size);
	}
	
	
}
