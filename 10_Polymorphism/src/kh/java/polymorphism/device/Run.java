package kh.java.polymorphism.device;

import java.util.Arrays;

public class Run {
	Device[] arr = new Device[10];
	{
	arr[0] = new TV("삼성", "평면TV", 3000000, 15);
	arr[1] = new LapTop("LG", "똥북", 100000, 256);
	arr[2] = new LapTop("Apple", "금북", 200000, 256);
	arr[3] = new LapTop("레노버", "은북", 300000, 256);
	}

	public static void main(String[] args) {
		Run r = new Run();
		//r.test1();
		//객체배열
		//r.test2();
		//r.test3();
		
		//리턴타입에서 다형성 사용하기
//		Device d = r.test4();
//		r.checkDeviceType(d);
		
		
		/**
		 * 동적바인딩
		 * 컴파일 시 정적으로 바인딩된 메소드를 실행하면
		 * 당시의 객체타입기준으로 바인딩 되는것을 동적바인딩이라 함
		 * 
		 * 상속관계에서 다형성이 적용된 경우,
		 * 메소드가 오버라이딩 되어 있으면, 정적으로 바인딩된 것보다
		 * 오버라이딩된 메소드가 우선순위가 높다
		 * 
		 * 다형성을 이용해 부모타입으로 자식객체를 핸들링하면서도
		 * 별도의 형변환없이 오버라이딩을 이용해서 제어가능
		 * 에)Object클래스의 tostring메소드
		 */
		
		//동적바인딩
		//r.test5();
		
		//toString 동적바인딩
		r.test6();
	}
	
	public void test1()
	{
		TV tv1 = new TV("삼성", "평면TV", 3000000, 10);
		LapTop laptop = new LapTop("LG", "똥북", 100000, 256);
		
		System.out.println(tv1.getChannel());
		tv1.channelUp();
		System.out.println(tv1.getChannel());
		tv1.channelDown();
		
		Device device1 = new TV("삼성", "평면TV", 3000000, 15);
		Device device2 = new LapTop("LG", "똥북", 100000, 256);
		
		System.out.println(((TV)device1).getChannel());
		((TV)device1).channelUp();
		System.out.println(((TV)device1).getChannel());
		((TV)device1).channelDown();
	}
	
	public void test2()
	{
		//1.부모타입의 객체배열에 자식객체 추가하기
		
		
		System.out.println("--------------------");
		for(int i=0; i<arr.length; i++)
		{
			
			if(arr[i] != null) {
//				if(arr[i] instanceof TV) System.out.println();
//					
//				}
//				else if(arr[i] instanceof LapTop)
//				{
//					
//				}
				
			System.out.println(arr[i].getDeviceInfo());
			}
		}
		
		//2. instanceof 연산자
		//참조변수가 가리키는 인스턴스의 실제타입을 체크함 >> boolean 리턴
		//이항연산자이면, 피연산자는 좌항이 참조형변수, 우항이 타입.
		//instanceof의 연산결과가 true이면, 해당 타입으로의 형변환을 보장함
		
		if(arr[0] instanceof TV) System.out.println("TV타입");
		if(arr[1] instanceof LapTop) System.out.println("LapTop타입");
		if(arr[2] instanceof Device) System.out.println("Device타입");
		if(arr[3] instanceof Object) System.out.println("Object타입");
		
		//3. instanceof를 활용한 객체배열
		System.out.println("------------------------------------");
		for(int i=0; i<arr.length; i++)
		{
			
			if(arr[i] != null) {
				if(arr[i] instanceof TV)
				{
					System.out.println(((TV)arr[i]).getTVInfo());
				}
				else if(arr[i] instanceof LapTop)
				{
					System.out.println(((LapTop)arr[i]).getLapTopInfo());
				}
				
			//System.out.println(arr[i].getDeviceInfo());
			}
		}
	}//end of test2
	
	public void test3()
	{
		for(int i=0; i<arr.length; i++)
		{
			checkDeviceType(arr[i]);
		}
	}//end of test3
	
	public void checkDeviceType(Device d)
	{
		if(d == null) return;
		
		if(d instanceof TV)
		{
//			TV t = (TV)d;
//			System.out.println(t.getTVInfo());
			((TV)d).getTVInfo();
			System.out.println("TV객체");
		}
		else if(d instanceof LapTop)
		{
//			LapTop l = (LapTop)d;
//			System.out.println(l.getLapTopInfo());
			((LapTop)d).getLapTopInfo();
			System.out.println("LapTop객체");
		}
	}
	
	public Device test4()
	{
		int num = (int)(Math.random() * 100) + 1;
		if(num%2 == 0)
		{
			return new TV();
		}
		else
		{
			return new LapTop();
		}
	}
	
	public void test5() 
	{
		Device d = new Phone("삼성", "갤럭시9", 1000000, "SKT");
		System.out.println(d.getDeviceInfo());
	}
	
	public void test6()
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != null)
			{
				System.out.println(arr[i]);
				// == System.out.println(arr[i].toString);
			}
		}
	}
}
	
	


