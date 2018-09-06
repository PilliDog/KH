package kh.java.array;

import java.util.Arrays;

public class ShallowCopyTest extends ArrayTest {

	public static void main(String[] args) {
		
		ShallowCopyTest start = new ShallowCopyTest();
		start.test1();

	}
	
	
	/*	
	 	## 얕은 복사
	 	heap 영역의 같은 배열객체를 바라보게됨.
	 */
	
	public void test1() {
		
		char[] caar1 = {'a', 'b', 'c', 'd'};
		char[] caar2 = caar1;
		
		String[] a = {"aaa", "bbb", "ccc"};
		
		System.out.print("String 배열을 바로 호출 :");
		System.out.println(a);
		System.out.println("a :" + a);
		
		//스트링으로 바뀌면서 주소값이 나오게됨(?)
		
		//caar2[3] = 's';
		//test2(caar1); // 객체는 주소를 넘김
		System.out.print("char배열을 바로 호출 : ");
		System.out.println(caar1);
		//System.out.println("caar1 : " + Arrays.toString(caar1));
		System.out.print(" \"\"와 배열을 합하여 출력 :  ");
		System.out.println("caar1 : " + caar1);
		
		//System.out.println("주소값 : " + caar1.hashCode());
		//System.out.println("caar2 : " + Arrays.toString(caar2));
		//System.out.println("caar2 : " + caar2);
		//System.out.println("주소값 : " + caar2.hashCode());
		
		
	}
	
	
	public void test2(char[] caar3) {
		
		caar3[3] = 'x';
		System.out.println("caar3 : " + Arrays.toString(caar3));
		System.out.println("주소값 : " + caar3.hashCode());
		
		
	}

}
