package kr.ac.kopo.day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.SimpleAttributeSet;

/*
 calendar ==> 추상 클래스
 객체 얻기 위하여 Calendar.getInstance() 활용
	
 static으로 접근하여 사용한다. (getInstance()가 static으로 되어있다.)
 객체 얻기 : static Calendar getInstance()
 정보 추출 : int get(int calendarField)
 
 YEAR, MONTH, DATE, DAY_OF_MONTH, DAY_OF_WEEK, HOUR, HOUR_Of_DAY, MINUTE, SECOND
 
 void set(int year, int month, int date, int hour, int minute)
 
 Date getTime() //현재의 객체와 같은 날짜를 가진 Date객체 반환
 void setTime(Date d)
 
 int getActualMaximum(int calendarField) 해당 항목의 최대값 얻기
 */

/*
abstract class Calendar {
	static Calendar getInstance() {
		return new GregorianCalendar();
	}
}*/

public class CalendarMain {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println("c : " + c);

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		// int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);// 요일이 숫자로 나온다.==>일요일(1) ~ 토요일(7)

		String[] dayArr = { "", "일", "월", "화", "수", "목", "금", "토" };

		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 " + dayArr[day] + "요일 입니다.");

		// 2021년 5월 5일은 무슨요일?
		c.set(2021, 5-1, 5);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021년 5월 5일은 " + dayArr[day]);
		
		//5월의 마지막날이 몇일???
		int lastDay = c.getActualMaximum(Calendar.DATE);
		
		System.out.println("5월은 " + lastDay +"일로 구성되어있습니다.");

		//2월의 마지막날이 몇일?
		c.set(c.MONTH, 2-1);
		lastDay = c.getActualMaximum(Calendar.DATE);
		System.out.println("2월은 " + lastDay +"일로 구성되어있습니다.");
		
		Date d = c.getTime();
		
		String pattern = "yyyy년 MM월 dd일 E요일 hh시 mm분 ss초 ";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	
		String simpleDate = sdf.format(new Date());
		System.out.println(simpleDate);
		
		String data = sdf.format(d);
		System.out.println(data);
	}

}
