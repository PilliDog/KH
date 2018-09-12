package com.oop.book.model.vo;

import com.oop.book.run.TestBook;

public class Book extends TestBook{
	String title, author;
	int price;
	
	public Book() {}
	public Book(String title, String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	
	@Override
	public String toString()
	{
		return title + " " + author + " " + price;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		//Car other = (Car)obj; //ojbect타입을 Car타입으로 형변환
		//if(carName.equals(other.getCarName()) && carColor.equals(other.getCarColor()) &&engineCC == other.getEngineCC())
		Book compare = (Book)obj;
		if(title.equals(compare.getTitle()) && author.equals(compare.getAuthor()) && price == compare.price) return true;
		else return false;
	}
//	
//	@Override
//    public Object clone(){
//		Object obj = null;
//		try{ 
//			obj = super.clone();
//		}catch(Exception e){} 
//		return obj;
//	}
	

}
