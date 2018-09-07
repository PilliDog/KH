package kh.java.error;

public class ErrorTest {

	public static void main(String[] args) {
		ErrorTest e = new ErrorTest();
//		e.test1();
		e.test2();
	}
	
	public void test2()
	{//끝맺음이 없는 재귀호출
		test2();
	}
	
	public void test1()
	{
		//heap공간에 초과된 사용으로 인한
		long[] l = new long[Integer.MAX_VALUE];
	}

}
