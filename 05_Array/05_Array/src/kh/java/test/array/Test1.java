package kh.java.test.array;

public class Test1 {

	public static void main(String[] args) {
		
		new Test1().test();

	}
	
	
	public void test() {
		
		int array[] = new int[100];
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (i+1);
			System.out.println(array[i]);
		}
		
	}

}
