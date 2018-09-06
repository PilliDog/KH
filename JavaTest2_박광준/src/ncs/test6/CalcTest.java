package ncs.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate cal = new Calculate();
		Scanner sc = new Scanner(System.in);
		String inputNum;
		int[] userNum = new int[2];

		System.out.println("두 정수를 입력해주세요. (띄어쓰기로 구분)");
		inputNum = sc.nextLine();
		userNum[0] = Integer.parseInt(inputNum.split(" ")[0]);
		userNum[1] = Integer.parseInt(inputNum.split(" ")[1]);
		
		if((userNum[0] < 1 || userNum[0] > 9) || (userNum[1] < 1 || userNum[1] > 9))
		{
			System.out.println("1과 9 사이의 정수를 입력해주세요.");
			System.exit(0);
		}
		
		System.out.println("합 : " + cal.sum(userNum[0], userNum[1]));
		System.out.println("차 : " + cal.subtract(userNum[0], userNum[1]));
		System.out.println("곱 : " + cal.multiply(userNum[0], userNum[1]));
		System.out.println("나누기 : " + cal.divide(userNum[0], userNum[1]));
	} 

}
