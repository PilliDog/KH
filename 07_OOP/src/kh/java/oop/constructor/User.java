package kh.java.oop.constructor;

import java.util.Date;

/**
 * 생성자 (Constructor)
 * new 연산자를 통해 호출하는 메소드로, 클래스를 인스턴스화 한다.
 * 객체의 초기화 처리를 담당함.
 * 
 * 리턴 타입이 없고, 생성자명은 클래스명과 동일해야 한다.(대/소문자 구분)
 * 
 * 기본 생성자와 파라미터 생성자가 있다.
 * 1. 어떤 생성자도 작성하지 않은 경우에는 jvm이 자동으로 기본 생성자를 생성하고 처리함
 * 2. 파라미터 있는 생성자를 작성한 경우에는 명시적으로 기본 생성자를 작성해야함
 * 
 * 기본 생성자가 필요한 이유
 * - 상속시 자식클래스가 부모클래스의 기본생성자를 호출
 * - jsp에서 bean객체가 클래스의 기본생성자를 호출함
 * - spring에서 bean객체 생성시 기본생성자 호출
 * 
 * this
 * 모든 인스턴스의 메소드에 숨겨진채 존재하는 레퍼런스
 * 할당된 객체를 가리킴
 * 생성자함수 호출시 생성된 객체주소가 담겨있다
 * 
 * this()
 * 생성자에서 다른 생성자를 호출할 때 사용함
 * 반드시 생성자의 첫번째 줄에 선언해야함
 */

public class User {
	
	private String userId;
	private String userPassword;
	private String userName;
	private Date enrollDate;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	//이게 기본 생성자 : 리턴타입은 없다. 생성자명은 클래스 명과 동일함.
	public User() {
		
	}
	
	public User(String userId,
				String userPassword,
				String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		//기본값 지정
		this.enrollDate = new Date();
	}
	
	
	public User(String userId, 
				String userPassword,
				String userName,
				Date enrollDate) {
		
		//여기서 초기화할 수있음
		//this.를 통해 초기화를 할 수 있음
		
		this(userId, userPassword, userName);
		this.enrollDate = enrollDate;
		
		
	}
	
	
	public void information() {
		System.out.println(userId + ", " + userPassword + ", " + userName + ", " + enrollDate);
	}

}
