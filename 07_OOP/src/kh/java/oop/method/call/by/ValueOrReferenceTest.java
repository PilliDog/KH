package kh.java.oop.method.call.by;

import java.util.Arrays;

/**
 * CallByValue | CallByReFference
 * 1. CallByValue : 매개인자로 기본형 변수를 전달했을 때
 * 2. CallByReFference : 매개인자로 참조형 변수를 전달했을 때
 */
public class ValueOrReferenceTest {

	
	public static void main(String[] args) {
		int[] a =  {1, 2, 3, 4, 5};
		int b = 10;
		
		ValueOrReferenceTest v = new ValueOrReferenceTest();
		v.callByTest(a);
		System.out.println(Arrays.toString(a));
		
		v.callByTest(b);
		System.out.println(b);

	}
	
	public void callByTest(int[]a) {
		
		for(int i=0; i<a.length; i++)
		{
			a[i] *= 100;
		}
		
	}
	
	
	public void callByTest(int b) {
		
		b *= 100;
		
	}

}
