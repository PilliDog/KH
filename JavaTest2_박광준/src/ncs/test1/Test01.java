package ncs.test1;

import java.util.Scanner;

public class Test01 {
    
    static Scanner sc = new Scanner(System.in);
    static String userInput;
    static String[] result;
    static double resultAvg;

    public static void main(String[] args) {
        
        while(true)
        {
            System.out.print("평가 점수를 입력해주세요.\n"
                            +"각 평가 점수는 공백으로 구분합니다.\n\n"
                            +">> ");
            userInput = sc.nextLine();
            result = userInput.split(" ");
            
            if(result.length != 5)
            {
                System.out.print("다시 입력하세요.\n\n");
            }
            else
            {
                break;
            }
        }
        
        double[] resultPoint = new double[result.length];
        
        for(int i=0; i<result.length; i++)
        {
            resultPoint[i] = Double.parseDouble(result[i]);
            if(resultPoint[i] < 10 && resultPoint[i] > 99)
            {
                System.out.println("다시 입력하세요.");
                return;
            }
        }
        
        resultAvg = ((resultPoint[0] + resultPoint[1])/2)*0.6;
        resultAvg += ((resultPoint[2] + resultPoint[3])/2)*0.2;
        resultAvg += resultPoint[4] * 0.2;
        System.out.println("평가점수 : " + resultAvg + "점");
        System.out.print("Class: ");
        
        
        if(resultAvg >= 90)
        {
            System.out.println("Gold Class");
        }
        else if(resultAvg >= 80)
        {
            System.out.println("Silver Class");
        }
        else if(resultAvg >= 70)
        {
            System.out.println("Bronze Class");
        }
        else
        {
            System.out.println("Normal Class");
        }
        
        
        
        

    }
}