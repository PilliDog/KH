package kh.java.oop.encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		
		Account engine = new Account();
		
		new AccountMain().beforeEncapsulation();
		new AccountMain().afterEncapsulation();
	}
	
	//캡슐화 하기 전
	public void beforeEncapsulation() {
		
//		engine.name = "박광준";
//		engine.balance = 1_000_000;
//		
//		//입금
//		engine.balance += 100_000;
//		System.out.println(engine.name + "님의 잔액은 " + engine.balance + "원 입니다.");
//		
//		//출금
//		engine.balance -= 50_000;
//		System.out.println(engine.name + "님의 잔액은 " + engine.balance + "원 입니다.");
		
	}
	
	
	public void afterEncapsulation() {
		
		Account acc = new Account();
		acc.setName("박광준");
		acc.setBalance(1000000);
		
		//입금
		acc.deposit(100000);
		
		//출금
		acc.withdraw(100000);
		
		//잔액조회
		System.out.println(acc.getName() + "님의 잔액은 " + acc.getBalance() + "원 입니다.");
		
	}

}
