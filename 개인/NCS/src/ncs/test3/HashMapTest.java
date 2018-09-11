package ncs.test3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ncs.objectArray.Book;

public class HashMapTest extends Book{

	public static void main(String[] args) {
		HashMap<String , String> map = new HashMap<String , String>();
		Book[] bookArray = new Book[5];
		bookArray[0] = new Book("IT", "SQL Plus", 50000, 5);
		bookArray[1] = new Book("IT", "Java 2.0", 40000, 3);
		bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6);
		bookArray[3] = new Book("Novel", "davincicode", 30000, 10);
		bookArray[4] = new Book("Novel", "cloven hoof", 50000, 15);
		
		for(int i=0; i<bookArray.length; i++)
		{
			map.put(bookArray[i].getBookName(), new String(bookArray[i].getCategory()));
		}

		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> test = set.iterator();
		
		while(test.hasNext())
		{
			Map.Entry<String, String> e = (Map.Entry<String, String>)test.next();
			System.out.println(e.toString()); //오버라이딩을 어떻게 해야할까.. 해외쪽 자료가 있는듯 하다. 이따 하자.
			
		}
		
		


	}
	
	


}
