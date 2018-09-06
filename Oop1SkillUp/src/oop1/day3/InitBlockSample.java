package oop1.day3;

public class InitBlockSample {
	private int nonStaticVal = 1;
	private static int staticVal = -1;
	
	//인스턴스 초기화 블록
	{
		System.out.println("인스턴스 블록");
		System.out.println("초기화 전");
		System.out.println("nonStaticVal : " + nonStaticVal);
		System.out.println("staticVal : " + staticVal);
		
		nonStaticVal = 10;
		staticVal = 10;
		System.out.println("초기화 후");
		System.out.println("nonStaticVal : " + nonStaticVal);
		System.out.println("staticVal : " + staticVal);
		//인스턴스 블록에는 인스턴스, static변수도 모두 들어올 수 있다.
		System.out.println();
		
	}
	
	//static 초기화블록
	static
	{
		/*
		 * 인스턴스 변수는 객체 새성을 해야 쓸 수 있기 때문에
		 * static초기화블록에 사용하면 에러
		 */
		System.out.println("인스턴스 블록");
		System.out.println("초기화 전");
//		System.out.println("nonStaticVal : " + nonStaticVal);
		System.out.println("staticVal : " + staticVal);
		
//		nonStaticVal = 10;
		staticVal = 10;
		System.out.println("초기화 후");
//		System.out.println("nonStaticVal : " + nonStaticVal);
		System.out.println("staticVal : " + staticVal);
		//인스턴스 블록에는 인스턴스, static변수도 모두 들어올 수 있다.
		System.out.println();
	}
	
	public InitBlockSample() 
	{
		System.out.println("인자가 없는 생성자");
		System.out.println();
	}
	public InitBlockSample(String name)
	{
		System.out.println("인자가 있는 생성자");
		System.out.println();
	}
	
}
