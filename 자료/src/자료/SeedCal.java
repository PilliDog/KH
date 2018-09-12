package 자료;

public class SeedCal {

	public static void main(String[] args) {
		double out = 2.00;
		int maxSet = 5000000;
		int nowsd = 10;
		double sd = 1;
		int cnt = 1;
		
		while((nowsd+sd) < maxSet)
		{
			sd = (nowsd/(out-1));
			nowsd += sd;
			out *= 0.99;
			cnt++;
			System.out.println("cnt : " + cnt);
			System.out.println("out : " + out);
			System.out.println("sd : " + sd);
			//if(cnt == 30) break;
		}
		
		
		
		
	}

}
