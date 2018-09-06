package kh.java.api.format.text.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
 */
/*
###참고
날짜format		설명
------------------------------------------------
%tF			날짜를 yyyy-mm-dd 형식으로 포맷
%tT			날짜의 시각을 HH:MM:SS 형식으로 포맷.
------------------------------------------------------
%tY			4자리 년도만 출력 
%ty			2자리 년도
%tB			월의 이름(January, February, March...)
%tm			월을 01,02,03 ~12 로 출력
%td			일수를 1~31 로 출력
%te			%td 와 같음.
%tA			요일명 출력
---------------------------------------------------
%tp			오전, 오후를 출력
%tk			시간을 0~23 으로 출력.
%tl			시간을 1~12 로 출력.
%tM			분을 00 ~59 로 출력.
%tS			초를 00 ~ 59 로 출력.
-----------------------------------------------------
%tZ			타임존을 출력 (한국은 KST)
---------------------------------------------------
*/
public class DateFormatTest {

	public static void main(String[] args) {
//		new DateFormatTest().test1();
		new DateFormatTest().test2();
	}
	
	public void test2()
	{
		Date d = new Date();
		//System.out.println(d.getMonth()+1+"/"+d.);
		//printf메소드
		System.out.printf("%tm/%td%n", d, d);
		
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tm/%td%n", cal, cal);
	}
	
	public void test1()
	{
		Date d = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd E요일 hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("a H:mm:ss:SSS");
		SimpleDateFormat sdf3 = new SimpleDateFormat("K:mm a");
		
		String r1 = sdf1.format(d);
		String r2 = sdf2.format(d);
		String r3 = sdf3.format(d);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}//test1

}
