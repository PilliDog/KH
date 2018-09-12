package kh.java.api.random;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		RandomNumber r = new RandomNumber();
		
		//1. java.util.Random 클래스
		//r.randomTest();
		
		//2. java.lang.Math 클래스
		//r.mathTest();
		
		r.mathTest();

	}

	
	
	public void randomTest() {
		
		//1. Random클래스 객체생성
		Random rnd = new Random();
		
		//2. 1부터 10까지의 수 중에 난수 발생시키기 >> 0.0이상 1.0미만의 난수를 발생시킨후 처리함.
		
		int num = rnd.nextInt(10)+1; // 0~9의 난수가 발생됨. 
		
		int num2 = rnd.nextInt(25)+11; //11~35사이의 난수가 발생됨.
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextDouble());
		
	}
	
	
	public void mathTest() {
		//0.0(inclusive : 포함)과 1.0(exclusive : 제외) 사이의 난수 발생
		
		double dNum = Math.random(); //Math 클래스의 Static 메소드 >> 객체 안만들고 호출해도됨
		System.out.println("dNum : " + dNum);
		
		//1부터 10까지의 난수로 가공
		//공식 : (int)(doubleVal*경우의 수) + 최소값(시작값)
		int iNum = (int) (dNum*10) + 1; //최소값을 더해준다
		System.out.println("iNum : " + iNum);
		
		//11~35까지의 난수
		iNum = (int)(dNum*25) + 11;
		System.out.println("iNum : " + iNum);
		
		
	}
}
