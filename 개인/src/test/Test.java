package test;

public class Test {

	public static void main(String[] args) {
		String s="hello";
		s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
		System.out.println(s);
	}
	
	
	public Test() {}
	public Test(int a)
	{
	}

}
