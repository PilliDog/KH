package com.io.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test1 {
	Scanner sc = new Scanner(System.in);
//올라가라
	public static void main(String[] args) {
//		new Test1().fileSave();
		new Test1().fileRead();
		
	}
	
	public void fileRead()
	{
		String loadFileName = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileReader fr;
		
		System.out.print("로드하실 파일명을 입력해주세요 : ");
		try {
			loadFileName = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			new FileReader(loadFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave() 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fileName = null, content = "";
		String bufferContent = "";
		
		
		System.out.print("파일명을 입력해주세요 : ");
		try {
			fileName = br.readLine();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter(fileName);
			System.out.println("파일이 정상적으로 생성되었습니다.\n"
							 + "안에 들어갈 내용을 입력해주세요.(exit를 입력하면 종료)"
							 + ">>");
			int i = 0;
			while(true)
			{
				
				bufferContent = br.readLine();
				if(bufferContent.equals("exit")) break;
				content += (bufferContent + "\r\n");
				System.out.println("content : " + content);
			}
			fw.write(content);
			System.out.println("파일에 성공적으로 저장되었습니다.");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
