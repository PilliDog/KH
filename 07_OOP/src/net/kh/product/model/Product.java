package net.kh.product.model;

public class Product {
	
	private String pName;
	public int price;
	String brand;
	private double taxRate;
	
	
	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getTaxRate() {
		return taxRate;
	}


	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}


	public void information() {
		
		System.out.println("물건 이름 : " + getpName());
		System.out.println("물건 가격 : " + getPrice());
		System.out.println("브랜드 : " + getBrand());
		System.out.println("세율 : " + getTaxRate());
		
	}
	
}
