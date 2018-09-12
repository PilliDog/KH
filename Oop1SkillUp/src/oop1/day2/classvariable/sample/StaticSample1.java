package oop1.day2.classvariable.sample;

import oop1.day2.classvariable.model.vo.StaticVO;

public class StaticSample1 {
	private StaticVO sv1 = new StaticVO();
	private StaticVO sv2 = new StaticVO();
	
	//이 두객체가 Static 변수를 공유하고 있다??
	public void method()
	{
		System.out.println("1. 클래스 변수 필드 공유 확인하기");
		System.out.println("변경 전");
		System.out.println("sv1.number = " + sv1.number);
		System.out.println("sv2.number = " + sv2.number);
		
		//클래스 이름으로 바로 접근 가능하지만
		//객체를 생성해서 접근하는 것도 가능하다.
		
		System.out.println();
		
		StaticVO.number = 0;
		System.out.println("변경 후");
		System.out.println("sv1.number = " + sv1.number);
		System.out.println("sv2.number = " + sv2.number);
		System.out.println("StaticVO.number = " + StaticVO.number);
		//static변수를 불러올 때 객체를 생성해서 접근하는 것보다
		//클래스이름.변수명 으로 접근하는것을 권장한다
		//>>인스턴스를 생성해서 접근하는 것은 일반 필드에 접근하는 방법과 구분이 어렵기 때문에
		
	}
	
}
