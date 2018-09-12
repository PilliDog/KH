package kh.java.api.random;

import java.util.Scanner;

public class CoinGame {

	public static void main(String[] args) {
		
		CoinGame start = new CoinGame();
		
		start.startGame();

	}
	
	public void startGame() {
		
		int scCoin;
		int result;
		double rNumber;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 동전 앞 뒤 맞추기 =====");
		System.out.print("숫자를 입력해주세요. (1.앞면  2.뒷면) : ");
		scCoin = sc.nextInt();
		
		
		
		//11~35까지의 난수
		//iNum = (int)(dNum*25) + 11;
		rNumber = Math.random();
		result = (int)((rNumber * 2) + 1);
		//System.out.println("결과는 ? rNum : " + rNumber);
		System.out.println("결과는 ? " + result);
		System.out.println((result == 1) ? "앞면입니다!" : "뒷면입니다!");
		System.out.println((result == scCoin) ? "맞췄습니다!" : "틀렸어");
		
	}

}
