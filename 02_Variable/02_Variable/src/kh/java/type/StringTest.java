package kh.java.type;

public class StringTest {

	public static void main(String[] args) {
		
		StringTest s = new StringTest();
		s.test1();

	}
	
	public void test1() {
	
		String str1 = "기차"; //기본형처럼 사용(literal)
		String str2 = new String("기차"); // 참조형
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		String str3 = "기차" + "칙칙폭폭";
		String str4 = new String("기차" + "칙칙폭폭");
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		//문자열과 정수가 만나면 문자열이 된다 >> 기차123(문자열) + 45 + 칙칙폭폭 
		String str5 = "기차" + 123 + 45 + "칙칙폭폭";
		String str6 = new String(123 + 45 + "기차" + "칙칙폭폭");
		System.out.println("str5 : " + str5);
		System.out.println("str6 : " + str6);
		
		//c : 아스키코드로 99
		//char와 정수가 만나면 정수로 형변환이 됨
		System.out.println("abc" + ('c'+1));
		//abcc1
		System.out.println("abc" + 'c'+1);
			
		
	}

}
