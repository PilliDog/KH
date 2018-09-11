package ncs.objectArray;

public class BookTest {
	static Book[] bookArray = new Book[5];

	public static void main(String[] args) {
		int priceSum = 0;
		
		bookArray[0] = new Book("IT", "SQL Plus", 50000, 5);
		bookArray[1] = new Book("IT", "Java 2.0", 40000, 3);
		bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6);
		bookArray[3] = new Book("Novel", "davincicode", 30000, 10);
		bookArray[4] = new Book("Novel", "cloven hoof", 50000, 15);
		
		for(int i=0; i<bookArray.length; i++)
		{
			System.out.println(bookArray[i].getCategory() + " "
						 	 + bookArray[i].getBookName() + " "
						 	 + bookArray[i].getBookPrice() + "원 "
						 	 + bookArray[i].getBookDiscountRate() + "%");
			
			priceSum += bookArray[i].getBookPrice();
			if(i == (bookArray.length - 1)) System.out.println("\n책 가격의 합 : " + priceSum);
			
		}
		
	}

	

}
