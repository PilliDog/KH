package com.kh.test.break_continue;

import java.util.Scanner;

public class Sanghun {

	public static void main(String[] args) {
		
		Sanghun start = new Sanghun();
		start.test();
		
	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
        {
			
            System.out.print("2보다 큰 숫자를 입력하세요 : ");
            int num = sc.nextInt();
            boolean b = true;
            
            if(num<=2)
            {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
                continue;
            }
            int a = 2;
            while(true){
                if(num%a!=0)
                {
                    a++;
                    break;
                }
                else
                {
                    System.out.println("소수가 아니다.");
                    b = false;
                    break;
                }
            }
            if(b == false) {
            
            }else {
            System.out.println("소수다.");
            }
        }
		
	}
	
}
