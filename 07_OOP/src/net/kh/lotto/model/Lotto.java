package net.kh.lotto.model;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	private int[] lotto = new int[6];
	{
		Random rnd = new Random();
		for(int i=0; i<6; i++)
		{
			lotto[i] = (int) (Math.random() * 45 + 1);
			
			//중복제거
			for(int j=0; j<i; j++)
			{
					if(lotto[i] == lotto[j])
					{
						i--;
						System.out.println("증복이라 제거했어");
					}
			}
		}
		Arrays.sort(lotto);
		
		//오름차순 정렬, 1~45 난수, 중복제거
	}
	
	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	
	
	public void information() {
		
		System.out.println(Arrays.toString(lotto));
		
	}

}
