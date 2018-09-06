package kh.java.api.token;

import java.util.StringTokenizer;

public class TokenTest {
	static String temp = "";
	static char[] carr;

	public static void main(String[] args) {
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
		while(stn.hasMoreTokens())
		{
			temp += stn.nextToken();
		}
		System.out.println(temp.length());
		carr = temp.toCharArray();
		System.out.println(carr.length);
	}

}
