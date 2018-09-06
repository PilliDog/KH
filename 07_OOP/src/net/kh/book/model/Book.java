package net.kh.book.model;

public class Book {
	
	private String title, publisher, author;
	private int price;
	private double discountRate;
	
	public Book(){
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public Book(String title, int price, double discountRate)
	{
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate)
	{
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	
	public void information() {
		
		System.out.println("title : " + title);
		System.out.println("publisher : " + publisher);
		System.out.println("author : " + author);
		System.out.println("price : " + price);
		System.out.println("discountRate : " + discountRate);
		
	}
	
	

}
