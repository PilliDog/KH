package kh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopTest {

	public static void main(String[] args) {
		
		//new NestedLoopTest().test1();
		//new NestedLoopTest().test2();
		//new NestedLoopTest().test3();
		new NestedLoopTest().test4();
	}
	
	
	public void test1() {
		
			for(int i = 0; i < 5; i++)
			{
				System.out.print((i+1) + " : ");
				for(int j = 0; j < 5; j++)
				{
					System.out.print(j+1);
				}
				System.out.println();
			}
			
			
			//(행, 열)
			for(int i=0; i<5; i++)
			{
				for(int j=0; j<5; j++)
				{
					System.out.print("(" + i + "," + j + ")");
				}
				System.out.println();
			}
		
	}
	
	
	public void test2() {
		
		/*
		 * ★★★★★
		 * ★★★★★  >>> 출력하자
		 * ★★★★★
		 */

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
	
	public void test3() {
		
		/*
		 * 퀴즈!!!!!!! 사용자로부터 행과 열을 입력받아 별을 출력하세요.
		 */
		
		int row = 0, col = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행을 입력해주세요 : ");
		row = sc.nextInt();
		
		System.out.print("열을 입력해주세요 : ");
		col = sc.nextInt();
		
		for(int i=row; i>0; i--)
		{
			for(int j=col; j>0; j--)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
	
	//퀴즈!!!!!! 구구단을 출력해보자
	public void test4() {
		
		for(int i=2; i<10; i++)
		{
			for(int k=0; k==0; k++)
			{
				System.out.println(" == " + i + " 단 ==");
			}
			
			for(int j=1; j<10; j++)
			{
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
		
	}

}
