package test.controller;

public class Test2 {

	public static void main(String[] args) {
		
		for(int i=2; i<=5; i++) //2단부터 5단까지 출력하기 위한 for문
		{
			for(int j=1; j<=9; j++) //1부터 9까지 곱한다
			{
				if((i*j)%2 == 0) continue; //만약 구구단의 결과가 짝수라면 패스
				System.out.println(i + " * " + j + " = " + (i*j)); //결과를 출력
			}
		}

	}

}
