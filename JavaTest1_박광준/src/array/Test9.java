package array;

import java.util.Arrays;

public class Test9 {

	public static void main(String[] args) {
		
		int [][] array = {{12, 41, 36, 56}, 
						 {82, 10, 12, 61}, 
						 {14, 16, 18, 78}, 
						 {45, 26, 72, 23}}; 
		
		//최소값과 최대값을 구하기 위한 변수를 생성
		int min = 999;
		int max = 0;
		
		for(int i=0; i<array.length; i++)
		{
			
			for(int j=0; j<array[i].length; j++)
			{
				Arrays.sort(array[j]); //sort를 쓰지않고 정렬하는 방법을 공부해보자.....
				if(min > array[i][0]) //sort 메소드를 통해 오름차순이 된 상태에서, 맨 첫번째 인덱스는 최소값이 된다. 이를 현재 최소값과 비교한다.
				{					
					min = array[i][0];
				}
				if(max < array[i][3]) //반대로 마지막 인덱스는 최대값이 될 것이다. 길이를 알기 때문에 3으로 입력했지만 'length'를 쓰는 습관을 들여야 할 것 같다. 
				{
					max = array[i][3];
				}
			}
		}
		
		//최종적으로 최소값과 최대값을 출력한다
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
		

	}

}
