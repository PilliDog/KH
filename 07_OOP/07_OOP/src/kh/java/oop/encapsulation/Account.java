package kh.java.oop.encapsulation;

/*
 * 	모든 멤버 필드는 oop원칙에 따라 private로 지정함
 */
public class Account {
	
	private String name; //고객명
	private long balance; //잔액
	
	//필드를 제어하는 가장 기본적인 메소드 getter(특성 객채의 값을 돌려주는애), setter(이 필드의 값을 대입하는(셋팅하는 애))
	//객체가 빈(bean:웹서버(컨테이너)에서 관리되는 자바객체)으로 관리되기 위한 필수 메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) { //매개변수의 name이
		this.name = name; //매개변수의 name
		//this name은 위 private의 name이다 (현재 객체를 가리키는 참조값)
	}
	
	
	public long getBalance() {
		return balance;
	}
	
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	//입금을 위한 메소드
	public void deposit(int money) {
		
		balance += money;
		System.out.println(name + "님의 계좌에 " + money + "원이 입금 되었습니다.");
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
		
	}
	
	
	//출금을 위한 메소드
	public void withdraw(int money) {
		
		if(money <= balance)
		{			
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금 되었습니다.");
			System.out.println("현재 잔액은 " + balance + "원 입니다.");
		}
		else
		{
			System.out.println("잔액이 부족합니다.");
		}
		
	}

}
