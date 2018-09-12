package com.api.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		int y, d, mon, h, m, s;
		Calendar cal = Calendar.getInstance();
		y = cal.get(Calendar.YEAR);
		mon = (cal.get(Calendar.MONTH) +1);
		d = cal.get(Calendar.DATE);
		h = cal.get(Calendar.HOUR);
		m = cal.get(Calendar.MINUTE);
		s = cal.get(Calendar.SECOND);
		
		System.out.println(y + "년 " + mon + "월 " + d + "일 " + h + "시 " + m + "분 " + s + "초");
		
	}

}
