package kr.ac.kopo.day13.homework;

import java.util.Calendar;

public class CalendarMaker {

	String[] dayArr = { "", "일", "월", "화", "수", "목", "금", "토" };
	Calendar c = Calendar.getInstance();

	/**
	 * 1 ~ 12월까지 출력
	 * 
	 * @param year
	 */
	public void printYearCalendar(int year) {

		for (int i = 1; i <= 12; i++) {
			printMonthCalendar(year, i);
		}
	}

	/**
	 * 특정 월 출력
	 * 
	 * @param year  해당 년도
	 * @param month 해당 달
	 */
	public void printMonthCalendar(int year, int month) {

		int date = 1;
		c.set(year, month - 1, date);// Calendar 설정

		System.out.println("<<" + year + "년 " + month + "월>>");
		printWeek();// LINE :: 요일 출력
		firstDayTab(c.get(Calendar.DAY_OF_WEEK)); // 요일 탭

		for (int i = 0; i < getLastDay(c); i++) {

			System.out.print((i + 1) + "\t");
			isSaturday(c.get(Calendar.DAY_OF_WEEK));// LINE :: 토요일인지 확인
			date++;
			c.set(year, month - 1, date);// Calendar 재설정
		} // FOR :: 반복 종료

		System.out.println("\n======================================================");
	}

	/**
	 * 해당월이 몇일까지 있는지 계산
	 * 
	 * @param 캘린더 객체
	 */
	public int getLastDay(Calendar c) {

		int lastDay = c.getActualMaximum(Calendar.DATE);
		// LINE :: 몇일인지 계산
		return lastDay;
	}

	/**
	 * 토요일이면 줄내림
	 * 
	 * @param a
	 */
	public void isSaturday(int a) {
		if (a == 7) {
			System.out.println();
		}
	}

	/**
	 * 1일에 무슨요일 시작 탭
	 * 
	 * @param first
	 */
	public void firstDayTab(int first) {
		for (int i = 0; i < first - 1; i++) {
			System.out.print("\t");
		}
	}

	/**
	 * 요일출력 (+ 토요일에서 줄내림)
	 */
	public void printWeek() {
		for (int i = 1; i < dayArr.length; i++) {
			System.out.print(dayArr[i] + "\t");
			if (i == dayArr.length - 1)
				System.out.println();
		}
	}

	// =====================교수님 코드================================
	public void showDayByYear(int year) {

		for (int month = 1; month <= 12; month++) {
			showDayByMonth(year, month);
		}
	}

	public void showDayByMonth(int year, int month) {

		c.set(year, month - 1, 1);
		// LINE :: year - month - 1 로 날짜 변경

		// month/1의 요일??
		int week = c.get(Calendar.DAY_OF_WEEK);

		// month의 마지막 날수??
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("<<" + year + "년 " + month + "월 >>");
		showDay(week, lastDay);
	}

	private void showDay(int week, int lastDay) {
		System.out.println("--------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------");
		int cnt = 0;
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
			cnt ++;
		}
		for (int day = 1; day <= lastDay; day++) {
			System.out.print(day + "\t");
			if (++cnt % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
	}

}
