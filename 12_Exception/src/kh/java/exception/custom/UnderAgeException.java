package kh.java.exception.custom;

/**
 * 사용자 예외클래스 작성
 * 필요에 따라 Exception(checked)/RuntimeException(unchecked)을 상속해서 구현함
 *
 */
public class UnderAgeException extends Exception{

	public UnderAgeException()
	{
		
	}
	
	public UnderAgeException(String message)
	{
		super(message);
	}
	
}
