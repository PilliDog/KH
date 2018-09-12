package kh.java.api.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
	private String[] day = {"일", "월", "화", "수", "목", "금", "토"};

	public static void main(String[] args) {
		//new CalendarTest().test1();
		//new CalendarTest().test2();
		new CalendarTest().test3();
	}
	
	/**
	 * Date(), Date(long timeMillis)를 제외한 대부분의 생성자가 deprecated(더이상 사용되지 않는)이므로 사용해서는 안된다.
	 */
	public void test3()
	{
		Date d = new Date();
		System.out.println(d);
		
		//1. Calendar -> Date
		Calendar cal = Calendar.getInstance();
		Date d2 = new Date(cal.getTimeInMillis());
		System.out.println(d2);
		
		//2. Date -> Calendar
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d);
		System.out.println(cal2);
	}
	
	/**
	 * 두 날짜간의 차이
	 */
	public void test2()
	{
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		date1.set(2018, 8-1, 13);
//		System.out.println(date1);
		System.out.println(date1.get(Calendar.YEAR) + "/" + 
						   (date1.get(Calendar.MONTH) + 1) + "/" +
						   date1.get(Calendar.DATE) + "(" + 
						   day[date1.get(Calendar.DAY_OF_WEEK)-1] + ")");
		
		//날짜 차이 구하기(초단위)
		//UnixTime : 1970년 1월 1일 자정 이후로 쌓여진 milisecond를 표현. long타입으로 표현
		long diff = date2.getTimeInMillis() - date1.getTimeInMillis();
		System.out.println(diff);
		//일단위로 변환 : 밀리초 > 초 > 분 > 시간 > 하루
		diff = diff/1000/60/60/24;
		System.out.println("개강한지 " + diff + "일 지났습니다.");
	}
	
	public void test1()
	{
//		Calendar today = new Calendar();
		Calendar today = Calendar.getInstance();
		Calendar today_ = new GregorianCalendar();
		
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH) + 1);
		System.out.println(today.get(Calendar.DATE));
		
		//요일
		String dayOfweek = "";
		switch(today.get(Calendar.DAY_OF_MONTH))
		{
		case 1: dayOfweek = "일"; break;
		case 2: dayOfweek = "월"; break;
		case 3: dayOfweek = "화"; break;
		case 4: dayOfweek = "수"; break;
		case 5: dayOfweek = "목"; break;
		case 6: dayOfweek = "금"; break;
		case 7: dayOfweek = "토"; break;
		}
		System.out.println("오늘은 " + dayOfweek + "요일입니다.");
		
		//월의 몇번째 요일
		System.out.println("오늘은 이번달의 " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		//시각
		String am_pm = today.get(Calendar.AM_PM) == 0 ? "오전" : "오후";
		System.out.println(am_pm 
						 + today.get(Calendar.HOUR) + ":"
						 + today.get(Calendar.MINUTE) + ":"
						 + today.get(Calendar.SECOND));
		
		//@실습문제 : 24시간 hh:mm:ss
		int hour, minute, second;
		Calendar now = Calendar.getInstance();
		
		hour = now.get(Calendar.HOUR_OF_DAY);
		String hh = hour<10?"0" + hour:""+hour;
		minute = now.get(Calendar.MINUTE);
		String mm = minute<10?"0"+minute:""+minute;
		second = now.get(Calendar.SECOND);
		String ss = second<10?"0"+second:""+second;
		
		System.out.println(hour + ":" + minute + ":" + second);
		
	}

}
