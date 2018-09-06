package kh.java.api.random;

import java.util.Scanner;

public class Rps {

	public static void main(String[] args) {
		
		Rps start = new Rps();
		int scCnt;
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 판 할거야? : ");
		scCnt = sc.nextInt();
		start.rpsGame(scCnt);
	
	}
	
	public void rpsGame(int gameCnt) {
		
		int userSc;
		double rNum;
		int result;
		int money = 10000;
		int bettingMoney;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임");
		
		
		while(money > 0 && gameCnt > 0) {
		gameCnt --;
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
		userSc = sc.nextInt();
		
		System.out.print("금액을 입력해주세요. : ");
		bettingMoney = sc.nextInt();
		
		
		rNum = Math.random();
		result = (int)((rNum * 3) + 1);
		
		System.out.println("======= 결과 =======");
		
		//user set
		if(userSc == 1) {
			
			System.out.println("당신은 가위를 냈습니다.");
			
		}else if(userSc == 2) {
			
			System.out.println("당신은 바위를 냈습니다.");
			
		}else {
			
			System.out.println("당신은 보를 냈습니다.");
			
		}
		
		//computer set
		if(result == 1) {
			
			System.out.println("컴퓨터는 가위를 냈습니다.");
			
		}else if(result == 2) {
			
			System.out.println("컴퓨터는 바위를 냈습니다.");
			
		}else {
			
			System.out.println("컴퓨터는 보를 냈습니다.");
			
		}
		
		
		//result out
		System.out.println("==================");
		
		if(userSc == result) {
			
			System.out.println("비겼습니다.");
			
		}else if((userSc == 1 && result == 2)||(userSc == 2 && result == 3) || (userSc == 3 && result == 1)) {
			
			System.out.println("당신은 졌습니다.");
			money -= bettingMoney;
			
			
		}else {
			
			System.out.println("당신이 이겼습니다!");
			money += bettingMoney;
		}
		
		System.out.println("현재 잔액 : " + money);
		
	}
	}

}
