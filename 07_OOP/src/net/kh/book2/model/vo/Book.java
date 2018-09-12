package net.kh.book2.model.vo;

public class Book {
	
	private String label, bookName, author, publisher, location;
	private int year, stock;
	private char genre;
	
	
	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public char getGenre() {
		return genre;
	}


	public void setGenre(char genre) {
		this.genre = genre;
	}


	public Book(){	
		
	}
	
	
	public Book(String label, int year, String bookName, String author, String publisher, char genre, int stock, String location) {
		
		this.label = year + "_" + genre + "_" + location;
		this.bookName = bookName;
		this.author = author; 
		this.publisher = publisher;
		this.stock = stock;
		
	}
	
	
	public void bookinfo() {
		
		System.out.println("label : " + label);
		System.out.println("bookName : " + bookName);
		System.out.println("author : " + author);
		System.out.println("publisher : "+ publisher);
		System.out.println("stock : " + stock);
		
	}


}
