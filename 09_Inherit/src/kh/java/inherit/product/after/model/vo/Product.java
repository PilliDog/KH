package kh.java.inherit.product.after.model.vo;

import java.util.Date;

/**
 * 상속의 특징
 * 1.모든 클래스는 Object클래스의 후손
 * 		- Object클래스가 제공하는 메소드를 그대로 사용하거나
 * 		오버라이딩해서 재구현(implement)가능
 * 		- 예) toString(), equals()
 * 2.부모클래스의 생성자, 초기화블럭은 상속안됨.
 * 		- 자식클래스의 객체 생성시, 부모클래스 생성자를 먼저 실행.
 * 		- 자식클래스의 생성자안에서 부모클래스 생성자 호출을 명시하고 싶으면 super()를 활용.
 * 3.부모클래스의 private멤버는 상속은 되지만 직접접근 불가
 * 		- 자식객체생성시 부모의 필드값을 전달받은 경우, 자식생성자 안에서 
 * 			부모의 private 필드에 접근불가.
 * 		- super()를 이용해서 전달받은 부모필드값을 부모생성자쪽으로
 * 			넘겨서 생성
 * 		- setter, getter메소드를 이용해서 접근
 * 		
 */
public class Product {
	private String brand;			//브랜드명
	private String productCode;		//상품코드
	private String productName;		//상품명
	private int price;				//가격
	private Date manufacturedDate;	//제조일
	
	public Product() {}
	
	public Product(String brand, String productCode, String productName, int price, Date manufacturedDate) {
		this.brand = brand;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.manufacturedDate = manufacturedDate;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	public String printProductInfo() {
		String info = "brand="+brand
					+ ", productCode="+productCode
					+ ", productName="+productName
					+ ", price="+price
					+ ", manufacturedDate="+manufacturedDate;
		return info;
	}
	
}
