package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class OverridingExceptionTest {

	public static void main(String[] args) {
		try
		{
			new Child().test();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e) //이거 한방으로 처리가능
		{
			e.printStackTrace();
		}
	}

}

class Parent{
	public void test() throws SQLException, IOException
	{
	}
}

/**
 * 1. 오버라이딩시 부모클래스 test메소드가 던진 예외중 일부를 던질 수 있다.
 * 2. 부모 test메소드가 던진 예외클래스의 후손 클래스를 던질 수 있다.
 * 3. 부모 test메소드가 던진 예외클래스의 상위 클래스를 던질 수 없다.
 */
class Child extends Parent{
	@Override
//	public void test() throws SQLException, IOException	{}
//	public void test() throws SQLException {}
	public void test() throws SQLException, FileNotFoundException {
//	public void test() throws Exception {} //Error 부모예외 던질 수 읎슴test가 throws한 클래스보다 더 높아서
		throw new FileNotFoundException("내가 던진 FileNotFoundException!!!!!!");
	}
}