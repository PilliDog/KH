package ncs.test2;

public class CharTest {

	public static void main(String[] args) {
		//toCharArray : String 메소드 중 하나로 String배열을 Char형으로 변형해줌
		char[] charArr = args[0].toCharArray();
		 
		//거꾸로 출력하기 위한 for문
		for(int i=(charArr.length-1); i >= 0; i--)
		{
			System.out.print(charArr[i]);
		}

	}

}
