package kh.java.multi.dimentional.array;

public class MultiDimentionalArrayTest {

	public static void main(String[] args) {
		
		MultiDimentionalArrayTest start = new MultiDimentionalArrayTest();
		//start.test1();
		//start.test2();
		//start.setClassmate();
		start.test3();
	}
	
	
	public void test1() {
		
		//1. 배열의 선언
		int[][] arr;
		int arr2[][];
		
		//2. 배열의 할당
		arr = new int[2][3];
		
		//3. 값대입
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
	}
	
	
	public void test2() {
		
		//1. 선언, 할당
		int[][] arr = new int[4][3];
		
		//2. 배열의 요소가 규칙적인 경우, 반복문을 통해 값 대입이 가능함
		int k = 0;
		//값쓰기
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = k;
				k++;
			}
		}
		
		//값읽기
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
			}
		}
	}
	
	
	//내가 속한 분단을 2차원배열로 표현하기
	public void setClassmate() {
		
		String[][] classMate;
		classMate = new String[5][3];
		
		classMate[0][0] = "박광준";
		classMate[0][1] = "도상훈";
		classMate[0][2] = "전미진";
		classMate[1][0] = "곽경국";
		classMate[1][1] = "김병선";
		classMate[1][2] = "정지원";
		classMate[2][0] = "한동준";
		classMate[2][1] = "강선영";
		classMate[2][2] = "조주은";
		classMate[3][0] = "박세준";
		classMate[3][1] = "정지수";
		classMate[3][2] = "조하영";
		classMate[4][0] = "신혜영";
		classMate[4][1] = "조영빈";
		classMate[4][2] = "이현규";
		/*
		classMate[4][3] = "정명훈";
		classMate[5][0] = "김민우";
		classMate[5][1] = "김은찬";
		classMate[5][2] = "변창빈";
		classMate[5][3] = "정창학";
		*/
		
		printClassmate(classMate);
		//매개인자는 값 // 을 던지고
		//매개변수는 공간 // 
		
		
	}
	
	public void printClassmate(String[][] classMate) {
		
		for(int i=0; i<classMate.length; i++)
		{
			for(int j=0; j<classMate[0].length; j++)
			{
				System.out.print(classMate[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	
	public void test3() {
		
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
		int[][] arr2 = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}};
		
		String[][] classMate = new String[][] {
												{"박광준", "도상훈", "전미진"},
												{"광격국", "김병선", "정지원"}, 
												{"한동준", "강선영", "조주은"}, 
												{"박세준", "정지수", "조하영"}, 
												{"신혜영", "조영빈", "이현규"}
												};
		
		
//		classMate[0][0] = "박광준";
//		classMate[0][1] = "도상훈";
//		classMate[0][2] = "전미진";
//		classMate[1][0] = "곽경국";
//		classMate[1][1] = "김병선";
//		classMate[1][2] = "정지원";
//		classMate[2][0] = "한동준";
//		classMate[2][1] = "강선영";
//		classMate[2][2] = "조주은";
//		classMate[3][0] = "박세준";
//		classMate[3][1] = "정지수";
//		classMate[3][2] = "조하영";
//		classMate[4][0] = "신혜영";
//		classMate[4][1] = "조영빈";
//		classMate[4][2] = "이현규";
		
		for(int i=0; i<classMate.length; i++)
		{
			for(int j=0; j<classMate[0].length; j++)
			{
				System.out.print(classMate[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
