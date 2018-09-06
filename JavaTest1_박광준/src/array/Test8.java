package array;

public class Test8 {

	public static void main(String[] args) {
		
		double sum = 0, avg = 0;
		int cnt = 0; //array배열의 갯수를 구하기 위한 변수, 10번 문제를 푼 후 이 변수가 없어도 된다는 것을 깨달았다
		int[][] array = {{12, 41, 36, 56}, 
						{82, 10, 12, 61}, 
						{14, 16, 18, 78}, 
						{45, 26, 72, 23}}; 
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				cnt ++;
				sum += array[i][j];
				avg = sum/cnt;
			}
		}
		
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);
		

	}

}
