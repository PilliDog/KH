package kh.java.object.array;

public class Main {

	public static void main(String[] args) {
		//객체배열
		//int[] arr = new int[5];
		//int[] arr2 = {1, 2, 3, 4, 5};
		
		Person[] personArr = new Person[5];
		
		for(int i=0; i<personArr.length; i++)
		{
			System.out.println("personArr[" + i + "] : " + personArr[i]);
			
		}
		//각 인덱스별로 객체를 생성후에 대입해야함
		personArr[0] = new Person("김보람", 28);
		personArr[1] = new Person("신혜영", 22);
		personArr[2] = new Person("조하영", 26);
		personArr[3] = new Person("장선웅", 28);
		personArr[4] = new Person("김민성", 28);
		
		
		for(int i=0; i<personArr.length; i++)
		{
			System.out.println("personArr[" + i + "] : " + personArr[i].toString());
		}
		
		for(int i=0; i<personArr.length; i++)
		{
			System.out.println("personArr[" + i + "] : " + personArr[i].gerPersonInfo() + "(" + personArr[i].hashCode() + ")");
		}
		
	}

}
