package oop1.day3;

import oop1.day1.animal.Animal;

public class StaticVO {
	
	//접근제한자에 따른 클래스 변수 접근 방법
	//1. public static인 경우
	public static Animal ani = new Animal();
	
	//2. private static인 경우
	private static Animal ani2 = new Animal();
	//외부에서는 사용이 불가능하고, 내부에서만 사용이 가능 (private때문)
	
	//일반적인 getter/setter
//	public Animal getAni2() 
//	{
//		return ani2;
//	}
//	
//	public void setAni2(Animal ani2)
//	{
//		this.ani2 = ani2;
//	}
	
	public static Animal getAni2()
	{
		return ani2;
	}
	public static void setAni2(Animal ani2)
	{
		StaticVO.ani2 = ani2;
		//Static
	}

}
