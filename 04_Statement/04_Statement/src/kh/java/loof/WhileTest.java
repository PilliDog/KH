/*
	## while 반복문
	
	초기식
	
	while(조건식){
		//실행코드
		//증감식 (while 안에 어디서든 쓰면 됨, 단 위치에 따라 결과가 달라질 수 있음)
	}
	
 */

package kh.java.loof;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		
		WhileTest start = new WhileTest();
		
		//start.test();
		//start.test2();
		//start.test3();
		start.test4();
		
	}
	
	public void test() {
		
		int i = 1;
		/*
		for(int j = 0; j < 10; j++)
		{
			System.out.println((j + 1) + "번째 안녕!!!!!!!!!!!!!!");
		}
		*/
		
		while(i < 11)
		{
			i++; //위치에 따라 결과가 다름. 주의!!
			System.out.println(i + "번째 안녕!!!!!!!!!!!!!!");
		}
		
		System.out.println("최종 i는 : " + i);
	
	
		
		/*
		while() // 안됨 >> 조건식이 없어
		{
			System.out.println(i + "번째 안녕!!!!!!!!!!!!!!");
			i++;
		}
		*/
		
	}
	
	public void test2() {
		
		int i = 2;
		
		while(i <= 100)
		{
			System.out.println(i);
			i += 2;
		}
		
	}
	
	public void test3() {
		
		int i = 100;
		
		while(i >= 2)
		{
			System.out.println(i);
			i -= 2;
		}
		
	}
	
	
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		String name = new String();
		int cnt = 0;
		
		System.out.print("너의 이름을 입력해 : ");
		name = sc.nextLine();
		System.out.print("몇 번 출력할래? : ");
		cnt = sc.nextInt();
		
		while(cnt > 0)
		{
			System.out.println(name);
			cnt --;
		}
		
	}
	

}
