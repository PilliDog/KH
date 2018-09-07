package kh.java.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
	static String temp = "";
	static char[] carr;

	public static void main(String[] args) {
//		String str = "J a v a P r o g r a m ";
//		
//		char carr[] = str.toCharArray();
//		System.out.println("토큰 처리전 글자 출력 ========" );
//		for(int i=0; i<carr.length; i++)
//		{
//			System.out.print(carr[i]);
//		}
//		System.out.println(" \n\n전 글자갯수 출력 ========");
//		System.out.println(str.length());
//		System.out.println("\n토큰 처리 후 글자갯수 출력 확인 ========");
//		StringTokenizer stn = new StringTokenizer(str, " ");
//		while(stn.hasMoreTokens())
//		{
//			carr = (stn.nextToken()).toCharArray();
//		}
//		
//		System.out.println(carr.length);
//		for(int i=0; i<carr.length; i++)
//		{
//			System.out.println(carr[i]);			
//		}
//		System.out.println(temp.length());
////		carr = temp.toCharArray();
//		System.out.println(carr.length);
//		String str2;
//		str2 = String.valueOf(carr);
//		str2.toUpperCase();
//		System.out.println(str2);

		
		
		
		String str = "J a v a P r o g r a m ";
		
		char carr[] = str.toCharArray();
		System.out.println("토큰 처리전 글자 출력 ========" );
		for(int i=0; i<carr.length; i++)
		{
			System.out.print(carr[i]);
		}
		System.out.println(" \n\n전 글자갯수 출력 ========");
		System.out.println(str.length());
		System.out.println("\n토큰 처리 후 글자갯수 출력 확인 ========");
		StringTokenizer stn = new StringTokenizer(str, " ");
		int cnt = 0;
		while(stn.hasMoreTokens())
		{
			carr[cnt++] = stn.nextToken().charAt(0);
		}
		System.out.println(temp.length());
		carr = temp.toCharArray();
		System.out.println(carr.length);
		String str2;
		str2 = String.valueOf(carr);
		str2.toUpperCase();
		System.out.println(str2);
		
		
	}
	
	

}
