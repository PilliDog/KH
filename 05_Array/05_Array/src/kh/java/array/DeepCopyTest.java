package kh.java.array;

import java.util.Arrays;

public class DeepCopyTest {

	
	/*
		## 깊은 복사
		값을 직접 복사해서 Heap영역에 배열을 생성함
	 */
	public static void main(String[] args) {
		
		//new	DeepCopyTest().test1();
		//new	DeepCopyTest().test2();
		new	DeepCopyTest().test3();
	}
	
	
	/*
	 	1. 반복문을 통한 값 직접 복사
	 */
	public void test1() {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[5];
		
		for(int i = 0; i <arr1.length; i++) 
		{
			arr2[i] = arr1[i];
		}
		
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + ", ");
		}
		
		System.out.println("arr1의 주소값 : " + arr1.hashCode());
		
		
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + ", ");
		}
		
		System.out.println("arr2의 주소값 : " + arr2.hashCode());
		
	}
	
	
	public void test2() {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[5];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		//복사원본, 어디서부터, 복사대상, 어디서부터, 어디까지 복사
		//object, int, object, int
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1.hashCode());
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2.hashCode());
		
		//퀴즈!!!!!!! arr 1 => arr3[3,4,5]
		int[] arr3 = new int [3];
		
		System.arraycopy(arr1, 2, arr3, 0, arr3.length);
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3.hashCode());
		
		
		
		
	}
	
	/*
		## clone 메소드
	
	 */
	
	public void test3() {
		
		char[] carr1 = {'a', 'b', 'c', 'd', 'e'};
		char[] carr2 = carr1.clone();
		
		System.out.println(Arrays.toString(carr1));
		System.out.println(carr1.hashCode());
		System.out.println(Arrays.toString(carr2));
		System.out.println(carr2.hashCode());
		
	}

}
