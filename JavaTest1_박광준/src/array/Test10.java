package array;

import java.util.Arrays;

public class Test10 {

	public static void main(String[] args) {

		int [][] array = {{12, 41, 36, 56}, 
						 {82, 10, 12, 61}, 
						 {14, 16, 18, 78}, 
						 {45, 26, 72, 23}}; 
		int[] copyAr = new int[array.length * array[0].length]; 
		int copyNum = 0; //copyAr배열에 복사하여 넣을 때 인덱스 번호를 계산하기 위한 변수를 생성함
		
		
		//array배열에서 3의 배수를 copyAr에 복사하는 2중 for문 
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				if(array[i][j]%3 == 0) //3의 배수라면 ~
				{
					copyAr[copyNum] = array[i][j]; //3의 배수일 경우 copyAr배열에 저장한다 
					copyNum++; //copyAr의 인덱스를 하나 올린다
				}
				
			}
		}
		
		//중복되는 값을 제거하기 위한 2중 for문, 현재 copyAr의 상태는 3의 배수가 차례대로 적재되어 있으며, 나머지 인덱스는 0으로 초기화 되어있다
		for(int k=0; k<copyAr.length; k++)
		{
			for(int q=(k+1); q<copyAr.length; q++) // q와 k를 비교하게 되면 죄다 같다고 판단된다!!
			{
				if(copyAr[k] == copyAr[q]) //로또에서 사용한 중복제거 방법을 떠올려보자
				{
					copyAr[q] = 0; //k인덱스가 아닌 q인덱스를 사용한 이유는 문제의 실행 결과가 중복된 두 값 중에서 뒤의 값을 지웠기 때문, 0으로 초기화한다.
				}
				
			}
		}
		
		
		//출력을 위한 for문
		System.out.print("copyAr : ");
		for(int p=0; p<copyAr.length; p++)
		{
			if(copyAr[p] == 0) continue; //'0'으로 초기화된 값은 우리에게 의미없는 값이므로 이를 제외한 나머지 값을 출력한다.
			System.out.print(copyAr[p]+ " "); //사이에 빈칸 넣기
		}
		
		
		
	}

}
