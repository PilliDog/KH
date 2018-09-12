package kh.java.oop.method;

public class Run {

	public static void main(String[] args) {
		
		MethodTest start = new MethodTest();
		start.nonStatic_void_noParam();
		start.nonStatic_void_param("ㅋ");
		start.nonStatic_returnVal_noParam();
		start.nonStatic_returnVal_Param("ㅋ");
		
		System.out.println();
		System.out.println();
		System.out.println();
		String result = start.nonStatic_returnVal_noParam();
		System.out.println("result : " + result);
		result = start.nonStatic_returnVal_Param("ㅋ");
		System.out.println("result : " + result);
		
		
		//static메소드
		System.out.println("========= static method =========");
		//start.static_returnVal_noParam();
		MethodTest.static_returnVal_noParam();
		MethodTest.static_returnVal_param("ㅎ");
		
		result = MethodTest.static_returnVal_noParam();
		System.out.println("result : " + result);
		result = MethodTest.static_returnVal_param("ㅎ");
		System.out.println("result : " + result);
	}

}
