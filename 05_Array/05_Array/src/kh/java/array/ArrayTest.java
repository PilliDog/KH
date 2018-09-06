/*	
	## 배열
	동일한 데이터타입을 가지는 여러개의 데이터를 담을 수 있음
 */

package kh.java.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		//new ArrayTest().test();
		//new ArrayTest().test2();
		//new ArrayTest().test3();
		//new ArrayTest().test4();
		//new ArrayTest().test5();
		//new ArrayTest().test6();
		//new ArrayTest().test7();
		new ArrayTest().test8();
	}
	
	// 국어, 영어, 수학, 사회, 과학, 체육, 음악의 점수를 배열을 통해 처리
	public void test() {
		
		Random generate = new Random();
		
		//int [] resultPoint;
		//1. 배열의 선언
		int subject [] ;
		
		
		//2. 메모리에 할당
		subject = new int[7]; // 매개인자로 배열의 크기를 지정, heap이라는 공간에 배열이 생김
		int sum = 0;
		double avg = 0;
		
		//호출해보자
//		for(int i = 0; i <= 6; i++)
//		{			
//			System.out.println(i + "번째의 배열 : " + subject[i]);
////		}
		
	//	int cm = subject.length;
		//System.out.println(cm);
		//3. 데이터의 입력
		int j = 0;
		while(j < subject.length)
		{
			subject[j] = generate.nextInt(100) + 0;
			System.out.println(j + "번째의 배열 : " + subject[j]);
			sum += subject[j];
			avg = (sum/subject.length);
			j++;
			if(j == (subject.length)) {
				break;
			}
			
		}
		
		System.out.println("합  : " + sum);
		System.out.println("평  : " + avg);
		
		
		
	}
	
	
	//퀴즈!!! 총점/평균을 구하시오.
	public void test2() {
		
		int subject [];
		int sum = 0;
		double avg = 0;
		
		subject = new int[7];
		
		Random generate = new Random();
		
		for(int i = 0; i < subject.length; i++)
		{
			subject[i] = generate.nextInt(100) + 0;
			System.out.println(i + "번째의 배열 " + subject[i]);
			sum += subject[i];
			
		}
	}
	
	//초기화 : 배열의 선언과 동시에 값을 할당함.
	//heap영역에서 지정하는 타입별 초기값(0)이 아닌 지정값으로 
	public void test3() {
		
		int subject [] = new int [] { 100, 200, 300, 400 }; //값을 지정할 필요가 없다.
		//int subject2 [] = { 1, 2, 3, 4 };
		
		//forEacn문(향상된 for문)
		//for(배열요소의 타입 변수명 : 배열명){}
		
		for(int num : subject)  //바로 결과가 나온다!
		{
			System.out.println(num);
		}
		
	}
	
	
	public void test4() {
		
		//new 는 heap 메모리에 생성됨, 일반 변수의 메모리는 스택 // heap은 주소값만으로만 접근할 수 있다.
		int intArr[] = new int[5];
		char charArr[] = new char[10];
		
		System.out.println("intArr : " + intArr); //[I@7852e922
		System.out.println("charArr : " + charArr); //[C@4e25154f

		//hash코드는 실제 주소값은 아니고, 실제 주소를 가리키는 key 역할을 한다.
		//자바에서는 직접 메모리에 접근할 수 없어서, 정확한 메모리 주소는 알 수 없다.
		//이 hash코드가 주소는 아니지만, 메모리 주소값 처럼 사용할 수 있음.
		System.out.println("intArr의 Hashcode : " + intArr.hashCode()); //2018699554 >> 어떻게 보면 주소값이라 이해하면됨
		System.out.println("charArr의 Hashcode : " + charArr.hashCode()); //1311053135
		
		
		//배열의 한계
		//생선된 배열은 크기를 변경하지 못한다.
		double doubleArr[] = new double[10];
		//doubleArr변수는 Stack 메모리에 생김, 그 다음 'new'라는 연산을 통해 'heap'메모리에 생성되며 '0(0.0)'값으로 초기화됨
		System.out.println("before : " + doubleArr.hashCode()); // 118352462
		
		doubleArr = new double[30];
		System.out.println("After : " + doubleArr.hashCode()); // 1550089733
		
		//배열(객체)의 삭제 : 직접 삭제불가
		//자바에서 객체 삭제 방법은 : 참조변수를 null로 변경하여,
		//참조할 주소를 삭제함. (연결을 끊어버림)
		//일정시간 후 garbege collecter 가 메모리정리.
		doubleArr = null;
		
		//처음뵙겠습니다~~~~~~~~~ NullPointerExceptionn
		System.out.println("삭제 후 배열 접근 : " + doubleArr.length);
		
		
		
	}
	
	/*
	 * 실습문제 : 본인의 이름, 전화번호, 주소값을 차례로 담은 문자열배열을 생성하세요.
	 */
	
	public void test5() {
		
		Scanner sc = new Scanner(System.in);
		String info[] = new String[3]; // 3개의 문자열을 저장할 수 있는 배열을 만들었다.
		
		for(int i = 0; i < info.length; i++)
		{
			switch(i) 
			{
				case 0 : System.out.print("이름을 입력하세요. : ");
					     info[i] = sc.nextLine();
				break;
				
				case 1 : System.out.print("전화번호를 입력하세요. : ");
						 info[i] = sc.nextLine();
				break;
				
				case 2 : System.out.print("주소를 입력하세요. : ");
			     info[i] = sc.nextLine();
			    break;
			}
		}
		
		for(String data : info)
		{
			System.out.println(data);
		}
		
		
	}
	
	/*
	 * 실습문제 : 알파벳소문자배열을 생성하고 출력하기(반복문 사용)
	 */
	
	public void test6() {
		
		char eng[] = new char[26];
		int inputEng = 97;
		
		for(int i = 0; i < eng.length; i++)
		{
			eng[i] = (char)inputEng;
			inputEng ++;
		}
		
		for(char result : eng)
		{
			System.out.println(result);
		}
		
	}
	
	
	
	/*
	 * 실습문제 : 사용자의 이름을 한 글자씩 입력 받아서 char 배열을 생성하고 최종적으로 문자열을 출력할 것. 
	 * 이름 글자수를 입력 받을 것. String api에서 적합한 생성자를 찾아 char 배열을 문자열로 생성할것
	 */
	public void test7() {
		
		Scanner sc = new Scanner(System.in);
		int numCnt = 0;
		
		System.out.print("당신의 이름은 몇 글자 인가요? : ");
		numCnt = sc.nextInt();
		
		char name[] = new char[numCnt];
		
		for(int i = 0; i < name.length; i++)
		{
			System.out.print((i+1) + "번째 글자를 입력해주세요. : ");
			name[i] = sc.next().charAt(0);
		}
		
		System.out.println(name);
		String nameReuslt = new String(name);
		
		
	}

	
	public void test8() {
		
		int num[] = {1, 2, 3, 4, 5};
		int num2[] = new int [] {1, 2, 3, 4, 5};

		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.println(num);
		}
		
		for(int result : num)
		{
			System.out.println(result);
		}
		
		System.out.println("=====================");
		
		for(int i = 0; i < num2.length; i++)
		{
			System.out.println(num2[i]);
		}
		
		for(int result : num2)
		{
			System.out.println(result);
		}
		
	}
}
