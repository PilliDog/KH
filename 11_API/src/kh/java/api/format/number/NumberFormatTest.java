package kh.java.api.format.number;

import java.text.DecimalFormat;

public class NumberFormatTest {

	public static void main(String[] args) {
		new NumberFormatTest().test1();
	}
	
	//개발자가 원하는대로 정수, 실수의 형식을 지정가능
	public void test1()
	{
		double num = 123456789.123;
		
		//숫자가 35.829283
		//00.# => 35.8
		//0.## => 35.83 <반올림 처리됨>
		//000.## => 035.83
		//0과 #의 차이는 공란일 경우, 0은 0으로 채움, #은 비움
		DecimalFormat df = new DecimalFormat("0.##");
		System.out.println(df.format(num));
		df.applyPattern("0.######");
		System.out.println(df.format(num));
		df.applyPattern("0.00000");
		System.out.println(df.format(num));
		df.applyPattern("#,###");
		System.out.println(df.format(num));
	}

}
