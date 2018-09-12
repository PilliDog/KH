package kh.java.oop.method;

public class MethodTest {
	
	private String mVal = "mVal";
	public static String sVal = "sVal";
	
	//non-static 메소드
	public void nonStatic_void_noParam() {
		System.out.println("======= nonStatic_void_noParam =======");
		System.out.println("파라미터 없졍. 리턴값 없졍");
		//메소드 몸체를 모두 실행하면, 해당 메소드를 호출한 코드로 리턴함
		//jvm이 아래 코드를 자동실행. 생략가능(return;)
		System.out.println();
		return; //리턴값이 아무것도 없어야해
	}
	
	
	public void nonStatic_void_param(String s) {
		
		mVal = s;
		System.out.println("======= nonStatic_void_param =======");
		System.out.println("파라미터 : " + s + " / 리턴값 없음");
		System.out.println();
		
	}
	
	
	public String nonStatic_returnVal_noParam() {
		
		System.out.println("======= nonStatic_returnVal_noParam =======");
		System.out.println("파라미터 없음 / 리턴값 : " + mVal);
		System.out.println();
		
		return mVal;
	}
	
	
	public String nonStatic_returnVal_Param(String s) {
		
		mVal += s;
		System.out.println("======= nonStatic_returnVal_Param =======");
		System.out.println("파라미터 : " + s + " >> 리턴값 : " + mVal);
		System.out.println();
		
		return mVal;
	}
	
	
	
	
	
	//static 메소드
	public static void static_void_noParam() {
		System.out.println("파라미터 없음 | 리턴값 없음");
	}
	
	public static void static_void_param(String s) {
		sVal = s;
		System.out.println("파라미터 : " + s + "  | 리턴값 없음");
	}
	
	public static String static_returnVal_noParam() {
		System.out.println("파라미터 없음 | 리턴값 : " + sVal);
		return sVal;
	}
	
	public static String static_returnVal_param(String s) {
		sVal += s;
		System.out.println("파라미터 : " + s + "   | 리턴값 : " + sVal);
		return sVal;
	}
	
	

}
