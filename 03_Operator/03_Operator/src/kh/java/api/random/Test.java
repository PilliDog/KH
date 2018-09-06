package kh.java.api.random;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Test start = new Test();
		//start.RandomNumber();
		//start.RandomNumber2();
		//start.RandomNumber3();
		
	}
	
	
	//0~9까지의 랜덤 수
	public void RandomNumber() {
		int resultNum = 0;
		//while(resultNum != 9) {
		double nNum = Math.random();
		resultNum = (int)(nNum * 9) + 0;   
		
		System.out.println("결과값 : " + resultNum);
		//공식 : (int)(doubleVal*경우의 수) + 최소값(시작값)
		//System.out.println();
		//}

	}
	
	//1~10까지의 랜덤 수
	public void RandomNumber2() {
		int resultNum = 0;
		//while(resultNum != 9) {
		double nNum = Math.random();
		resultNum = (int)(nNum * 10) + 1;   
		
		System.out.println("결과값 : " + resultNum);
		//}		
	}
	
	//20~35 까지의 랜덤 수
	public void RandomNumber3() {
		int resultNum = 0;
		//while(resultNum != 9) {
		double nNum = Math.random();
		resultNum = (int)(nNum * 26) + 20;   
		
		System.out.println("결과값 : " + resultNum);
		//}		
	}
	

}