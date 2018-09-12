package test.controller;

public class Test3 {

	public static void main(String[] args) {
		
		int num = 1; //우리는 1부터 계산
		double sum = 0, avg = 0;
		
		while(num<=100) //우리는 100까지 계산
		{
			sum += num; //더함
			num++; //한칸 씩 값을 올림
		}
		
		avg = sum/100; //최종적으로 평균을 구함
		System.out.println("합계 : " + sum); //출력
		System.out.println("평균 : " + avg); //출력

	}

}
