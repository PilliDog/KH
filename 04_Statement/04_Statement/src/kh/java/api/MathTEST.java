package kh.java.api;

public class MathTEST {

	public static void main(String[] args) {
		
		//new MathTEST().test1();
		new MathTEST().test2();
	}
	
	
	public void test1() {
		
		double result = 0.0;

		//1.올림 (ceiling -> 천장)
		result = Math.ceil(7.8);
		System.out.println("올림 : " + result); //8.0
		result = Math.ceil(5.2);
		System.out.println("올림 : " + result); //6.0
		result = Math.ceil(-6.7);
		System.out.println("올림 : " + result); //-6.0
		
		//2.내림(floor -> 바닥)
		result = Math.floor(7.8); //7.0
		System.out.println("내림 : " + result);
		result = Math.floor(-6.7); //-7.0
		System.out.println("내림 : " + result);
		
		//3. 반올림
		result = 94.527;
		long r = Math.round(result); //8.0
		System.out.println("반올림 : " + r); //95
		
		//소수부 둘째자리까지 반올림해서 표현
		result = 94.527;
		result *= 100.0; //9452.7
		
		double rr = Math.round(result); //9453
		rr /= 100.0; //94.53
		
		System.out.println(rr);
		
		
		//퀴즈!! 87.4753 >> 반올림해서 소수점첫째자리까지 표현하기
		double num = 87.4753;
		
		num *= 10;
		num = Math.round(num);
		num /= 10.0;
		System.out.println(num);
		
		
		
	}
	
	
	public void test2() {
		
		//103개의 귤이 있고, 
		//귤을 10개씩 담을 수 있는 바구니가 있을 때, 
		//몇 개의 바구니가 필요할 것인지 구하라
		
		int orangeCnt = 103;
		double box = 10;
		double result = 0.0;
		
		result = (orangeCnt / box);
		result = Math.ceil(result);
		System.out.println("이 오렌지를 전부 담기 위해선 " + result + "개의 박스가 필요해");
		
	}

}
