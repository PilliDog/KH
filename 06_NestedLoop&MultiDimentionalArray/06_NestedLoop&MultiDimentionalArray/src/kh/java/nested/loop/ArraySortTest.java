/*
	## 배열 정렬
	정렬 알고리즘 종류
	1. 순차정렬
	2. 선택정렬
	3. 버블정렬
	4. 삽입정렬
	5. 퀵정렬
	6. 합병정렬
 */
package kh.java.nested.loop;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {
		
		//{10, 3, 5, 9, 8} => {3, 5, 8, 9, 10}
		ArraySortTest start = new ArraySortTest();
		start.test1();
		
		int[] arr = {4, 3, 0, 2, 1};
		//1. 순차정렬
		start.sequentialSort(arr);

	}
	
	public void test1() {
		
		//1. 변수의 값 교환
		int num1 = 10;
		int num2 = 20;
		int temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		
		//2. 서로 다른 배열인덱스 교환
		int[] arr = {2, 1, 3};
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		System.out.println("arr : " + Arrays.toString(arr));
		
		
		//3. 메소드 생성
		swap(arr, 1, 2);
		System.out.println("swqp 후 : " + Arrays.toString(arr));
		
	}
	
	
	public void swap(int[] abb, int b, int c) {
		
		int temp = abb[b];
		abb[b] = abb[c];
		abb[c] = temp;
		
	}
	
	
	public void sequentialSort(int[] arr) {
		
		//0, 1, 2, 3 => 4번 반복함 (마지막은 자동으로 정렬됨)
		for(int i=0; i<arr.length-1; i++)
		{
			//현재회차(i) 다음 인덱스부터 비교를 시작함
			for(int j=i+1; j<arr.length; j++)
			{
				//오름차순이므로, 좌측값이 크면 swap
				if(arr[i] > arr[j])
				{
					swap(arr, i, j);
				}
				print(arr, i);
			}
		}
		
		System.out.println("arr : " + Arrays.toString(arr));
		
	}
	
	
	public void print(int[] arr, int i) {
		
		System.out.printf("%2d : %2d%2d%2d%2d%2d%n", i, arr[0], arr[1], arr[2], arr[3], arr[4]);
		
	}
	
}
