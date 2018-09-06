package ncs.test8;

import ncs.test7.Book;

public class BookUpdate {
	
	public Book bookData;
	
	
	public BookUpdate() {}
	public BookUpdate(Book bookData)
	{
		this.bookData = bookData;
	}
	
	public void updataBookPrice()
	{
		bookData.setBookPrice(bookData.getBookPrice()* (1 - bookData.getBookDiscountRate()));
		
	}
	
	public Book getBookData() {
		return bookData;
	}
	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}

}
