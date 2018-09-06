package kh.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		new Test5().test();

	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		String[] info = new String[1];
		String[] info2 = info.clone();
		String[] secret = {"*", "*", "*", "*", "*", "*", "*"};
		
		System.out.print("주민등록 번호를 입력해주세요. : ");
		info[0] = sc.nextLine();
		info2 = info.clone();
		
		System.arraycopy(secret, 0, info2, 6, secret.length); 
		
		System.out.println(Arrays.toString(info2));
		
		
	}

}
