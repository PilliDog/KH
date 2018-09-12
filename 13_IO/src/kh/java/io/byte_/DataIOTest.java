package kh.java.io.byte_;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOTest {

	public static void main(String[] args) {
		DataIOTest d = new DataIOTest();
		//d.test1();
		//d.test2();
		
		//점수정보 입력하기
		d.test3();
	}
	
	public void test1() {
		
		//FileOutputStream fos = new FileOutputStream("sample.dat");
		//DataOutputStream dos = new DataOutputStream(fos);
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("sample.dat"));){
			
			dos.writeBoolean(true);
			dos.writeInt(100);
			dos.writeFloat(99.9f);
			dos.writeChar('아');
			dos.writeChar('안');
			dos.writeChar('뇨');
			dos.writeChar('오');
			dos.writeChar('옹');
			dos.writeChar('!');
			//String
			dos.writeUTF("안뇨오옹오오옹!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//TEST1
	
	public void test2() {
		
//		FileInputStream fis = new FileInputStream("sample.dat");
//		DataInputStream dis = new DataInputStream(fis);
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("sample.dat"));){
			//반드시 입력된 데이터타입 순서대로 읽어와야한다.
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//TEST2
	
	public void test3() {
		
		//우리반 평가점수 데이터
		int[] score = {100, 98, 68, 40, 89};
		//score.dat 파일에 쓰기작업
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"))) {
			
			
			for(int i=0; i<score.length; i++)
			{
				dos.writeInt(score[i]);
			}
			
			test4();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}//TEST3
	
	/**
	 * 점수정보 읽어와서 총점/평균을 구해보세요.
	 */
	public void test4() {
		double sum = 0;
		double avg = 0;
		int count = 0;
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"))) {
			//데이터의 갯수를 모른다면..?
			while(true) {
				sum += dis.readInt();
				count ++;
			}
//			for(int i=0; i<5; i++)
//			{
//				sum += dis.readInt();
//			}
		} catch (EOFException e) { //예외처리 오류가나면 여기로와서 처리
			avg = (sum/count
					);
			
			System.out.println("총점 : " + sum);
			System.out.println("합계 : " + avg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}//TEST4

}
