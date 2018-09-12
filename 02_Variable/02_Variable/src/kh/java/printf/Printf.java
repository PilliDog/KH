package kh.java.printf;

public class Printf {
	public static void main(String[] args){
		Printf pf = new Printf();
		pf.test();
	}

	private void test() {
		boolean b = true;
		
		char c = '헐';
		char ga = '\uac00';//유니코드를 \\u(이스케이핑)+ac00으로 표현함. 
		char na = '\uB098'; 
		char da = '\ub2e4';
		char rak = '\uF914';
		String str = "가나다";
		
		int i = 12345;
		
		float f = 1234.567f;
		double d = 345.678;
		
		/*
		 * 문자형
		 * %c
		 * %s
		 * 
		 */
		System.out.printf("%c, %c, %c, %c, %c, %s", c, ga, na, da, rak, str);
		System.out.println();
		
		/*
		 * 숫자형-정수형
		 * %d
		 * %o
		 * %x
		 * 단, 2진수는 포맷지원하지 않음. => Integer.toBinaryString(i)
		 */
		System.out.printf("%d, 0x%x, 0%o, %s ",i, i, i, Integer.toBinaryString(i));
		System.out.println();

		/*
		 * 
		 * 숫자형-실수형
		 * %f : 소수점아래6자리
		 * %e : 지수형태표현
		 * %g : %e와 %f 중 더 짧은 표현을 사용
		 * %a, %A : 16진수 실수(대/소문자 표현)
		 */
		System.out.printf("%f, %f, %A, %e, %g ", f, d, d, d, d);
		System.out.println();
//		System.out.printf("%f, %f, %a, %e, %g ", f, d, d, d, d);
//		System.out.println();
		
		/*
		 * 논리형
		 * %b
		 */
		System.out.printf("%b", b);
		System.out.println();
		
		/*
		 * 너비 및 정렬방법
		 * %[flag][width]포맷
		 * flag생략시 우측정렬
		 * flag = -(음수) 좌측정렬
		 * 10%d
		 * -10%d
		 */
		System.out.printf("%10d, %-10d.", i, i);
		System.out.println();
		/*
		 * 소수점아래 표시
		 * %.2f 소수점 둘째자리까지 표현
		 */
		System.out.printf("%.3f",123.45678789);
		System.out.println();
	}
}
