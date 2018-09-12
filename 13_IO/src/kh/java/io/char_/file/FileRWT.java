package kh.java.io.char_.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRWT {

	public static void main(String[] args) {
		FileRWT f = new FileRWT();
		//byte기반 |char기반 비교
		f.test1();
	}
	
	/**
	 * byte기반 | char기반 비교
	 */
	public void test1()
	{
		String file = "fileRWT.txt";
		
		try(FileInputStream fis = new FileInputStream(file);
				FileReader fr = new FileReader(file))
		{
			//읽어온 데이터를 담아둘 변수 //데이터가 없을 경우를 위해 char보다 데이터 타입이 큰 int를 사용
			int data = 0;
			
			while((data = fis.read()) != -1)
			{
				System.out.print((char)data);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
