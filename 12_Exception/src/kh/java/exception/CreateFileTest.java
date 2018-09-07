package kh.java.exception;

import java.io.File;
import java.util.Scanner;

public class CreateFileTest {
	private String fileName = null;
	Scanner sc = new Scanner(System.in);
	private static CreateFileTest engine = new CreateFileTest();
	//private static File return_ = new File();
/**
 * @실습문제 : 사용자로부터 파일이름을 입력받아서 파일 생성하기
 * 새로운 파일을 생성하는 자바 api는 다음과 같다.
 * java.io.File
 * 
 * File f = new File(String 파일명);
 * f.createrFile();//throws IOException
 * 
 * 구현메소드
 * -main => inputFileName 메소드 호출
 * -inputFileName() : void => 사용자로부터 파일명을 입력받고 , createFile메소드를 호출
 * -createFile(String fileName) : File return; ==> 파일생성 후 File객체를 리턴
 * 
 * 출력결과 :
 * 1. 사용자가 myfile.txt를 입력한 결과 : myfile.txt생성 
 * 	"myfile.txt"가 성공적으로 생성됨
 * 2. 사용자가 ""를 입력한 결과 : Untitle.txt 생성
 * 	"Exception : 유효하지 않은 파일입니다."
 * "파일이름이 유효하지 않아 "Untitled.txt"를 임의 지정후 생성했습니다.
 */
	
	public static void main(String[] args) {
		
		//engine.inputFileName();
		new CreateFileTest().inputFileName();
	}
	
	public void inputFileName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명을 입력하세요 : ");
		String fileName = sc.nextLine();
		try
		{
			File f = createFile(fileName);
			System.out.println(f.getName() + "을 생성함");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("파일이름이 유효하지 않아 \"Untitled.txt\"를 임의 지정후 생성했습니다.");
		}
	}
	
	public File createFile(String fileName) throws Exception
	{
		File f = null;
		
		try
		{
			//if(fileName.equals(""))
			if("".equals(fileName))
				throw new Exception("유효하지 않은 파일이름입니다.");
		}
		catch(Exception e)
		{
			//파일이름이 유효하지 않은 경우 파일이름을 지정
			fileName = "Untitled.txt";
			//예외처리 후 다시 던져서, 메소드 호출부에 처리강제화
			throw e;
		}
		finally
		{
			f = new File(fileName);
			f.createNewFile();
		}
		
		return null;
	}
	
//	public void inputFileName()
//	{
//		System.out.print("생성하실 파일명을 입력해주세요 : ");
//		fileName = sc.nextLine();
//		System.out.println(fileName);
//		if(fileName.length() == 0) fileName = "Untitiled.txt"; 
////		System.out.println(fileName);
//		try
//		{
//			engine.createFile(fileName);	
//			System.out.println("정상적으로 파일이 생성되었습니다.");
//			throw new Exception("파일이름이 지정되지 않아 기본 파일명으로 생성하였습니다.");
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			
//		}
//	}
//	
//	public File createFile(String fileName) throws Exception
//	{
//		new File(fileName).createNewFile();
//		return null;
//	}

}
