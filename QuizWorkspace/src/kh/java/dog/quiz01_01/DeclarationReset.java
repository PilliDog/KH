package kh.java.dog.quiz01_01;

public class DeclarationReset {
	
	//1. 변수 선언 및 초기화
	static byte _byte = 100;
	static long _long = 999999999999L;
	static float _float = 486.520F;
	static double _double = 567.890123;
	static char _char = 'A';
	static String _String = "Hello world!";
	static boolean _boolean = true;
	
	
	//2. 호출 메소드
	public static byte get_byte() {
		return _byte;
	}
	public static void set_byte(byte _byte) {
		DeclarationReset._byte = _byte;
	}
	public static long get_long() {
		return _long;
	}
	public static void set_long(long _long) {
		DeclarationReset._long = _long;
	}
	public static float get_float() {
		return _float;
	}
	public static void set_float(float _float) {
		DeclarationReset._float = _float;
	}
	public static double get_double() {
		return _double;
	}
	public static void set_double(double _double) {
		DeclarationReset._double = _double;
	}
	public static char get_char() {
		return _char;
	}
	public static void set_char(char _char) {
		DeclarationReset._char = _char;
	}
	public static String get_String() {
		return _String;
	}
	public static void set_String(String _String) {
		DeclarationReset._String = _String;
	}
	public static boolean is_boolean() {
		return _boolean;
	}
	public static void set_boolean(boolean _boolean) {
		DeclarationReset._boolean = _boolean;
	}
	
}