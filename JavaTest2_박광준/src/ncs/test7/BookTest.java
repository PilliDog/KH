package ncs.test7;

import java.util.Arrays;

public class BookTest {
	
	/** 7번문제
	 * 처음에 vo클래스의 변수를 static으로 선언해버렸다.
	 * static으로 선언하게 되면 메모리 공간에 하나만 할당되고 모든 인스턴스는 이를 공유한다.
	 * 따라서 값이 모두 같게된다. 기억하자
	 */
	

	public static void main(String[] args) {
		Book bookArray[] = new Book[5];
		double sum = 0;
		

		for(int i=0; i<bookArray.length; i++)
		{
			switch(i)
			{
				case 0 : bookArray[0] = new Book("IT", "SQL Plus", 50000, 0.05);
				break;
				case 1 : bookArray[1] = new Book("IT", "Java 2.0", 40000, 0.03);
				break;
				case 2 : bookArray[2] = new Book("IT", "JSP Servlet", 60000, 0.06);
				break;
				case 3 : bookArray[3] = new Book("Nobel", "davincicode", 30000, 0.10);
				break;
				case 4 : bookArray[4] = new Book("Nobel", "cloven hoof", 50000, 0.15);
				break;
			}
			sum += bookArray[i].getBookPrice();
		}
		
		
		for(int i=0; i<bookArray.length; i++)
		{
			System.out.println(bookArray[i].getCategory() + " "
							 + bookArray[i].getBookName() + " "
							 + bookArray[i].getBookPrice() + " "
							 + bookArray[i].getBookDiscountRate() * 100 + "%");
		}
		
		System.out.println("책 가격의 합 : " + sum + "원");
		
		
	
		

	}

}
