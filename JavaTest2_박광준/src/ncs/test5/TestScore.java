package ncs.test5;

import java.util.Scanner;

public class TestScore {
	
	double subject1, subject2, subject3, sum, avg;
	
	public static void main(String[] args) {
		TestScore[] student = new TestScore[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<student.length; i++)
		{
			student[i] = new TestScore();
			System.out.print("과목1의 점수를 입력하세요 : ");
			student[i].subject1 = sc.nextDouble();
			System.out.print("과목2의 점수를 입력하세요 : ");
			student[i].subject2 = sc.nextDouble();
			System.out.print("과목3의 점수를 입력하세요 : ");
			student[i].subject3 = sc.nextDouble();
			student[i].sum = student[i].subject1 + student[i].subject2 + student[i].subject3;
			student[i].avg = student[i].sum/3;
			System.out.println();
		}
		
		System.out.println("index 과목1 과목2 과목3 총점 평균");
		for(int i=0; i<student.length; i++)
		{
			System.out.println(i + "  " + student[i].subject1 + " " 
					  					+ student[i].subject2 + " "
					  					+ student[i].subject3 + " "
					  					+ student[i].sum + " "
					  					+ student[i].avg);
		}
	}

	public double getSubject1() {
		return subject1;
	}

	public void setSubject1(double subject1) {
		this.subject1 = subject1;
	}

	public double getSubject2() {
		return subject2;
	}

	public void setSubject2(double subject2) {
		this.subject2 = subject2;
	}

	public double getSubject3() {
		return subject3;
	}

	public void setSubject3(double subject3) {
		this.subject3 = subject3;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	

}
