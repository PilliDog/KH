package ncs.test8;

import ncs.test7.Book;
import ncs.test8.BookUpdate;

public class BookStore {

	public static void main(String[] args) {
		Book bookdata;
		bookdata = new Book("IT", "HTML5", 30000, 0.15);
		
		BookUpdate update = new BookUpdate(bookdata);
		
		System.out.println("기본정보");
		System.out.println(bookdata.getCategory() + " "
				+ bookdata.getBookName() + " "
				+ bookdata.getBookPrice() + " "
				+ bookdata.getBookDiscountRate() * 100 + "%");
		
		update.setBookData(bookdata);
		update.updataBookPrice();
		bookdata = update.getBookData();
		
		System.out.println("변경된 정보");
		System.out.println(bookdata.getCategory() + " "
				+ bookdata.getBookName() + " "
				+ bookdata.getBookPrice() + " "
				+ bookdata.getBookDiscountRate() * 100 + "%");

	}

}
