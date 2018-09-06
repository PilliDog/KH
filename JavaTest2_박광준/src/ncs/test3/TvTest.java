package ncs.test3;

public class TvTest {

	public static void main(String[] args) {
		//Tv객체를 3개 생성!
		Tv[] engine = new Tv[3];
		
		//각 객체에 값을 넣어줌
		engine[0] = new Tv("INFINAIA", 1500000, "LED TV");
		engine[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		engine[2] = new Tv("CINEMA", 2000000, "3D TV");
		int maxArrIndex = 0, minArrIndex = 0;
		
		//배열출력 및 최대값 최소값 비교
		for(int i=0; i<engine.length; i++)
		{
			
			System.out.println(engine[i].toString());
			if(engine[i].getPrice() > engine[maxArrIndex].getPrice())
			{
				maxArrIndex = i;
			}
			
			if(engine[i].getPrice() < engine[minArrIndex].getPrice())
			{
				minArrIndex = i;
			}
			
			//배열의 마지막 출력일 경우, 최대값 최소값 출력
			if(i == (engine.length -1))
			{
				System.out.print("가격이 가장 비싼 제품 : " + engine[maxArrIndex].getName() + "\n");
				System.out.print("가격이 가장 저렴한 제품 : " + engine[minArrIndex].getName() + "\n");
			}
		}
	}

}
