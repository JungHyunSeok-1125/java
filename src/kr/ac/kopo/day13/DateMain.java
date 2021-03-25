package kr.ac.kopo.day13;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {

		// 오늘은 2021년 3월 24일 입니다.
		Date d = new Date();
		System.out.println("d : " + d);
		System.out.println("d : " + d.toString());

		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		
		// d.toString()호출하는 것과 동일하다
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 입니다.");
	}

}
