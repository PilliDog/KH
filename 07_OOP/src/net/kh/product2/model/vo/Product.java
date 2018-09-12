package net.kh.product2.model.vo;

public class Product {
	
	private String sort;
	private String productName;
	private int price;
	private int stock;
	private boolean isDiscount;
	private double discountRate;
	
	public Product() {
		
	}
	
	public Product(String sort, String productName, String price, int stock, boolean isDiscount) {
		this.sort = sort;
		this.productName = productName;
		this.price = Integer.parseInt(price);
		this.stock = stock;
		this.isDiscount = isDiscount;
	}
	
	public Product(String sort, String productName, String price, int stock, boolean isDiscount, double discountRate) {
		this.sort = sort;
		this.productName = productName;
		this.price = Integer.parseInt(price);
		this.stock = stock;
		this.isDiscount = isDiscount;
		this.discountRate = discountRate;
	}
	
	public void productlnfo() {
		
		if(isDiscount == true)
		{
			System.out.println("sort : " + sort);
			System.out.println("productName : " + productName);
			System.out.println("price  : " + (long)(price - (price*discountRate)));
			System.out.println("stock : " + stock);
			System.out.println("isDiscount : " + isDiscount);
			System.out.println("discountRate : " + discountRate);
		}
		else
		{
			System.out.println("sort : " + sort);
			System.out.println("productName : " + productName);
			System.out.println("price  : " + price);
			System.out.println("stock : " + stock);
			System.out.println("isDiscount : " + isDiscount);
		}
		
	}
	
	
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isDiscount() {
		return isDiscount;
	}
	public void setDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	

}
