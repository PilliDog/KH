package kh.java.multi.dimentional.array;

public class VariableArray {

	public static void main(String[] args) {
		
		new VariableArray().test1();

	}
	
	
	/*
	 * ## 가변 배열은 자료형이 같은 1차원 배열 여러개를 하나로 묶은 것임.
	 * 묶여있는 1차원 배열의 길이가 같을 필요는 없다.
	 */
	public void test1() {
		
		int[][] arr = new int[3][];
		
		System.out.println(arr[0]);//null
		System.out.println(arr[1]);//null
		System.out.println(arr[2]);//null
		
		//System.out.println(arr[0].length); // NullPointer
			
		//각 번지수별로 int배열을 할당한다
		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[10];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0].length);
		
		int num = 1;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = num++;
				System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
			}
		}
		
	}

}
