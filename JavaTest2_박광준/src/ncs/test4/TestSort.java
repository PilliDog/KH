package ncs.test4;

import java.util.Arrays;
import java.util.Random;

public class TestSort {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		Random generate = new Random();
		
		System.out.print("before : ");
		for(int i=0; i<numArr.length; i++)
		{
			numArr[i] = generate.nextInt(49) + 51; //51부터 ~ 49를 더한 100까지
			System.out.print(numArr[i] + " ");
		}
		
		Arrays.sort(numArr);
		System.out.print("\nafter : ");
		for(int i=0; i<numArr.length; i++)
		{
			System.out.print(numArr[i] + " ");
		}
		
		
		

	}

}
