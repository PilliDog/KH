package kh.java.io.byte_.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		FileIOTest f = new FileIOTest();
//		f.test1(args[0], args[1]);
//		f.test2(args[0], args[1]);
		f.test3(args[0], args[1]);
		//실습문제 : 현재파일을 읽어서, "FileRWT.txt"로 쓰기. 단 문자기반 입출력스트림을 사용하세요
//		f.test2(args[0], args[1]);
		
	}
	
	/**
	 * try with resource
	 * jdk 1.7버전에서 추가됨
	 * 객체생성 구문을 try()에 기술함
	 * 자원반납 구문을 작성할 필요없이 자동으로 반납처리함
	 */
	
	public void test3(String in, String out) 
	{
		try(FileInputStream fis = new FileInputStream(in);
			FileOutputStream fos = new FileOutputStream(out);){
			
			
			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void test2(String in, String out)
	{
		try(FileInputStream fis = new FileInputStream(in);
				FileOutputStream fos = new FileOutputStream(out);) {
			

			String message = "FileRWT.txt";
			byte[] content = message.getBytes();
			fos.write(content);
			fos.close();
			
			
			int data = 0;
			//바이트기반
			while((data = fis.read()) != -1)
			{
				fos.write(data);
			}
			
			System.out.println("\n");
			//문자기반
			while((data=fis.read())!= -1)
			{
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	
	
	
	public void test1(String in, String out)
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(in);
			fos = new FileOutputStream(out);
			
			//읽어온 값을 담아둘 변수
			int data = 0;
			while((data=fis.read()) != -1)
			{
//				//1.byte단위 그대로 출력
//				byte b = (byte)data;
//				System.out.print(b + " : ");
				
				//2.char타입으로 변환 후 출력
				char c = (char)data;
				System.out.print(c);
				
				//3. 파일에 출력
				fos.write(data);
//				fos.flush(); //이전 jdk에서 사용하던 메소드
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
