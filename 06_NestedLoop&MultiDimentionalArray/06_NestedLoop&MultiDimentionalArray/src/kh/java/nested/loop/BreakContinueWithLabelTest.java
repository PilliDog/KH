package kh.java.nested.loop;

import java.util.Scanner;

public class BreakContinueWithLabelTest {

	public static void main(String[] args) {
		
		//new BreakContinueWithLabelTest().test1();
		//new BreakContinueWithLabelTest().test2();
		//new BreakContinueWithLabelTest().test3();
		new BreakContinueWithLabelTest().test4();
		
	}
	
	/*
	 	★
		★★
		★★★
		★★★★
		★★★★★
		★★★★★★
		★★★★★★★
	 */
	
	public void test1() {
		
		int userNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 줄까지 출력하고 싶니 : ");
		userNum = sc.nextInt();
		
		outer: //반복문에 이름을 붙여줄 수 있다.
		for(int i=1; i<(userNum+1); i++)
		{
			for(int j=0; i!=j; j++)
			{
				if(i == 6) break outer;
				System.out.print("★");
			}
			System.out.println();
				
		}
		
		
	}
	
	
	public void test2() {
		
		outer :
		for(int i=2; i<10; i++)
		{
			for(int k=0; k==0; k++)
			{
				System.out.println(" == " + i + " 단 ==");
			}
			
			for(int j=1; j<10; j++)
			{
				if(i < j) continue outer;
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
		
	}
	
	
	//퀴즈!!!!!!!!!! 전체 구구단에서 단과 수의 곱이 50미만일 때까지만 출력하기
	public void test3() {
		
			for(int i=2; i<10; i++)
			{
				for(int k=0; k==0; k++)
				{
					System.out.println(" == " + i + " 단 ==");
				}
				
				for(int j=1; j<10; j++)
				{
					if(i*j > 50) break;
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			}

		
	}
	
	
	public void test4() {
		
		
		
		for1 :
		for(int i=1; i<=5; i++)
		{
			if(i != 1)System.out.println();
			for2 :
			for(int j=1; j<=3; j++)
			{
				System.out.print("□");
				if(i%2 == 0) continue for1;
			}
		}
		
	}

}
