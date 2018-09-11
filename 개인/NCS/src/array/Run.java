package array;

public class Run {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		double arrayAvg = 0;
		double arraySum = 0;
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[0].length; j++)
			{
				arraySum += array[i][j];
			}
		}
		arrayAvg = (arraySum / (array.length * array[0].length));
		
		System.out.println("합계 : " + arraySum);
		System.out.println("평균 : " + arrayAvg);
	}

}
